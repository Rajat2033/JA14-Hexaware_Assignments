package com.hexaware.springbootexceptionhandling.restcontroller;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springbootexceptionhandling.beans.Customer;
@SpringBootTest
class CustomerRestControllerTest {

	Logger logger=LoggerFactory.getLogger(CustomerRestControllerTest.class);
	
	String baseUrl="http://localhost:8080/api/customers";
	@Autowired
	RestTemplate getRestTemplate;
	@Test
	void testGetCustomer() {
		
	}

	@Test
	void testGetCustomers() {
		
	}


	@Test
	void testFindId() {
		int cId=1;
		ResponseEntity<Customer> response=getRestTemplate.getForEntity(baseUrl+"/get/"+cId,Customer.class);
		Customer customer=response.getBody();
		logger.info("Heelo Customer:"+customer.toString());
		
		assertTrue(customer.getcId()>0);
	}

}
