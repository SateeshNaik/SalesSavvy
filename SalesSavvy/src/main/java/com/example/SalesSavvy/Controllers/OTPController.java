package com.example.SalesSavvy.Controllers;


import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.UserRepository;
import com.example.SalesSavvy.Service.OTPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/otp")
public class OTPController {
        @Autowired
        private OTPService otpService;

        @Autowired
        private UserRepository userRepository;

        // 1 Send OTP to user's email
        @PostMapping("/send")
        public ResponseEntity<String> sendOtp(@RequestParam String email) {

            Optional<User> user = userRepository.findByEmail(email);

            if (user == null) {
                return ResponseEntity.badRequest().body("User not found");
            }

            otpService.sendOTP(user);
            return ResponseEntity.ok("OTP sent successfully");
        }

        //  Verify OTP
        @PostMapping("/verify")
        public ResponseEntity<String> verifyOtp(@RequestBody Map<String, Object> request) {

            String email = (String) request.get("email");
            Integer otp = (Integer) request.get("otp");

            Optional<User> user = userRepository.findByEmail(email);

            if (user.isEmpty()) {
                return ResponseEntity.badRequest().body("User not found");
            }

            boolean isValid = otpService.verifyOTP(user, otp);

            if (!isValid) {
                return ResponseEntity.badRequest().body("Invalid or expired OTP");
            }

            return ResponseEntity.ok("OTP verified successfully");
        }

}

