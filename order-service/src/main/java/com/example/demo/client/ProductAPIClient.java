package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.controller.Product;

@Component
//@FeignClient(name="product-service", url="http://localhost:8100/,http://localhost:8200/")
@FeignClient(name="product-service")
public interface ProductAPIClient {
	
	@GetMapping("/{orderId}")
	public Product getOrderProduct(@PathVariable("orderId") String orderId);

}
