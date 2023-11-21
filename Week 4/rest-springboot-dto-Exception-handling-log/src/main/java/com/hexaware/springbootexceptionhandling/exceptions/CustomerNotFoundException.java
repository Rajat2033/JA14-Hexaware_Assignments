package com.hexaware.springbootexceptionhandling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomerNotFoundException extends ResponseStatusException {

	public CustomerNotFoundException(HttpStatus status, String reason) {
		super(status, reason);
		// TODO Auto-generated constructor stub
	}

}
