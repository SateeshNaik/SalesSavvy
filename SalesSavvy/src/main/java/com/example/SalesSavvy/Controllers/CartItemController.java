package com.example.SalesSavvy.Controllers;

import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.UserRepository;
import com.example.SalesSavvy.Service.CartIItemService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:5174",allowCredentials = "true")
@RequestMapping("/api/cart")
public class CartItemController {
    @Autowired
    private CartIItemService cartIItemService;

    @GetMapping("/items")
    public ResponseEntity<Map<String, Object>> getCartItems(HttpServletRequest request) {
        User user = (User) request.getAttribute("authenticatedUser");
        if (user == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Map.of("error", "User not authenticated"));
        }
        Map<String, Object> cartItems =
                cartIItemService.getCartItemsCount(user.getUserId());
        return ResponseEntity.ok(cartItems);
    }
    @PutMapping("/update")
    public ResponseEntity<Void> updateCartItemQuantity(HttpServletRequest request, @RequestBody Map<String, Object> body) {

        User user = (User) request.getAttribute("authenticatedUser");
        if (user == null) {
            throw new RuntimeException("User not authenticated");
        }

        Object productIdObj = body.get("productId");
        Object quantityObj = body.get("quantity");

        if (productIdObj == null || quantityObj == null) {
            throw new IllegalArgumentException("productId and quantity are required");
        }

        int productId = (int)productIdObj;
        int quantity = (int)quantityObj;

        cartIItemService.updateCartItemQuantity(user.getUserId(), productId, quantity);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteCartItem(
            HttpServletRequest request,
            @RequestBody Map<String, Object> body) {

        User user = (User) request.getAttribute("authenticatedUser");
        if (user == null) {
            throw new RuntimeException("User not authenticated");
        }

        Object productIdObj = body.get("productId");
        if (productIdObj == null) {
            throw new IllegalArgumentException("productId is required");
        }

        int productId = (int)productIdObj;

        cartIItemService.deleteCartItem(user.getUserId(), productId);

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/items/count")
    public ResponseEntity<Integer> getCartItemsCount(@RequestParam String username, HttpServletRequest request) {

        User user = (User) request.getAttribute("authenticatedUser");

        if(user==null){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        int count = cartIItemService.getCartItemsTotalCount(user.getUserId());
        return ResponseEntity.ok(count);
    }

}
