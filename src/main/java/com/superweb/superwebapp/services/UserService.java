package com.superweb.superwebapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superweb.superwebapp.entities.LoginBean;
import com.superweb.superwebapp.entities.User;
import com.superweb.superwebapp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userrepository;
	

	public List<User> validate(LoginBean loginBean) {
		
		String loginname = loginBean.getUname();
		String loginpass = loginBean.getPassword();
		try {
			List<User> list =userrepository.authenticate(loginname, loginpass);
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
	
	
}
