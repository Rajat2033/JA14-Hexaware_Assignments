package com.hexaware.springbootmicroservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hexaware.springbootmicroservice.dto.ProductDTO;
import com.hexaware.springbootmicroservice.entities.Products;
import com.hexaware.springbootmicroservice.repository.ProductRepository;
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	ProductRepository repo;
	
	@Override
	public Products addProduct( ProductDTO productDTO) {
	Products product=new Products();
	product.setPid(productDTO.getPid());
	product.setPname(productDTO.getPname());
	product.setPrice(productDTO.getPrice());
	return repo.save(product);
	}

	@Override
	public ProductDTO getById(int pid) {
		Products product= repo.findById(pid).orElse(new Products());
	
		ProductDTO productDTO=new ProductDTO();
		productDTO.setPid(product.getPid());
		productDTO.setPname(product.getPname());
		productDTO.setPrice(product.getPrice());
		
		return productDTO;
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
 
}
