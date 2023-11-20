package com.hexaware.springrestcrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestCrudMysql1CaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCrudMysql1CaseApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate()
	{
		return  new RestTemplate();
	}
}
