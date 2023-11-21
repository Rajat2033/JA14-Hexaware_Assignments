package com.hexaware.springrestdemo.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestdemo.beans.Product;
import com.hexaware.springrestdemo.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

	@Autowired
	IProductService service;

	@PostMapping("/add")

	public Product addData(@RequestBody Product product) {

		return service.addProduct(product);
	}

	@PutMapping("/update")

	public Product updateData(@RequestBody Product product) {
		return service.updateProduct(product);
	}

	@DeleteMapping("/delete/{productid}")

	public String deleteData(@PathVariable int productid) {
	service.deleteProductById(productid);
	return "Records Deleted";

	}

	@GetMapping("/getbyid/{pid}")
	public Product getByid(@PathVariable int pid) {
		return service.getProductById(pid);
	}

	@GetMapping("/getall")

	public Set<Product> getData() {

		return service.getAllProducts();
	}

}
