package com.hexaware.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springbootdemo.beans.Employee;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
	ApplicationContext container=	SpringApplication.run(SpringbootdemoApplication.class, args);
	Employee e=container.getBean(Employee.class);
	System.out.println(e);
	}

}
