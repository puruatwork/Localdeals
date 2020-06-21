package com.geekreboot.localdeal.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.geekreboot.localdeal.dto.ProductDetailsDto;
import com.geekreboot.localdeal.dto.ProductDto;
import com.geekreboot.localdeal.dto.QuotesDto;
import com.geekreboot.localdeal.service.ProductService;

@Controller
@RequestMapping("/")
public class ProductApi {
	@Autowired
	private ProductService productService;

	@GetMapping(value = "/products")
	public ResponseEntity<List<ProductDetailsDto>> getAllProducts() {
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	@GetMapping(value ="/quote")
	public ResponseEntity<List<QuotesDto>> getQuotes(@RequestParam long productId){
		return ResponseEntity.ok(productService.getQuotes(productId));
	}
}
