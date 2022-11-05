package com.khvorostin.sakarkutun.controllers;

import com.khvorostin.sakarkutun.entities.Product;
import com.khvorostin.sakarkutun.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {

    private final ProductService productService;

    @GetMapping
    public List< Product > findAll() {
        return productService.findAll();
    }
}
