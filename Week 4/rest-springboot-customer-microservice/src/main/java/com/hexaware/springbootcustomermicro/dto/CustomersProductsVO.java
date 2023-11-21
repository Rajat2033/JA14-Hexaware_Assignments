package com.hexaware.springbootcustomermicro.dto;

import com.hexaware.springbootcustomermicro.entities.Customer;

public class CustomersProductsVO {
	
	private CustomerDTO customer;
	private ProductDTO product;
	public CustomersProductsVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomersProductsVO(CustomerDTO customer, ProductDTO product) {
		super();
		this.customer = customer;
		this.product = product;
	}
	public CustomerDTO getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerDTO customer) {
		this.customer = customer;
	}
	public ProductDTO getProduct() {
		return product;
	}
	public void setProduct(ProductDTO product) {
		this.product = product;
	}


}
