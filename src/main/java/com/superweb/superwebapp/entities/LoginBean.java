package com.superweb.superwebapp.entities;


import lombok.Data;

@Data
public class LoginBean {
	
	 String uname;
	 String password;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	 
	
}
