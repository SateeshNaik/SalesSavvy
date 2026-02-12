package com.example.SalesSavvy.Adminservices;

import com.example.SalesSavvy.Entities.Category;
import com.example.SalesSavvy.Entities.Product;
import com.example.SalesSavvy.Entities.ProductImages;
import com.example.SalesSavvy.Repositories.CategoryRepository;
import com.example.SalesSavvy.Repositories.ProductImageRepository;
import com.example.SalesSavvy.Repositories.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

@Service
public class AdminProductService {
    private final ProductRepository productRepository;
    private final ProductImageRepository productImageRepository;
    private  final CategoryRepository categoryRepository;

    public AdminProductService(ProductRepository productRepository, ProductImageRepository productImageRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.productImageRepository = productImageRepository;
        this.categoryRepository = categoryRepository;
    }



    public Product addProductWithImage(String name, String description, Double price, Integer stocks, Integer categoryId, String imageUrl) {

        //step-1 check if category exists using categoryId
        Optional<Category> category=categoryRepository.findById(categoryId);

        //if exists create product and all the values to all attributes to product
        if(category.isEmpty()){
            throw new IllegalArgumentException("Invalid categoryId");
        }
        Product product=new Product(name,description, BigDecimal.valueOf(price),stocks,category.get(), LocalDateTime.now(),LocalDateTime.now());

        //save product
        Product savedProduct=productRepository.save(product);

        //check if image url is null or blank or empty
        //if image url exists create ProductImage and set values to attributes and save ProductImages
        if(imageUrl!=null && imageUrl.isEmpty()){
            ProductImages image= new ProductImages(savedProduct,imageUrl);
            productImageRepository.save(image);
        }
        return savedProduct;

    }

    public void deleteProduct(Integer productId){
        if(!productRepository.existsById(productId)){
            throw  new IllegalArgumentException("product not found");
        }
        //Delete associated product images
            productImageRepository.deleteByProductId(productId);

        //delete the product
        productRepository.deleteById(productId);
    }

}
