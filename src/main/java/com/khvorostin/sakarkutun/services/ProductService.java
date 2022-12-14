package com.khvorostin.sakarkutun.services;

import com.khvorostin.sakarkutun.entities.Product;
import com.khvorostin.sakarkutun.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List< Product > findAll() {
        return productRepository.findAll();
    }
}
