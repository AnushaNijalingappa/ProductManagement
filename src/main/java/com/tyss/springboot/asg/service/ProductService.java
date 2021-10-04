package com.tyss.springboot.asg.service;

import java.util.List;

import com.tyss.springboot.asg.entity.Product;


public interface ProductService {

	public List<Product> findAll();
	
	public Product findById(int theId);
	
	public Product save(Product theEmployee);
	
	public void deleteById(int theId);
	
	
	
	
	
}
