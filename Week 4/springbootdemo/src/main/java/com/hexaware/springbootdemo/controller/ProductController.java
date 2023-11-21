package com.hexaware.springbootdemo.controller;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootdemo.beans.Product;

@Controller
@RequestMapping("/products")
public class ProductController {

	@RequestMapping(path = "/openform", method = RequestMethod.GET)
	public String openForm() {
		return "proadd";
	}

	/*
	 * @RequestMapping(path = "/addpro", method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String getProduct(HttpServletRequest request) { int pid
	 * = Integer.parseInt(request.getParameter("pid")); String pname =
	 * request.getParameter("pname"); double
	 * amount=Double.parseDouble(request.getParameter("pamount")); Product pro=new
	 * Product(pid, pname, amount); return
	 * "<h1 style='color : blue'>"+pro.toString()+"</h1>"; }
	 */
	
	@RequestMapping(path = "/addpro", method = RequestMethod.POST)
	
	public String addProduct(HttpSession session,@RequestParam int id,@RequestParam  String proName,@RequestParam  double amount )
	
	{
		Product product=new Product(id, proName, amount);
		session.setAttribute("pro", product);
		return "displayd";
		
	}
}
