package com.hexaware.springbootmicroservice.service;

import java.util.List;

import com.hexaware.springbootmicroservice.dto.ProductDTO;
import com.hexaware.springbootmicroservice.entities.Products;

public interface IProductService {
	public  Products   addProduct(ProductDTO productDTO);
	 
	 public  ProductDTO  getById(int pid);
	 
	 public List<Products>  getAllProducts();

}
