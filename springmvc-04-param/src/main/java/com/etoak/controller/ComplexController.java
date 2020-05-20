package com.etoak.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etoak.bean.Student;

@Controller
@RequestMapping("/complex")
public class ComplexController {
	@GetMapping("/bean")
	public String bean(Student student,Model model) {
		System.out.println(student);
		model.addAttribute("result2","使用Model传值");
		return "forward:/simple/simple?id=321";
	}
	@PostMapping("/array")
	public String array(String[] hobby,ModelMap model) {
		for(String hobbyStr :hobby) {
			System.out.println(hobbyStr);
		}
		model.addAttribute("result","使用ModelMap传参");
		return "param";
	}
	@PostMapping("/list")
	public String array(Student student,Map<String,Object> map) {
		List<String> hobbyList=student.getHobbyList();
		if(!CollectionUtils.isEmpty(hobbyList)) {
			hobbyList.forEach(x->System.out.println(x));
		}
		map.put("result","使用ModelMap传参");
		return "param";
	}
	@PostMapping(value="/map",produces= {"text/plain"})
	@ResponseBody
	public String map(Student student) {
		System.out.println(student.getStuMap());
		
		return "success";
	}
}
