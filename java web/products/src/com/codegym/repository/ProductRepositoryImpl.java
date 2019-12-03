package com.codegym.repository;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepositoryImpl implements ProductRepository {
    private static final Map<Integer,Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"GTFS","Fender Stratocaster",1200));
        products.put(2,new Product(2,"143","cuong",23));
        products.put(3,new Product(3,"546","nhi",1234));
        products.put(4,new Product(4,"324","man",3423));
        products.put(5,new Product(5,"GTFS","thanh",123123));

    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findByID(int id) {
        Product product =products.get(id);
        return product;
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(),product);
    }
}
