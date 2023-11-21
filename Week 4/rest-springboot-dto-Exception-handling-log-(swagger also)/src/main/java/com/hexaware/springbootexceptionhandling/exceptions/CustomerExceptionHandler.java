package com.hexaware.springbootexceptionhandling.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomerExceptionHandler {

	@ResponseStatus
	@ExceptionHandler({ CustomerIllegalArgumentException.class, CustomerNotFoundException.class })
	public ResponseEntity<String> handleAnyException(Exception e) {
		/* return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST); */

		return new ResponseEntity<String>(e.toString(), HttpStatus.BAD_REQUEST);
	}
	/*
	 * public ResponseEntity<String> handleAnyException(Exception e) { return new
	 * ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
	 * 
	 * return new ResponseEntity<String>(e.toString(),HttpStatus.BAD_REQUEST); }
	 */

}
