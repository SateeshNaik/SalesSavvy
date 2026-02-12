package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.CartItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.beans.Transient;
import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<CartItem,Integer> {
    @Query("""
        select c
        from CartItem c
        join fetch c.product
        where c.user.userId = :userId
    """)
    List<CartItem> findCartItemsWithProductDetails(@Param("userId") int userId);

    @Modifying
    @Transactional
    @Query("""
        delete from CartItem c
        where c.user.userId = :userId
        and c.product.productId = :productId
    """)
    void deleteCartItem(@Param("userId") int userId, @Param("productId") int productId
    );

    @Query("select COALESCE(sum(c.quantity),0) from CartItem c where c.user.userId= :userId")
    int countTotalItems(int userId);

    @Modifying
    @Transactional
    @Query("delete from CartItem c where c.user.userId=:userId")
    void deleteAllCartItemsByUserId(int userId);
}