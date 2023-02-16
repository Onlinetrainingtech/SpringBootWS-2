package com.example.springbootrestP4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
	ArrayList<Product>products=new ArrayList<>();
	@Override
	public List<Product> findAll() {
		
		
		
		//add products to the list
		
		products.add(new Product(100,"mobilee1","mobile4",1000.0,6));
		products.add(new Product(101,"mobilee2","mobile5",2000.0,7));
		products.add(new Product(102,"mobilee3","mobile6",3000.0,8));
		products.add(new Product(103,"mobilee4","mobile7",4000.0,9));
		
		return products;
	}
	//Reterive based on index
	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}
 
	//Reterive based on id value
	public Product findBy(int id)  
	{  
	for(Product p1:products)  
	{  
	if(p1.getId()==id)  
	return p1;  
	}  
	return null;  
	}  
	
	//Reterive based on name value
	public Product findbyname(String name)  
	{  
	for(Product p1:products)  
	{  
	if(p1.getName().equals(name))  
	return p1;  
	}  
	return null;  
	}  
	

}
