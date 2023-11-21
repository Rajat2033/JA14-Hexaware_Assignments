package com.hexaware.springbootexceptionhandling.exceptions;

public class InsurancePlanNotFoundException extends Exception {

	public InsurancePlanNotFoundException(String msg) {
		super(msg);
		System.out.println(msg);
	}
	
	

}
