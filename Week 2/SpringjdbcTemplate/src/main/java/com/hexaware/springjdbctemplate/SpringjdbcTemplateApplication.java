package com.hexaware.springjdbctemplate;

import javax.sql.DataSource;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.hexaware.springjdbctemplate.beans.Students;

import com.hexaware.springjdbctemplate.controller.StudentController;

@SpringBootApplication

public class SpringjdbcTemplateApplication {

	public static void main(String[] args) {
	 SpringApplication.run(SpringjdbcTemplateApplication.class, args);
		
		
	}
}
