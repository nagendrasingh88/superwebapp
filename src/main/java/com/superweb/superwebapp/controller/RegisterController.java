package com.superweb.superwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superweb.superwebapp.entities.User;
import com.superweb.superwebapp.repository.UserRepository;

@RestController
@RequestMapping("/app")
public class RegisterController {

	@Autowired
	private UserRepository userRepository;

	@PostMapping("/register")
	public User registUser(@RequestBody User newUser) {
		User user = userRepository.save(newUser);
		System.out.println("User Registered Successfully");
		return user;
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id) {
		
		System.out.println(userRepository.findById(id).get());
		return userRepository.findById(id).get();
	}

}
