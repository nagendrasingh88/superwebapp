package com.superweb.superwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superweb.superwebapp.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
