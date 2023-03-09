package com.example.springbootrestN3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private IProductService productService;
	
	@RequestMapping(value="/product")
	public List<Product>getProduct()
	{
		List<Product>products=productService.findAll();
		return products;
	}
}
