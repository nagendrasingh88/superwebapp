package com.superweb.superwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superweb.superwebapp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
