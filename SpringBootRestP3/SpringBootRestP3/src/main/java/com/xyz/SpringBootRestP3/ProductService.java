package com.xyz.SpringBootRestP3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{
    public List<Product>findAll()
    {
    	ArrayList<Product>products=new ArrayList<>();
    	
    	//addproduct to the list
    	
    	products.add(new Product(100,"mobile","mobile4",1000.00,6));
    	products.add(new Product(101,"mobile","mobile4",2000.00,7));
    	products.add(new Product(102,"mobile","mobile4",3000.00,8));
    	return products;
    }
}
