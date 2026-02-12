package com.example.SalesSavvy.Controllers;

import com.example.SalesSavvy.Entities.OrderStatus;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Service.OrderService;
import io.micrometer.common.util.internal.logging.InternalLogLevel;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "http://localhost:5174",allowCredentials = "true")
@RequestMapping("api/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

@GetMapping
    public ResponseEntity<Map<String, Object>> getOrdersForUser(HttpServletRequest request){
        try {
            //Retrieve the authenticated user from the request
            User authenticatedUser = (User) request.getAttribute("authenticatedUser");


            //Fetch orders for the user via the service layer
            Map<String,Object> response = orderService.getOrderForUser(authenticatedUser);

            //Return the response with HTTP 200 OK
            return  ResponseEntity.ok(response);

        } catch (IllegalArgumentException e){
            //Handle cases where user details are invalid or missing
            return ResponseEntity.status(400).body(Map.of("error",e.getMessage()));

        } catch (Exception e){
            //Handle unexcepted exceptions
            e.printStackTrace();
            return ResponseEntity.status(500).body(Map.of("error","An unexpected error occurred"));
        }
    }
}
