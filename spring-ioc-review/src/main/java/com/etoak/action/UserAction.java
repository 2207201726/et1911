package com.etoak.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.etoak.bean.User;
import com.etoak.service.UserService;
//@Controller
public class UserAction {
	//@Autowired
	private UserService userService;
	public User getById(int id) {
		return userService.getById(id);
	}
	/* public UserService getUserService() { return userService; } */
	public void setUserService(UserService userService) { 
		this.userService = userService; }
	
	
}
