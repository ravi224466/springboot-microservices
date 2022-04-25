package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.client.ProductAPIClient;

@RestController
public class OrderController {

	
	@Autowired
	ProductAPIClient apiClient;
	
	@GetMapping("/{orderId}")
	public Product getOrderProduct(@PathVariable String orderId) {
		
		HashMap<String,String> uriVariables = new HashMap<>();
		uriVariables.put("orderId", orderId);
		System.out.println("*** orderId  "+ orderId);
		return new RestTemplate().getForObject("http://localhost:8100/{orderId}", Product.class, uriVariables);
	}
	
	
	@GetMapping("/feign/{orderId}")
	public Product getOrderProductByFeignClient(@PathVariable String orderId) {
		
		
		return  apiClient.getOrderProduct(orderId);
	}
}
