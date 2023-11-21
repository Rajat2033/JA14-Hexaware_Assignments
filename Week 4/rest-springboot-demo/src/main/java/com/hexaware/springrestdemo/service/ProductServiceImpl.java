package com.hexaware.springrestdemo.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestdemo.beans.Product;
import com.hexaware.springrestdemo.dao.IProductDao;

@Service
public class ProductServiceImpl implements IProductService{

	Set<Product> set=new HashSet<Product>();
	@Autowired
	IProductDao dao;
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	@Override
	public String deleteProductById(int productid) {
		return dao.deleteProductById(productid);
	}

	@Override
	public Product getProductById(int productid) {
		// TODO Auto-generated method stub
		return dao.getProductById(productid);
	}

	@Override
	public Set<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

}
