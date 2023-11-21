package com.hexaware.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hexaware.dto.Product;
import com.hexaware.entity.UserInfo;
import com.hexaware.repository.UserInfoRepository;

@Service
public class ProductService {

	Logger logger=LoggerFactory.getLogger(ProductService.class);
    List<Product> productList = new ArrayList<>();

    @Autowired
    private UserInfoRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;
	
	/*
	 * @PostConstruct public void loadProductsFromDB() { productList =
	 * IntStream.rangeClosed(1, 100) .mapToObj(i -> Product.builder() .productId(i)
	 * .name("product " + i) .qty(new Random().nextInt(10)) .price(new
	 * Random().nextInt(5000)).build() ).collect(Collectors.toList()); }
	 * 
	 */

    public List<Product> getProducts() {
    	
    	productList.add( new Product(201, "Mobile", 1, 20000) );
    	productList.add( new Product(202, "Laptop", 1, 50000) );
    	productList.add( new Product(203, "Charger", 2, 1200) );
    	productList.add( new Product(204, "Power bank", 4, 8000) );
    	
    	
        return  productList;
    }

    public Product getProduct(int id) {
        return productList.stream()
                .filter(product -> product.getProductId() == id)
                .findAny()
                .orElseThrow(() -> new RuntimeException("product " + id + " not found"));
    }


    public UserInfo addUser(UserInfo userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        logger.info("User Has Added");
        return userInfo;
    }
}
