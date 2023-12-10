package com.hexaware.challenge.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PlayerGlobalException {
	
	@ResponseStatus
	@ExceptionHandler({PlayerNotFoundException.class})
	public ResponseEntity<String> handlesAnyException(Exception e)
	{
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}

}
