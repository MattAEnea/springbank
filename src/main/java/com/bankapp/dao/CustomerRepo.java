package com.bankapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankapp.beans.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer>
{
	Customer findByUsername(String username);
}
