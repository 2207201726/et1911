package com.etoak;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.etoak.action.UserAction;
import com.etoak.bean.User;

public class XmlTest {

	public static void main(String[] args) {
		ApplicationContext ioc=new ClassPathXmlApplicationContext("spring.xml");
		UserAction userAction = ioc.getBean(UserAction.class);
		User user = userAction.getById(100);
		System.out.print(user.getName());
	}

}
