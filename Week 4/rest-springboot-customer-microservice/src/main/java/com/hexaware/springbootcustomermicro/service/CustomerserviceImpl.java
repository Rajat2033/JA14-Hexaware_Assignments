package com.hexaware.springbootcustomermicro.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springbootcustomermicro.dto.CustomerDTO;
import com.hexaware.springbootcustomermicro.dto.CustomersProductsVO;
import com.hexaware.springbootcustomermicro.dto.ProductDTO;
import com.hexaware.springbootcustomermicro.entities.Customer;
import com.hexaware.springbootcustomermicro.reepository.CustomerRepository;

@Service
public class CustomerserviceImpl implements ICustomerService {
	Logger logger = org.slf4j.LoggerFactory.getLogger(CustomerserviceImpl.class);
	@Autowired
	CustomerRepository repo;

	@Autowired
	RestTemplate restTemplate;
	
	@Override
	public Customer addCustomer(CustomerDTO customerdto) {

		Customer customer = new Customer();

		// converting dto data to entity
		customer.setcId(customerdto.getcId());
		customer.setcName(customerdto.getcName());
		customer.setcCity(customerdto.getcCity());
		customer.setcNumber(customerdto.getcNumber());
		customer.setPid(customerdto.getPid());
		return repo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		return repo.findAll();
	}

	@Override
	public CustomerDTO getByid(int cid) {
		Customer customer = repo.findById(cid).orElse(new Customer());
		CustomerDTO customerDTO = new CustomerDTO();
		customerDTO.setcId(customer.getcId());
		customerDTO.setcCity(customer.getcCity());
		customerDTO.setcNumber(customer.getcNumber());
		customerDTO.setcName(customer.getcName());
		customerDTO.setPid(customer.getPid());
		return customerDTO;
	}
	
	public CustomersProductsVO getCustomerAndProductById(int cId)
	{
		CustomerDTO customerDTO=getByid(cId);
		int proId=customerDTO.getPid();
		ProductDTO productDTO=restTemplate.getForObject("http://localhost:8282/api/products/getById/"+proId,ProductDTO.class);
		CustomersProductsVO customerAndProducts=new CustomersProductsVO();
		customerAndProducts.setCustomer(customerDTO);
		customerAndProducts.setProduct(productDTO);
		return customerAndProducts;
		
	}

}
