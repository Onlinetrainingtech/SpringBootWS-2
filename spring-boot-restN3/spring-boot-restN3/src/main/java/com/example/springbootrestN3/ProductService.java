package com.example.springbootrestN3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
   public List<Product> findAll()
   {
	   ArrayList<Product>products=new ArrayList<>();
	   
	   //add product to the list
	   
	   
	   products.add(new Product(101,"mobile1","mobile4",1000.00,6));
	   products.add(new Product(102,"mobile2","mobile5",2000.00,7));
	   products.add(new Product(103,"mobile3","mobile6",3000.00,8));
	   
	   return products;
   }
}
