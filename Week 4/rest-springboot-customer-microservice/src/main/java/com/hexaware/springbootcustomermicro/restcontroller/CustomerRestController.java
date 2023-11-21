package com.hexaware.springbootcustomermicro.restcontroller;




import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springbootcustomermicro.dto.CustomerDTO;
import com.hexaware.springbootcustomermicro.dto.CustomersProductsVO;
import com.hexaware.springbootcustomermicro.entities.Customer;
import com.hexaware.springbootcustomermicro.exceptions.CustomerIllegalArgumentException;
import com.hexaware.springbootcustomermicro.exceptions.CustomerNotFoundException;
import com.hexaware.springbootcustomermicro.service.ICustomerService;

@RestController
@RequestMapping("/api/consumer")
public class CustomerRestController {
	@Autowired
	ICustomerService service;

	Logger logger = org.slf4j.LoggerFactory.getLogger(CustomerRestController.class);

	@PostMapping("/add")
	public Customer getCustomer(@RequestBody CustomerDTO customerdto) {
		logger.info("i am insert info");
		logger.warn("i am insert warn");
		logger.trace("I am  insert Trace");
		Customer customer = service.addCustomer(customerdto);
		if (customer.getcName() == null) {
			throw new CustomerIllegalArgumentException(HttpStatus.NO_CONTENT,
					"You have not given name Kindly give name");
		}
		return customer;
	}

	@GetMapping("/getall")
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		logger.info("i am getall info");
		logger.warn("i am getall warn");
		logger.trace("I am  getall Trace");
		return service.getAllCustomers();
	}

	@GetMapping("/get/{cid}")
	public CustomerDTO findId(@PathVariable int cid) throws CustomerNotFoundException {
		logger.info("i am get info");
		logger.warn("i am get warn");
		logger.trace("I am  get Trace");
		CustomerDTO customerdto = service.getByid(cid);
		if (customerdto.getcId() == 0) {
			throw new CustomerNotFoundException(HttpStatus.NOT_FOUND, "Customer does not added" + cid);
		}
		return customerdto;
	}

	@GetMapping("/getcustomersproducts/{cid}")
	public CustomersProductsVO getCustomerProducts(@PathVariable int cid)
	{
		return service.getCustomerAndProductById(cid);
	}
	
}
