package com.example.springbootrestP4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController
{
   @Autowired
   //private IProductService p1;
   private ProductService p1;

   
   @GetMapping(value="/product")
   public List<Product>getProduct()
   {
	   List<Product>products=p1.findAll();
	   return products;
   }
//   @GetMapping(path="/product/{id}")  
//   public  Product getSpecificId(@PathVariable int id)  
//   {  
//	  return p1.findById(id); 
//   }  
   @GetMapping(path="product/{name}")
   public Product getSpecificName(@PathVariable String name)
   {
	   return p1.findbyname(name);
   }
   
//   @GetMapping(path="/product/{id}")  
//   public  Product getSpecificIds(@PathVariable int id)  
//   {  
//	  return p1.findBy(id); 
//   }
  }  

