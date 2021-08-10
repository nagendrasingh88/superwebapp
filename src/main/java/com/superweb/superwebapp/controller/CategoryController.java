package com.superweb.superwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superweb.superwebapp.beans.CategoryBean;
import com.superweb.superwebapp.entities.Category;
import com.superweb.superwebapp.repository.CategoryRepository;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@PostMapping("/add")
	public void add(@RequestBody CategoryBean categoryBean) {
	
		String catname = categoryBean.getName();
		Category cat= new Category();
		cat.setName(catname);
		System.out.println(cat);
		categoryRepository.save(cat);
		
	}
	
	@GetMapping("/viewall")
	
	public List<Category> viewAll() {
		
		List<Category> list=categoryRepository.findAll();
		
		return list;
	}
}
