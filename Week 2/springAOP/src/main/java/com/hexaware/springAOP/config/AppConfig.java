package com.hexaware.springAOP.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.hexaware.springAOP")
@EnableAspectJAutoProxy
public class AppConfig {

}
