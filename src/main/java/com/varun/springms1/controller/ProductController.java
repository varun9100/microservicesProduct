package com.varun.springms1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.varun.springms1.model.Product;
import com.varun.springms1.repo.ProductRepo;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	
	@Autowired
	public ProductRepo repo;
	
	@RequestMapping(value = "/createProduct", method = RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		
		return repo.save(product);
		
	}

}
