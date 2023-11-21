package com.hexaware.springAOP.Aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Authenticate {

	
	@Pointcut("execution(*  com.hexaware.springAOP.Service.BankService.deposit())")
	public void authentication()// pointcuts
	{
	}

	@Pointcut("execution(*  com.hexaware.springAOP.Service.BankService.withdrawal())")
	public void authorization()// pointcuts
	{

	}
	
	@Before("authentication() || authorization()")
	public void authenticationAuthorization()
	{
		System.out.println("User Login both methods ");
	}

}
