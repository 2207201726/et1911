package com.etoak.service;

import org.springframework.stereotype.Service;

import com.etoak.bean.User;
//@Service
public class UserService {
	public User getById(int id) {
		return new User(id,"et1911");
	}
}
