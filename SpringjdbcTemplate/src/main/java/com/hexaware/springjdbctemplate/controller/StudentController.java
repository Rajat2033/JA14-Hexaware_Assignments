package com.hexaware.springjdbctemplate.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springjdbctemplate.beans.Students;
import com.hexaware.springjdbctemplate.service.IStudentService;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	IStudentService service;

	
	@GetMapping("/openform")
	public String openForm()
	{
		return "StudentData";
	}
	
	@RequestMapping(path="/data",method=RequestMethod.POST)
	@ResponseBody
	public String addstdData(HttpSession session, Students student)
	{
	int student1=service.addStudents(student);
		session.setAttribute("studentadd",student1);
		
		
	return "display.jsp";
		
	}

	

}
