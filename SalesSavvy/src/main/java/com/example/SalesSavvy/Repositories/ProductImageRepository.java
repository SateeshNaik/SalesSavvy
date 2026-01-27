package com.example.SalesSavvy.Repositories;

import com.example.SalesSavvy.Entities.ProductImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductImageRepository extends JpaRepository<ProductImages,Integer> {
    List<ProductImages> findByProduct_ProductId(Integer productId);
}
