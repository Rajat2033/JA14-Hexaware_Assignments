package com.hexaware.springsecurity.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	public AuthenticationProvider authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//		
		// for bcrypt password encoder runs on hashing complex process
		provider.setPasswordEncoder(new BCryptPasswordEncoder());
		
		return provider;
	}

	/*
	 * @Override
	 * 
	 * @Bean protected UserDetailsService userDetailsService() { List<UserDetails>
	 * users=new ArrayList<UserDetails>();
	 * users.add(User.withDefaultPasswordEncoder().username("Rajat").password(
	 * "abc123").roles("user").build());
	 * users.add(User.withDefaultPasswordEncoder().username("Kanchan").password(
	 * "5432").roles("Admin").build());
	 * 
	 * return new InMemoryUserDetailsManager(users); }
	 */
	
}
