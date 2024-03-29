package com.codegym;

import com.codegym.repository.ProductRepository;
import com.codegym.repository.ProductRepositoryImpl;
import com.codegym.service.ProductServiceImpl;
import com.codegym.service.Productservice;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    public Productservice productservice(){
        return new ProductServiceImpl();
    }
    @Bean
    public ProductRepository productRepository(){
        return new ProductRepositoryImpl();
    }
}
