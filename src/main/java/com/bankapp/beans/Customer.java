package com.bankapp.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer extends Account
{
	@Id
	private int accountNumber;
	private double balance;

	public Customer(){}

	public int getAccountNumber()
	{
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}
}
