package com.UserManagement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserManagement.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	//Finder Methods
	
	List<Product> findByName(String name);
	
	List<Product> findByNameAndPrice(String name, Double price);
	
	List<Product> findByPriceGreaterThan(Double price);
	
	List<Product>findByProductDescriptionContaining(String productDescription);
	
	List<Product> findByPriceBetween(Double price1 , Double price2);
	
	List<Product> findByProductDescriptionLike(String productDescription);
	
	List<Product> findByIdIn(List<Long> id);
	
	
	
	

}
