package com.example.SalesSavvy.Service;

import com.example.SalesSavvy.Entities.CartItem;
import com.example.SalesSavvy.Entities.Order;
import com.example.SalesSavvy.Entities.OrderItems;
import com.example.SalesSavvy.Entities.OrderStatus;
import com.example.SalesSavvy.Repositories.CartRepository;
import com.example.SalesSavvy.Repositories.OrderItemRepository;
import com.example.SalesSavvy.Repositories.OrderRepository;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PaymentService {

    @Value("${razorpay.key_id}")
    private String razorPayKeyId;

    @Value("${razorpay.key_secret}")
    private String razorPayKeySecret;

    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;
    private final CartRepository cartRepository;

    public PaymentService(OrderRepository orderRepository, OrderItemRepository orderItemRepository, CartRepository cartRepository) {
        this.orderRepository = orderRepository;
        this.orderItemRepository = orderItemRepository;
        this.cartRepository = cartRepository;
    }
    @PostConstruct
    public void init() {
        System.out.println(" PaymentService initialized by Spring");
    }

    @Transactional
    public String createOrder(int userId, BigDecimal totalAmount, List<OrderItems> cartItems) throws RazorpayException {

        if (razorPayKeyId == null || razorPayKeySecret == null) {
            throw new RuntimeException("Razorpay keys are not loaded from application.properties");
        }

        System.out.println("=== RAZORPAY DEBUG ===");
        System.out.println("Key ID        : " + razorPayKeyId);
        System.out.println("Key Secret    : " + razorPayKeySecret);
        System.out.println("Secret length : " + (razorPayKeySecret == null ? 0 : razorPayKeySecret.length()));
        System.out.println("=====================");

        //create Razorpay client
        RazorpayClient razorpayClient = new RazorpayClient(razorPayKeyId, razorPayKeySecret);


        //prepare Razorpay order request
        var orderRequest = new JSONObject();
        orderRequest.put("amount",totalAmount.multiply(BigDecimal.valueOf(100)).intValue());
        orderRequest.put("currency","INR");
        orderRequest.put("receipt","txn_" + System.currentTimeMillis());


        //Create Razorpay order
        com.razorpay.Order razorpayOrder = razorpayClient.orders.create(orderRequest);




        //Save order details in the database
        Order order=new Order();
        order.setOrderId(razorpayOrder.get("id"));
        order.setUserId(userId);
        order.setTotalAmount(totalAmount);
        order.setStatus(OrderStatus.PENDING);
        order.setCreatedAt(LocalDateTime.now());
        orderRepository.save(order);
        return razorpayOrder.get("id");

    }
    @Transactional
    public boolean verifyPayment(String razorpayOrderId,String razorpayPaymentId,String razorpaySignature,int userId) {
        try {
            //Prepare signature validation attributes
            JSONObject attributes = new JSONObject();
            attributes.put("razorpay_order_id",razorpayOrderId);
            attributes.put("razorpay_payment_id",razorpayPaymentId);
            attributes.put("razorpay_signature",razorpaySignature);

            //verify Razorpay signature
            boolean isSignatureValid = com.razorpay.Utils.verifyPaymentSignature(attributes,razorpayPaymentId);

            if (isSignatureValid) {
                //Update order status to SUCCESS
                Order order=orderRepository.findById(razorpayOrderId).orElseThrow(() -> new RuntimeException("Order not found"));
                order.setStatus(OrderStatus.SUCCESS);
                order.setUpdateAT(LocalDateTime.now());
                orderRepository.save(order);

                //Fetch cart items for the user
                List<CartItem> cartItems=cartRepository.findCartItemsWithProductDetails(userId);

                //Save order items
                for(CartItem cartItem:cartItems){
                    OrderItems orderItems=new OrderItems();
                    orderItems.setOrder(order);
                    orderItems.setProductId(cartItem.getProduct().getProductId());
                    orderItems.setQuantity(cartItem.getQuantity());
                    orderItems.setPricePerUnit(cartItem.getProduct().getPrice());
                    orderItems.setTotalPrice(cartItem.getProduct().getPrice().multiply(BigDecimal.valueOf(cartItem.getQuantity())));
                    orderItemRepository.save(orderItems);
                }

                //Clear users cart
                cartRepository.deleteAllCartItemsByUserId(userId);
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
            System.err.println("Payment Verification Failed: " + e.getMessage());
            e.printStackTrace();
            return false;
    }
    }

    public void saveOrderItems(String orderId, List<OrderItems> items){
        Order order=orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
        for (OrderItems items1:items){
            items1.setOrder(order);
            orderItemRepository.save(items1);
        }
    }
}
