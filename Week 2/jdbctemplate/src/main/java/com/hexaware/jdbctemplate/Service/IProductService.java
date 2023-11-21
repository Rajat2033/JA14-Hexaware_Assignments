package com.hexaware.jdbctemplate.Service;

import java.util.List;

import com.hexaware.jdbctemplate.beans.Product;

public interface IProductService {

	public int insertQuery(Product p);
	public int updateQuery(Product p);
	public int deleteQuery(int pid);
	public List<Product> getAllData();
	
}
