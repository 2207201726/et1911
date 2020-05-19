package com.etoak.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hello")
public class HelloController {
	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("param name - " + name);
		
		request.setAttribute("result","Hello "+ name);
		return "hello/index";
	}
}
