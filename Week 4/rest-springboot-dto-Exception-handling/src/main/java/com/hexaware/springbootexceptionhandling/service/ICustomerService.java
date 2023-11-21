package com.hexaware.springbootexceptionhandling.service;

import java.util.List;

import com.hexaware.springbootexceptionhandling.DTO.CustomerDTO;
import com.hexaware.springbootexceptionhandling.beans.Customer;

public interface ICustomerService {

	public Customer addCustomer(CustomerDTO customerdto);
	
	public CustomerDTO getByid(int cid);
	
	public List<Customer> getAllCustomers();
	
}
