package com.example.SalesSavvy.Controllers;

import com.example.SalesSavvy.Entities.OrderItems;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.UserRepository;
import com.example.SalesSavvy.Service.PaymentService;
import com.razorpay.RazorpayException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins ="http://localhost:5174",allowCredentials = "true")
@RequestMapping("/api/payment")
public class PaymentController {


    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createPaymentOrder(@RequestBody Map<String, Object> requestBody, HttpServletRequest request){
        System.out.println("Received request at /api/payment/create");
        System.out.println("Body: " + requestBody);
        try {
            //Fetch authenticated user
            User user=(User) request.getAttribute("authenticatedUser");

            if (user == null) {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User context not found. Please log in again.");
            }
            System.out.println("Processing order for User ID: " + user.getUserId());

            //Extract totalAmount and cartItems from the request body
            BigDecimal totalAmount = new BigDecimal(requestBody.get("totalAmount").toString());
            List<Map<String,Object>> cartItemsRaw = (List<Map<String, Object>>) requestBody.get("cartItems");

            //Convert cartItemsRaw to List<orderItems>
            List<OrderItems> cartItems = cartItemsRaw.stream().map(item->{
                OrderItems orderItems=new OrderItems();
                orderItems.setProductId((Integer)item.get("productId"));
                orderItems.setQuantity((Integer)item.get("quantity"));
                BigDecimal pricePerUnit = new BigDecimal(item.get("price").toString());
                orderItems.setPricePerUnit(pricePerUnit);
                orderItems.setTotalPrice(pricePerUnit.multiply(BigDecimal.valueOf((Integer)item.get("quantity"))));
                return orderItems;
            }).collect(Collectors.toList());

//            List<OrderItems> cartItems = new ArrayList<>();
//            for(Map<String,Object> map:cartItemsRaw){
//                OrderItems orderItems=new OrderItems();
//                orderItems.setProductId((Integer)map.get("productId"));
//                orderItems.setQuantity((Integer)map.get("quantity"));
//                BigDecimal pricePerUnit = new BigDecimal(map.get("price").toString());
//                orderItems.setPricePerUnit(pricePerUnit);
//                orderItems.setTotalprice(pricePerUnit.multiply(BigDecimal.valueOf((Integer)map.get("quantity"))));
//                cartItems.add(orderItems);
//            }


            //Call the payment service to create a Razorpay order
            String razorpayOrderId = paymentService.createOrder(user.getUserId(),totalAmount, cartItems);
            return ResponseEntity.ok(razorpayOrderId);
        }catch (RazorpayException e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error creating Razorpay order: " + e.getMessage());
        } catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("invalid request data: "+ e.getMessage());
        }
    }

    @PostMapping("/verify")
    public ResponseEntity<String> verifyPayment(@RequestBody Map<String, Object> requestBody, HttpServletRequest request) {
        try {
            User user = (User) request.getAttribute("authenticatedUser");

            if (user == null) {
                // Log this so you know if it's a session issue
                System.out.println("Verification Failed: No authenticated user found in request attributes.");
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("User not authenticated");
            }

            // Defensive programming: check if keys exist in the map
            String razorpayOrderId = (String) requestBody.get("razorpayOrderId");
            String razorpayPaymentId = (String) requestBody.get("razorpayPaymentId");
            String razorpaySignature = (String) requestBody.get("razorpaySignature");

            if (razorpayOrderId == null || razorpayPaymentId == null || razorpaySignature == null) {
                return ResponseEntity.badRequest().body("Missing Razorpay payment details in request body");
            }

            boolean isVerified = paymentService.verifyPayment(razorpayOrderId, razorpayPaymentId, razorpaySignature, user.getUserId());

            if (isVerified) {
                return ResponseEntity.ok("Payment verified successfully");
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Signature verification failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error: " + e.getMessage());
        }
    }
}
