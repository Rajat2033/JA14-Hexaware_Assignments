package com.hexaware.springAOP.Aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspects {//logs means writing or printing messages
// here expression is kanown as Point cut 
	//@Before is advice and 
	@AfterReturning("execution(*  com.hexaware.springAOP.Service.BankService.amount())")
	public void afterReturning()
	{
		
	}
	@AfterReturning(pointcut= "afterReturningPointCut()",returning = "acno")
	public void afterReturningAmount(int acno)
	{
	
		System.out.println("Getting Value"+acno);
	}
	@Before("execution(*  com.hexaware.springAOP.Service.BankService.fundTransfer())")
	public void beforelogs()
	{
		System.out.println("Before Fund Transfer Application Logs");
	}
	@After("execution(*  com.hexaware.springAOP.Service.BankService.deposit())")
	public void afterlogs()
	{
		System.out.println("after  deposit Application Logs");
	}
}
