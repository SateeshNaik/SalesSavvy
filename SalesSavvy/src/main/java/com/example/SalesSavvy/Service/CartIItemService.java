package com.example.SalesSavvy.Service;

import com.example.SalesSavvy.Entities.CartItem;
import com.example.SalesSavvy.Entities.Product;
import com.example.SalesSavvy.Entities.ProductImages;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CartIItemService {

    private final CartRepository cartRepository;
    private final CartItemsRepository cartItemsRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;
    private final ProductImageRepository productImageRepository;


    public CartIItemService(CartRepository cartRepository, CartItemsRepository cartItemsRepository, UserRepository userRepository, ProductRepository productRepository, ProductImageRepository productImageRepository) {
        this.cartRepository = cartRepository;
        this.cartItemsRepository = cartItemsRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.productImageRepository = productImageRepository;
    }

    //Get Cart Items for a User
    public Map<String, Object> getCartItemsCount(int userId) {
        List<CartItem> cartItems = cartRepository.findCartItemsWithProductDetails(userId);
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

        Map<String, Object> response = new HashMap<>();
        response.put("username", user.getUsername());
        response.put("role", user.getRole().toString());

        List<Map<String, Object>> products = new ArrayList<>();
        double overallTotalPrice = 0;

        for (CartItem cartItem : cartItems) {
            Product product = cartItem.getProduct();

            // 🔹 Fetch image
            List<ProductImages> images = productImageRepository.findByProduct_ProductId(product.getProductId());

            String imageUrl = (images != null && !images.isEmpty()) ? images.get(0).getImageUrl() : "default-image-url";

            Map<String, Object> productDetails = new HashMap<>();
            productDetails.put("product_id", product.getProductId());
            productDetails.put("name", product.getDescription());   // 🔹 name only
            productDetails.put("image_url", imageUrl);
            productDetails.put("price_per_unit", product.getPrice());
            productDetails.put("quantity", cartItem.getQuantity());

            double totalPrice =
                    cartItem.getQuantity() * product.getPrice().doubleValue();

            productDetails.put("total_price", totalPrice);

            products.add(productDetails);
            overallTotalPrice += totalPrice;
        }

        Map<String, Object> cart = new HashMap<>();
        cart.put("products", products);
        cart.put("overall_total_price", overallTotalPrice);

        response.put("cart", cart);
        return response;
    }


    public int getCartItemsTotalCount(int userId){
        return cartRepository.countTotalItems(userId);
    }



    public void updateCartItemQuantity(int userId,int productId,int quantity){
        User user=userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
        Product product =productRepository.findById(productId).orElseThrow(() -> new IllegalArgumentException("Product not found"));

        //Fetch cart item for its userId and productId
        Optional<CartItem> existingItem =cartItemsRepository.findByUserAndProduct(userId,productId);

        if(existingItem.isPresent()){
            CartItem cartItem=existingItem.get();
            if(quantity==0){
                deleteCartItem(userId,productId);
            } else {
                cartItem.setQuantity(quantity);
                cartRepository.save(cartItem);
            }
        }


    }

    public void deleteCartItem(int userId,int productId){
        User user=userRepository.findById(userId).orElseThrow(() ->new IllegalArgumentException("User not found"));
        Product product=productRepository.findById(productId).orElseThrow(() -> new IllegalArgumentException("Product not found"));
        cartRepository.deleteCartItem(userId,productId);
    }



}
