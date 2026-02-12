package com.example.SalesSavvy.Service;

import com.example.SalesSavvy.Entities.CartItem;
import com.example.SalesSavvy.Entities.Product;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.CartItemsRepository;
import com.example.SalesSavvy.Repositories.ProductRepository;
import com.example.SalesSavvy.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartService {

    private final CartItemsRepository cartItemsRepository;
    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public CartService(
            CartItemsRepository cartItemsRepository,
            UserRepository userRepository,
            ProductRepository productRepository
    ) {
        this.cartItemsRepository = cartItemsRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    public void addToCart(int userId, int productId, int quantity) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new IllegalArgumentException("Product not found"));

        Optional<CartItem> existingItem =
                cartItemsRepository.findByUserAndProduct(userId, productId);

        if (existingItem.isPresent()) {
            CartItem cartItem = existingItem.get();
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
            cartItemsRepository.save(cartItem);
        } else {
            CartItem newItem = new CartItem(user, product, quantity);
            cartItemsRepository.save(newItem);
        }
    }
}
