package com.superweb.superwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superweb.superwebapp.beans.ProductBean;
import com.superweb.superwebapp.entities.Product;
import com.superweb.superwebapp.entities.SubCategory;
import com.superweb.superwebapp.repository.ProductRepository;
import com.superweb.superwebapp.repository.SubCategoryRepository;

@RestController()
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/add")
	public void add(@RequestBody ProductBean productBean) {
		String pname = productBean.getName();
		Product product = new Product();
		product.setName(pname);
		double price = productBean.getPrice();
		product.setPrice(price);
		long subcatid = productBean.getSubcatid();
		
		SubCategory subCategory=subCategoryRepository.getById(subcatid);
		product.setSubCategory(subCategory);
		productRepository.save(product);
		System.out.println("Product created sucussfully");
		System.out.println(product);
		
	}
	
	@GetMapping("/viewall")
	public List<Product> viewAll() {
		List<Product> list = productRepository.findAll();
		
		return list;
	}
}
