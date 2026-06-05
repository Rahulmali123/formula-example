package com.javatechie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.entity.Product;
import com.javatechie.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}

	/*
	 * public List<ProductResponse> getAllProducts() { return
	 * productRepository.findAll().stream()
	 * .map(ProductResponseMapper::map).collect(Collectors.toList()); }
	 */
	
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

}