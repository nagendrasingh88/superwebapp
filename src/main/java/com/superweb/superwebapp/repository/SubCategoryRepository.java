package com.superweb.superwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.superweb.superwebapp.entities.Category;
import com.superweb.superwebapp.entities.SubCategory;

@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long>{

	/*
	 * @Query(value = "select * from category where id=?1", nativeQuery = true)
	 * public Category getById(long id);
	 */
}
