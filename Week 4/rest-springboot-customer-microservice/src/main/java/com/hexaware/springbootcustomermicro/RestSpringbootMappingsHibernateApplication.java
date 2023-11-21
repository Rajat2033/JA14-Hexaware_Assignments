package com.hexaware.springbootcustomermicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestSpringbootMappingsHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestSpringbootMappingsHibernateApplication.class, args);
	}
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	}
	

}
