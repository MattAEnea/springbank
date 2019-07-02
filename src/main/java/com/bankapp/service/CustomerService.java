package com.bankapp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bankapp.beans.Customer;
import com.bankapp.dao.CustomerRepo;

public class CustomerService 
{
	@Autowired
	private CustomerRepo customerRepo;
	
	public void saveCustomer(Customer customer)
	{
		customerRepo.save(customer);
	}
	
	public Customer findByAccountNumber(int accNum)
	{
		Customer customer = customerRepo.findById(accNum).get();
		return customer;
	}
	
	public Customer findByUser(String username)
	{
		Customer customer = customerRepo.findByUsername(username);
		return customer;
	}
	
	public void deleteCustomer(Customer customer)
	{
		customerRepo.delete(customer);
	}
}
