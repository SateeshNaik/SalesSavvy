package com.example.SalesSavvy.Controllers;

import com.example.SalesSavvy.DTO.LoginRequest;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Service.AuthService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5174")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest, HttpServletResponse response){
        try {
            User user=authService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
            String token= authService.generateToken(user);

            Cookie cookie=new Cookie("authToken", token);
            cookie.setHttpOnly(true);
            cookie.setSecure(false);
            cookie.setPath("/");
            cookie.setMaxAge(3600);
            cookie.setDomain("localhost");
            response.addCookie(cookie);

            response.addHeader("Set-Cookie", String.format("authToken=%s; HttpOnly; Path=/; Max-Age=3600; SameSite=None", token));
            Map<String,Object> responseBody = new HashMap<>();
            responseBody.put("message", "Login successful");
            responseBody.put("role", user.getRole().name());
            responseBody.put("username", user.getUsername());
            return ResponseEntity.ok(responseBody);
        } catch (RuntimeException e){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(Map.of("error",e.getMessage()));
        }
    }


    @PostMapping("/logout")
    public ResponseEntity<Map<String,String>> logout(HttpServletRequest request, HttpServletResponse response){
        try {
            User user= (User) request.getAttribute("authenticatedUser");

            //Delete logout operation to the service layer
            authService.logout(user);

            //clear the authenticated token cookie
            Cookie cookie=new Cookie("authToken",null);
            cookie.setHttpOnly(true);
            cookie.setMaxAge(0);
            cookie.setPath("/");
            response.addCookie(cookie);

            //Success response
            Map<String,String> responseBody = new HashMap<>();
            responseBody.put("message","Logout Successful");
            return ResponseEntity.ok(responseBody);
        } catch (RuntimeException e){
            Map<String,String> errorResponse = new HashMap<>();
            errorResponse.put("message","Logout Failed");
            return ResponseEntity.status(500).body(errorResponse);
        }
    }

}
