package com.hexaware.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springAOP.Service.BankService;
import com.hexaware.springAOP.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext container =new AnnotationConfigApplicationContext(AppConfig.class);
        
        BankService  service=container.getBean(BankService.class);
//       service.withdrawal();
//       service.deposit();
       service.amount(101);
    }
}
