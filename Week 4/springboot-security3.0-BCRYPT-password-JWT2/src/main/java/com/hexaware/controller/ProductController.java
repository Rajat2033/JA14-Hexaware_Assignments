package com.hexaware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

import com.hexaware.dto.AuthRequest;
import com.hexaware.dto.Product;
import com.hexaware.entity.UserInfo;
import com.hexaware.service.AuthJWTService;
import com.hexaware.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	private AuthJWTService jwtservice;
	@Autowired
	private ProductService service;

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome this endpoint is not secure";
	}

	@PostMapping("/new")
	public UserInfo addNewUser(@RequestBody UserInfo userInfo) {
		return service.addUser(userInfo);
	}

	@GetMapping("/getall")
	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
	public List<Product> getAllTheProducts() {
		return service.getProducts();
	}

	@GetMapping("/get/{id}")
	@PreAuthorize("hasAuthority('ROLE_USER')")
	public Product getProductById(@PathVariable int id) {
		return service.getProduct(id);
	}

	@PostMapping("/authenticate")
	public String autheticateAndGetToken(@RequestBody AuthRequest authReq) {
		Authentication authenticate = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(authReq.getUsername(), authReq.getPassword()));

		String Token=null;
		if (authenticate.isAuthenticated()) {
			Token=jwtservice.generateToken(authReq.getUsername());
		}

		else {
			throw new UsernameNotFoundException("Not Found UserName");
		}
	 return Token;
	}
}
