package com.example.demo.product;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public void createProduct(Product product) {

        productRepository.save(product);
    }
}
