package com.example.SalesSavvy.ServiceImpIemetations;

import com.example.SalesSavvy.Entities.Category;
import com.example.SalesSavvy.Entities.Product;
import com.example.SalesSavvy.Entities.ProductImages;
import com.example.SalesSavvy.Repositories.CategoryRepository;
import com.example.SalesSavvy.Repositories.ProductImageRepository;
import com.example.SalesSavvy.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductImageRepository productImageRepository;
    private final CategoryRepository categoryRepository;

    public ProductService(ProductRepository productRepository, ProductImageRepository productImageRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.productImageRepository = productImageRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Product> getProductsByCategory(String categoryName){
        if(categoryName !=null  && !categoryName.isEmpty()){
            Optional<Category> categoryOpt=categoryRepository.findByCategoryName(categoryName);
            if(categoryOpt.isPresent()){
                Category category=categoryOpt.get();
                return productRepository.findByCategory_CategoryId(category.getCategoryId());
            } else {
                throw new RuntimeException("Catergory not found");
            }
        } else {
            return productRepository.findAll();
        }
    }

    public List<String> getProductImages(Integer productId){
        List<ProductImages> productImages=productImageRepository.findByProduct_ProductId(productId);
        List<String> imageUrls= new ArrayList<>();
        for(ProductImages images:productImages){
            imageUrls.add(images.getImageUrl());
        }
        return imageUrls;
    }

}
