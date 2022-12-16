package com.xyz.SpringBootB15Rest;

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
		
		products.add(new Product(100,"mobile1","mobile4",1000.00,6));
		products.add(new Product(101,"mobile2","mobile5",2000.00,6));
		products.add(new Product(102,"mobile3","mobile6",3000.00,7));
		return products;
	}

}
