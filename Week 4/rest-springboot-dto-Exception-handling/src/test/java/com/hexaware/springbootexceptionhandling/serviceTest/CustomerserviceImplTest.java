package com.hexaware.springbootexceptionhandling.serviceTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springbootexceptionhandling.DTO.CustomerDTO;
import com.hexaware.springbootexceptionhandling.beans.Customer;
import com.hexaware.springbootexceptionhandling.service.ICustomerService;

@SpringBootTest
class CustomerserviceImplTest {

	@Autowired
	ICustomerService service;
	
	
	@Test
	void testAddCustomer() {
		CustomerDTO customerdto=new CustomerDTO();
		customerdto.setcName("Rajat Darvhekar");
		customerdto.setcNumber(98347);
		customerdto.setcCity("Nagpur");
		
		Customer customer=service.addCustomer(customerdto);
		
		assertNotNull(customer);
	}

	@Test
	void testGetAllCustomers() {
		fail("Not yet implemented");
	}

	@Test
	void testGetByid() {
		fail("Not yet implemented");
	}

}
