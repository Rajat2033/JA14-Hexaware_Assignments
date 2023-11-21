package com.hexaware.springioccontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexaware.springioccontainer.beans.Principle;
import com.hexaware.springioccontainer.beans.Students;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = "com.hexaware.springioccontainer.beans" )
public class App 
{
    public static void main( String[] args )
    {
     ApplicationContext container=   new AnnotationConfigApplicationContext(App.class);
     Students s=container.getBean(Students.class);
     s.setId(101);
     s.setName("Rajat");
     
     
     Principle p=container.getBean(Principle.class);
     p.setDesignation("Principle");
     s.setPrinciple(p);
     System.out.println(s);
     System.out.println(p);
    }
}
