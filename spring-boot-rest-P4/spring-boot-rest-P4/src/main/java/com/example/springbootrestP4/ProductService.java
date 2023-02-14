package com.example.springbootrestP4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product>products=new ArrayList<>();
		
		//add products to the list
		
		products.add(new Product(100,"mobilee1","mobile4",1000.0,6));
		products.add(new Product(101,"mobilee2","mobile5",2000.0,7));
		products.add(new Product(102,"mobilee3","mobile6",3000.0,8));
		products.add(new Product(103,"mobilee4","mobile7",4000.0,9));
		
		return products;
	}

}
