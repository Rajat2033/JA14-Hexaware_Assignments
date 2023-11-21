package com.hexaware.springAOP.Service;

import org.springframework.stereotype.Service;

@Service
public class BankService {
	
	public void login()
	{
		System.out.println("Kindly Login");
	}
	
	public void deposit()
	{
		System.out.println ("Amount Deposited");
	}
	public void fundTransfer()
	{
		System.out.println("Fund Tranfered Successfully");
	}
	
	public int Amount(int a)
	{
		return a;
	}
	public void 	withdrawal()
	{
	System.out.println("Withdrawed amount");
	}
	public int amount(int acno)
	{
		return 50000;
	}
	

	
}
