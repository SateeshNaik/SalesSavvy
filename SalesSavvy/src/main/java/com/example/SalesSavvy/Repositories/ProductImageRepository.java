package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.ProductImages;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductImageRepository extends JpaRepository<ProductImages,Integer> {
    List<ProductImages> findByProduct_ProductId(Integer productId);

    @Modifying
    @Transactional
    @Query("DELETE FROM ProductImages pi WHERE pi.product.productId = :productId")
    void deleteByProductId(@Param("productId") Integer productId);
}
