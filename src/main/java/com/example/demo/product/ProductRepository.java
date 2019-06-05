package com.example.demo.product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface ProductRepository extends CrudRepository<Product, UUID> {
}
