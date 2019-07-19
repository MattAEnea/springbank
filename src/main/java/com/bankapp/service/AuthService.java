package com.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.bankapp.beans.Customer;

@Service
public class AuthService implements UserDetailsService
{
	@Autowired
	CustomerService customerService;
	
	@Override
	public UserDetails loadUserByUsername(String username)
	{
			Customer customer = customerService.findByUser(username);
			return User.withUsername(customer.getUsername())
					.password(customer.getPassword())
					.roles("USER").build();
	}
}
