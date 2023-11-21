package com.hexaware.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.services.HealthcareProviderServiceImpl;


@RestController
@RequestMapping("/provider")
public class HealthcareProviderRestController {
	
	@Autowired
	HealthcareProviderServiceImpl service;
	
	@GetMapping("/welcome")
	public String welcomePage()
	{
		return "Welcome to APES Hoapital provider";
	}
	
	@GetMapping()
	public 
	
	

}
