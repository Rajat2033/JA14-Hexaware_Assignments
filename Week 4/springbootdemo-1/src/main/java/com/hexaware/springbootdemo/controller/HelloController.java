package com.hexaware.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootdemo.beans.Employee;
import com.hexaware.springbootdemo.beans.Product;

@Controller
@RequestMapping("/controller")
public class HelloController {
	
	@RequestMapping("/hey")
	@ResponseBody
	public String readData()
	{
		return "<h1> Hello World</h1>";
	}
	@RequestMapping("/data")
	@ResponseBody
	public String getData()
	{
		Product p=new Product(101, "Puma Shoes", 50000.0);
		System.out.println(p.toString());
		return p.toString();
	}
	@RequestMapping("/var")
	@ResponseBody
	public Employee getMethod()
	{
		return new Employee(101, "Rajat", 5000.0);
	}

}
