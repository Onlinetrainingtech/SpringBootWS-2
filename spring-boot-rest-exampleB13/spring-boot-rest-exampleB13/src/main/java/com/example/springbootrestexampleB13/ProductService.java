package com.example.springbootrestexampleB13;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product>products=new ArrayList<>();
		
		products.add(new Product(100,"mobile1","mobile1",1000.00,6));
		products.add(new Product(101,"mobile2","mobile2",2000.00,7));
		products.add(new Product(102,"mobile3","mobile3",1000.00,8));
		
		return products;
	}
      
}
