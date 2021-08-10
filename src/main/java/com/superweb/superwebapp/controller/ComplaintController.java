package com.superweb.superwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superweb.superwebapp.beans.CompaintRequestBean;
import com.superweb.superwebapp.entities.Complaint;
import com.superweb.superwebapp.entities.Product;
import com.superweb.superwebapp.entities.User;
import com.superweb.superwebapp.repository.ComplaintRepository;
import com.superweb.superwebapp.repository.ProductRepository;
import com.superweb.superwebapp.repository.UserRepository;


@RestController
@RequestMapping("/complaint")
public class ComplaintController {
	
	@Autowired
	ComplaintRepository complaintRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/create")
	public void createComplaint(@RequestBody CompaintRequestBean compaintRequestBean) {
		
		String complainttxt =compaintRequestBean.getComplainttxt();
		long uid=compaintRequestBean.getUid();
		long pid=compaintRequestBean.getPid();
		
		 User user=userRepository.getById(uid);
		 
		 System.out.println(user);
		 
		 Product product=productRepository.getById(pid);
		 System.out.println(product);
		 
		 System.out.println("Complaint is "+complainttxt + " uid is "+uid+" pid is" + pid );
		 
		Complaint complaint=new Complaint();
		complaint.setComplaint(complainttxt);
		complaint.setUser(user);
		complaint.setProduct(product);
		
		complaintRepository.save(complaint);
	}
	
	@GetMapping("/viewallcom")
	public List<Complaint> viewAllcomp(){
		List<Complaint> list=complaintRepository.findAll();
		
		return list;
	}
}
