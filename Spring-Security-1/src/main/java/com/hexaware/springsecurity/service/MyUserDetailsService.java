package com.hexaware.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hexaware.springsecurity.entities.UserEntity;
import com.hexaware.springsecurity.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		
		UserEntity user= repo.findByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException(username);
		}
		
		return new UserPrincipal(user);
	}

}
