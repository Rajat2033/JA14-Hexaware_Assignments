package com.hexaware.springbootcustomermicro.service;

import java.util.List;

import com.hexaware.springbootcustomermicro.dto.CustomerDTO;
import com.hexaware.springbootcustomermicro.dto.CustomersProductsVO;
import com.hexaware.springbootcustomermicro.entities.Customer;

public interface ICustomerService {

	public Customer addCustomer(CustomerDTO customerdto);

	public CustomerDTO getByid(int cid);

	public List<Customer> getAllCustomers();
	
	public CustomersProductsVO getCustomerAndProductById(int cId);

}
