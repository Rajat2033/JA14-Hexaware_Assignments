package com.hexaware.springbootexceptionhandling.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springbootexceptionhandling.DTO.CustomerDTO;
import com.hexaware.springbootexceptionhandling.beans.Customer;
import com.hexaware.springbootexceptionhandling.repository.CustomerRepository;

@Service
public class CustomerserviceImpl implements ICustomerService {
	Logger logger = org.slf4j.LoggerFactory.getLogger(CustomerserviceImpl.class);
	@Autowired
	CustomerRepository repo;

	@Override
	public Customer addCustomer(CustomerDTO customerdto) {
	

		logger.info("i am insert info");
		logger.warn("i am insert warn");
		logger.trace("I am  insert Trace");
		Customer customer = new Customer();

		// converting dto data to entity
		customer.setcName(customerdto.getcName());
		customer.setcCity(customerdto.getcCity());
		customer.setcNumber(customerdto.getcNumber());
		return repo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public CustomerDTO getByid(int cid) {
		logger.info("i am get info");
		logger.warn("i am get warn");
		logger.trace("I am  get Trace");
		Customer customer = repo.findById(cid).orElse(new Customer());
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setcId(customer.getcId());
		customerDTO.setcCity(customer.getcCity());
		customerDTO.setcNumber(customer.getcNumber());
		customerDTO.setcName(customer.getcName());
		return customerDTO;
	}

}
