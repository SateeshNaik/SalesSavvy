package com.example.SalesSavvy.Adminservices;

import com.example.SalesSavvy.Entities.Role;
import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.JWTTokenRepository;
import com.example.SalesSavvy.Repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminUserService {

    private final UserRepository userRepository;
    private final JWTTokenRepository jwtTokenRepository;

    public AdminUserService(UserRepository userRepository,
                            JWTTokenRepository jwtTokenRepository) {
        this.userRepository = userRepository;
        this.jwtTokenRepository = jwtTokenRepository;
    }

    public User modifyUser(Integer userId, String username, String email, String role) {
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));

        if (username != null && !username.isBlank()) {
            existingUser.setUsername(username);
        }

        if (email != null && !email.isBlank()) {
            existingUser.setEmail(email);
        }

        if (role != null && !role.isBlank()) {
            existingUser.setRole(Role.valueOf(role));
        }

        // invalidate tokens after update
        jwtTokenRepository.deleteByUserId(userId);

        return userRepository.save(existingUser);
    }

    public User getUserById(Integer userId) {
        return userRepository.findById(userId)
                .orElseThrow(() ->
                        new IllegalArgumentException("User with id " + userId + " not found"));
    }
}
