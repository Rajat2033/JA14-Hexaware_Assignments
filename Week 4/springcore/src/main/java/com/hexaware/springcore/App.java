package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.hexaware.springcore.entities.Address;
import com.hexaware.springcore.entities.Employees;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages = "com.hexaware.springcore.entities")
public class App {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(App.class);

		Address adr = container.getBean("Address", Address.class);
		Employees e = container.getBean(Employees.class);
		adr.setCity("Pune");
		e.setEid(101);
		e.setName("Rajat");
//		e.setAdr(adr);///injecting address object in employee object

		System.out.println(e);
		System.out.println(e.getAdr());

		String str = container.getBean(String.class);

		System.out.println(str);

	}

	@Bean //// for predefined method that can not be modified
	public String getStringObj() {
		return new String("Javeed");
	}
}
