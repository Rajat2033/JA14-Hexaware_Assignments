package com.hexaware.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hexaware.springbootdemo.beans.Product;

@SpringBootApplication
public class Springbootdemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootdemo1Application.class, args);
		Product p=new Product();
		System.out.println(p.toString());
		
	}

}
