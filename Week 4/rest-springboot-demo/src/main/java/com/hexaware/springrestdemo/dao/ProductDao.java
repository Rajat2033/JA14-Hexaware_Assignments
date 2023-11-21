package com.hexaware.springrestdemo.dao;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.hexaware.springrestdemo.beans.Product;

@Repository
public class ProductDao implements IProductDao {

	Set<Product> set=new HashSet<Product>();
	
	@Override
	public Product addProduct(@RequestBody Product product) {
		set.add(product);
		return product;

	}

	@Override
	public Product updateProduct(Product product) {
		set.add(product);
		return product;
	}

	@Override
	public String deleteProductById(int productid) {
		set.remove(productid);
		return "data deleted";
		
	}

	@Override
	public Product getProductById(int productid) {
		Product product1=null;
		for(Product product:set)
		{
			if(product1.getId()==productid)
			{
				return product1;
			}
		}
		return product1;
	}

	@Override
	public Set<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return set;
	}
	
	

}
