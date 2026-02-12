package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.JWTToken;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JWTTokenRepository extends JpaRepository<JWTToken,Integer> {
    JWTToken findByUser_UserId(int userId);

    Optional<JWTToken> findByToken(String token);

    @Modifying
    @Transactional
    @Query("delete from  JWTToken t where t.user.userId=:userId")
    void deleteByUserId(@Param("userId") int userId);
}
