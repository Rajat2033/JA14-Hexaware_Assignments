package com.hexaware.springbootcustomermicro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomerIllegalArgumentException extends ResponseStatusException {

	public CustomerIllegalArgumentException(HttpStatus status, String msg) {
		super(status, msg);
		// TODO Auto-generated constructor stub
	}

}
