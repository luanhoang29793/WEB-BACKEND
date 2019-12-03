package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface Productservice {
    List<Product> findAll();

    Product findByID(int id);

    void save (Product product);
}
