package com.hexaware.jdbctemplate.DAO;

import java.util.List;

import com.hexaware.jdbctemplate.beans.Product;

public interface IProductDAO {

	public int insertQuery(Product p);
	public int updateQuery(Product p);
	public int deleteQuery(int pid);
	public List<Product> getAllData();
	
	
}
