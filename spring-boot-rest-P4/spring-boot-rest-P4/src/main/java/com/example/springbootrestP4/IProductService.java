package com.example.springbootrestP4;

import java.util.List;

public interface IProductService
{
   List<Product>findAll();
   public List<Product> findById(int id);
}
