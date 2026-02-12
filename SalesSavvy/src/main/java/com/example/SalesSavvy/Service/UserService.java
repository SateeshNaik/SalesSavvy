package com.example.SalesSavvy.Service;

import com.example.SalesSavvy.Entities.User;
import com.example.SalesSavvy.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
 public UserRepository repositories;
 public PasswordEncoder passwordEncoder;

 @Autowired
    public  UserService(UserRepository repositories) {
        this.repositories = repositories;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public User registerUser(User user) {
       if(repositories.findByUsername(user.getUsername()).isPresent()) {
           throw new RuntimeException("UserName is already taken");
       }

        if (repositories.findByEmail(user.getEmail()).isPresent()) {
            throw new RuntimeException("Email is already registered");
        }

       user.setPassword(passwordEncoder.encode(user.getPassword()));

       return repositories.save(user);
    }

}
