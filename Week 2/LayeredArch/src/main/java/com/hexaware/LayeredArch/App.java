package com.hexaware.LayeredArch;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexaware.LayeredArch.Service.EmployeeService;
import com.hexaware.LayeredArch.Service.IEmployeeService;
import com.hexaware.LayeredArch.beans.Employee;


@Configuration
@ComponentScan(basePackages = {"com.hexaware.LayeredArch"})
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Presentation Layer UI" );
        ApplicationContext container= new AnnotationConfigApplicationContext(App.class);
        IEmployeeService service=container.getBean(EmployeeService.class);
        
        Employee e=service.getData();
        System.out.println(e);
    }
}
