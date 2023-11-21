package com.hexaware.springsecurity.restController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {

	@GetMapping("/get")
	public String getData()
	{
		return "Hello Trying spring security";
	}
}
