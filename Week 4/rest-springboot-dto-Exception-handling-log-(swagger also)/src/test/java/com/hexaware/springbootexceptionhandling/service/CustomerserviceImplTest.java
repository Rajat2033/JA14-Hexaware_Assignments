package com.hexaware.springbootexceptionhandling.service;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springbootexceptionhandling.DTO.CustomerDTO;
import com.hexaware.springbootexceptionhandling.beans.Customer;

@SpringBootTest
class CustomerserviceImplTest {
	@Autowired
	ICustomerService service;
	

	@Test
	void testAddCustomer() {
		CustomerDTO dto=new CustomerDTO();
		dto.setcName("rajat");
		dto.setcCity("Nagpur");
		dto.setcNumber(98345);
	Customer customer=	service.addCustomer(dto);
	assertEquals("rajat", customer.getcName());
	}

	@Test
	void testGetAllCustomers() {
		
	}

	@Test
	void testGetByid() {
		
	}

}
