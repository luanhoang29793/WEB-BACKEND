package com.codegym.service;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements Productservice {
    @Autowired
    public ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findByID(int id) {
        return this.productRepository.findByID(id);
    }

    @Override
    public void save(Product product) {
this.productRepository.save(product);
    }
}
