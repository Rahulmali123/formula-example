package com.javatechie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.entity.Product;
import com.javatechie.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;
    
//    @PostMapping
//    public List<Product> addProducts(@RequestBody List<Product> products) {
//        productService.saveProducts(products);
//        return productService.getAllProducts();
//    }
    

	
	  @PostMapping public List<Product> addProducts(@RequestBody List<Product>
	  products) { return productService.saveProducts(products); }
	 
    
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }


}