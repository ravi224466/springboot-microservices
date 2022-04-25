package com.example.demo.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Product;

@RestController
public class ProductController {
	static HashMap<String,Product> productStore = new HashMap<>();
	static {
		productStore.put("10001",new Product(1000L,"Product-1",BigDecimal.valueOf(500),new Date(),new Date()));
		productStore.put("10002",new Product(1000L,"Product-2",BigDecimal.valueOf(500),new Date(),new Date()));
		productStore.put("10003",new Product(1000L,"Product-3",BigDecimal.valueOf(500),new Date(),new Date()));
		productStore.put("10004",new Product(1000L,"Product-4",BigDecimal.valueOf(500),new Date(),new Date()));
		productStore.put("10005",new Product(1000L,"Product-5",BigDecimal.valueOf(500),new Date(),new Date()));
	}
	
	@GetMapping("/{productId}")
	public Product getProduct(@PathVariable String productId) {
		System.out.println("**** Product Id"+ productId);

		return productStore.get(productId);
		
	}

}
