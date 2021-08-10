package com.superweb.superwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.superweb.superwebapp.beans.SubCategoryBean;
import com.superweb.superwebapp.entities.Category;
import com.superweb.superwebapp.entities.SubCategory;
import com.superweb.superwebapp.repository.CategoryRepository;
import com.superweb.superwebapp.repository.SubCategoryRepository;

@RestController
@RequestMapping("/subcat")
public class SubCategoryController {

	
	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	@Autowired
	CategoryRepository categoryRepository;
	
	@PostMapping("/add")
	public void add(@RequestBody SubCategoryBean subCategoryBean ) {
		String subname = subCategoryBean.getSubname();	
		
		SubCategory subcat= new SubCategory();
		subcat.setName(subname);
		
		long catid=subCategoryBean.getCatid();
		Category category = categoryRepository.getById(catid);
		subcat.setCategory(category);	
		subCategoryRepository.save(subcat);
		
		System.out.println(subcat);
	}
	
	@GetMapping("/viewallsubcat")
	public List<SubCategory> viewAll() {
		List<SubCategory> list=subCategoryRepository.findAll();
		System.out.println(list.size());
		System.out.println(list);
		return list;
		
	}
}
