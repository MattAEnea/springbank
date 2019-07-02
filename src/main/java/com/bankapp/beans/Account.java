package com.bankapp.beans;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@MappedSuperclass

public class Account
{
	@Column(name = "fullName")
	private String fullName;
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
	@Column(name = "salt")
	private String salt;

	public Account(){}

	public String getName()
	{
		return fullName;
	}

	public void setName(String fullName)
	{
		this.fullName = fullName;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getSalt()
	{
		return salt;
	}

	public void setSalt(String salt)
	{
		this.salt = salt;
	}


}
