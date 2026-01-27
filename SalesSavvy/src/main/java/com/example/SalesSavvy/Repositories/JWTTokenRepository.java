package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.JWTToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JWTTokenRepository extends JpaRepository<JWTToken,Integer> {
    JWTToken findByUser_UserId(int userId);

    Optional<JWTToken> findByToken(String token);
}
