package com.tubespbo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tubespbo.entity.Product;

@Service
public class ProductService {

    private static List<Product> products = Arrays.asList(
            new Product(1L, "001", "Valorant", 50000),
            new Product(2L, "002", "Valorant", 50000),
            new Product(1L, "003", "Valorant", 50000),
            new Product(1L, "004", "Valorant", 50000));

    public List<Product> findAll() {
        return products;
    }

}
