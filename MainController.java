package com.example.rentacar.demoapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.rentacar.demoapplication.model.Student;
import com.example.rentacar.service.StudentService;
import com.example.rentacar.service.StudentServiceImpl;

@RestController
public class MainController {
	
	@Autowired(required=true)
	StudentServiceImpl studentService;
	
	@RequestMapping(value ="/hello" , method =RequestMethod.GET)
	public String greeting() {
		return "Hello Shailesh this is first Spring boot application";
	}
	
	@RequestMapping (value = "/hello" , method = RequestMethod.POST)
	public String secondGreetMethod() {
		return"Second Post Method called";
	}
	
	@RequestMapping  (value="/student" ,method = RequestMethod.POST)
	public Student save(@RequestBody Student student) {
		return studentService.save(student);
	
		
	}
	
	

}
