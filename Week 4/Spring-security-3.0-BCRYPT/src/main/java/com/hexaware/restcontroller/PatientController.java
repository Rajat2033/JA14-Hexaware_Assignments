package com.hexaware.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {
	
	@GetMapping("/welcome")
	public String welcomePage()
	{
		return "Welcome to APES Hospital Patient";
	}

}
