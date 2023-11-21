package com.hexaware.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootdemo.beans.Employee;

@Controller
@RequestMapping("/controller") //Acts as a get method
public class HelloController { //It will acts as a servlet

	@RequestMapping("/hello")
	@ResponseBody
	public String sayhello()
	{
		return "Hello Friends";
	}
	@RequestMapping("/get")
	@ResponseBody
	public String getData()
	{
		Employee emp=new Employee(101,"Rajat",20000.0);
		return emp.toString();
	}
}
