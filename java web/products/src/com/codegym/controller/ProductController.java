package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.Productservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    public Productservice productservice;
    @GetMapping("/product")
    public ModelAndView list(){
        List<Product> products =this.productservice.findAll();
        ModelAndView modelAndView = new ModelAndView("product/list");
        modelAndView.addObject("product",products);
        return modelAndView;
    }
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("product/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }
    @PostMapping("/new")
    public  ModelAndView createProduct(@ModelAttribute("product") Product product){
        int randomID =(int)()
    }
}
