package com.tyss.springboot.asg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.springboot.asg.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

	
	
}
