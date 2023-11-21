package com.hexaware.springrestdemo.dao;

import java.util.Set;

import com.hexaware.springrestdemo.beans.Product;

public interface IProductDao {
	public Product addProduct(Product product); 
	public Product updateProduct(Product product); 
	
	public String deleteProductById(int productid); 
	public Product getProductById(int productid); 
	public Set<Product> getAllProducts();
}
