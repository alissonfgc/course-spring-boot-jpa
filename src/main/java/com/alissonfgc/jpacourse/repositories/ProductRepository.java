package com.alissonfgc.jpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alissonfgc.jpacourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
