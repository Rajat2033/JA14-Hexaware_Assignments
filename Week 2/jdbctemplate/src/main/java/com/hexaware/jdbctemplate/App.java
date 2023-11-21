package com.hexaware.jdbctemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.jdbctemplate.Service.ServiceImpl;
import com.hexaware.jdbctemplate.beans.Product;
import com.hexaware.jdbctemplate.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
       ServiceImpl service=container.getBean(ServiceImpl.class);
       Product p=new Product(101,"Rajat", 50000); 
       
        int a=service.insertQuery(p);
        System.out.println("Data Entered "+a);
       
    }
}
