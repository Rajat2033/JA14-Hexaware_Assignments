package com.hexaware.springrestcrud.exception;

import org.springframework.http.HttpStatus;

import com.hexaware.springrestcrud.entities.InsurancePlans;

public class InsurancePlanNotFoundException extends Exception {

	public InsurancePlanNotFoundException(String msg) {
		super(msg);
		System.out.println(msg);
	}
	
	

}
