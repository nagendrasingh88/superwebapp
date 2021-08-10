package com.superweb.superwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superweb.superwebapp.entities.LoginBean;
import com.superweb.superwebapp.entities.User;
import com.superweb.superwebapp.repository.UserRepository;
import com.superweb.superwebapp.services.UserService;



@RestController
@RequestMapping("/loginapp")
public class LoginController {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserService userService ;
	
	
	@PostMapping("/login")
	public List<User> loginUser(@RequestBody LoginBean loginBean) {
		List<User> list = this.userService.validate(loginBean);
		if(null!=list) {
		if(list.size()==0) {
			System.out.println("Invalid User");
		}else {
			list.get(0);
			System.out.println(list);
		}
		}
		return list;
		
	}
}
