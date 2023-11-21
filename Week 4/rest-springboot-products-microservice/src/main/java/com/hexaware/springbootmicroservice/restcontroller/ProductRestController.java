package com.hexaware.springbootmicroservice.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springbootmicroservice.dto.ProductDTO;
import com.hexaware.springbootmicroservice.entities.Products;
import com.hexaware.springbootmicroservice.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {
	
	@Autowired
	IProductService service;
	
	@PostMapping("/addpro")
	public Products addProducts(@RequestBody ProductDTO productDTO)
	{
		return service.addProduct(productDTO);
	}
	
	@GetMapping("/getById/{pid}")
	public ProductDTO findByid(@PathVariable int pid)
	{
		return service.getById(pid);
	}
	
	@GetMapping("/getall")
	public List<Products> getAllData()
	{
		return service.getAllProducts();
	}
	
	

}
