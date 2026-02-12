package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItem, Integer> {

    @Query("""
             SELECT c FROM CartItem c
                WHERE c.user.userId = :userId
                AND c.product.productId = :productId
            """)
    Optional<CartItem> findByUserAndProduct(int userId, int productId);

    @Query("""
    SELECT COALESCE(SUM(c.quantity), 0)
    FROM CartItem c
    WHERE c.user.userId = :userId
""")
    int countTotalItems(@Param("userId") int userId);
}
