package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.OTP;
import com.example.SalesSavvy.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OTPRepository extends JpaRepository<OTP,Integer> {
        OTP findByUser(Optional<User> user);


}
