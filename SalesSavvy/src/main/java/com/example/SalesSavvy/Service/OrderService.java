package com.example.SalesSavvy.Service;

import com.example.SalesSavvy.Entities.OrderItems;
import com.example.SalesSavvy.Entities.Product;
import com.example.SalesSavvy.Entities.ProductImages;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.OrderItemRepository;
import com.example.SalesSavvy.Repositories.ProductImageRepository;
import com.example.SalesSavvy.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderService {

    private final OrderItemRepository orderItemRepository;
    private final ProductRepository productRepository;
    private final ProductImageRepository productImageRepository;

    public OrderService(OrderItemRepository orderItemRepository, ProductRepository productRepository, ProductImageRepository productImageRepository) {
        this.orderItemRepository = orderItemRepository;
        this.productRepository = productRepository;
        this.productImageRepository = productImageRepository;
    }

    public Map<String,Object> getOrderForUser(User user){
        //Fetch all successful order items for the user
        List<OrderItems> orderItems=orderItemRepository.findSuccessfulOrderItemsByUserId(user.getUserId());

        //Prepare the response map
        Map<String,Object> response=new HashMap<>();
        response.put("username",user.getUsername());
        response.put("role",user.getRole());

        //Transform order items into a list of product details
        List<Map<String,Object>> products=new ArrayList<>();
        for(OrderItems items:orderItems){
            Product product=productRepository.findById(items.getProductId()).orElse(null);
            if(product==null){
                continue;
            }

            //Fetch the product image(if available)
            List<ProductImages> images=productImageRepository.findByProduct_ProductId(product.getProductId());
            String imageUrl = images.isEmpty() ? null : images.get(0).getImageUrl();

            //create a product details map
            Map<String,Object> productDetails = new HashMap<>();
            productDetails.put("order_id",items.getOrder().getOrderId());
            productDetails.put("quantity",items.getQuantity());
            productDetails.put("total_price",items.getTotalPrice());
            productDetails.put("image_url",imageUrl);
            productDetails.put("product_id",product.getProductId());
            productDetails.put("name",product.getName());
            productDetails.put("description",product.getDescription());
            productDetails.put("price_per_unit",items.getPricePerUnit());
            products.add(productDetails);
        }

        //Add the products list to the response
        response.put("products",products);
        return response;
    }
}
