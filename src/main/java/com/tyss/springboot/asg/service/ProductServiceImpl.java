package com.tyss.springboot.asg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.tyss.springboot.asg.dao.ProductRepository;
import com.tyss.springboot.asg.entity.Product;



@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(int theId) {
		Optional<Product> result = productRepository.findById(theId);
		
		Product theProduct = null;
		
		if (result.isPresent()) {
			theProduct = result.get();
		}
		else {
			throw new RuntimeException("Did not find  id - " + theId);
		}
		
		return theProduct;
	}

	@Override
	public Product save(Product theProduct) {
		return productRepository.save(theProduct);
	}
	@Override
	public void deleteById(int theId) {
		productRepository.deleteById(theId);
	}


	
}






