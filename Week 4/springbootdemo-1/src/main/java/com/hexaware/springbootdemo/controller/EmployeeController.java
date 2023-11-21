package com.hexaware.springbootdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootdemo.beans.Employee;

@Component
@RequestMapping("/employee")
public class EmployeeController {
	
	
	
	@RequestMapping(path="/form",method = RequestMethod.GET)
	public String openForm()
	{
		return "addEmp";
	}
	
//	@RequestMapping(path="/add",method=RequestMethod.POST)
//	@ResponseBody
//	public String addEmpdata(HttpServletRequest request)
//	{
//		int eid=Integer.parseInt(request.getParameter("eid"));
//		String ename=request.getParameter("ename");
//		int esalary=Integer.parseInt(request.getParameter("esalary"));
//		Employee emp=new Employee(eid, ename, esalary);
//		return emp.toString();
//	}
	
	@RequestMapping(path="/add",method=RequestMethod.POST)
	@ResponseBody
	public String addEmpdata(HttpServletRequest request)
	{
		int eid=Integer.parseInt(request.getParameter("eid"));
		String ename=request.getParameter("ename");
		int esalary=Integer.parseInt(request.getParameter("esalary"));
		Employee emp=new Employee(eid, ename, esalary);
		return emp.toString();
	}


}
