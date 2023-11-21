package com.hexaware.springrestdemo.service;

import java.util.Set;

import com.hexaware.springrestdemo.beans.Product;

public interface IProductService {
	
	public Product addProduct(Product product); 
	public Product updateProduct(Product product); 
	
	public String deleteProductById(int productid); 
	public Product getProductById(int productid); 
	public Set<Product> getAllProducts();

}
