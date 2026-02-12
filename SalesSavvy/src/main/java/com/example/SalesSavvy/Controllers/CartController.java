package com.example.SalesSavvy.Controllers;

import com.example.SalesSavvy.Service.CartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/cart")
@CrossOrigin(origins = "http://localhost:5174", allowCredentials = "true")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public ResponseEntity<Void> addToCart(@RequestBody Map<String, Object> request) {

        int userId = (int) request.get("userId");
        int productId = (int) request.get("productId");
        int quantity = request.containsKey("quantity") ? (int) request.get("quantity") : 1;

        cartService.addToCart(userId, productId, quantity);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
