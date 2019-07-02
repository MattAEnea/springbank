package com.bankapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bankapp.beans.Customer;
import com.bankapp.service.PasswordService;

@Controller
public class CreateAccountController 
{
	@PostMapping("/save")
	public String createAccount(@RequestParam String fullName, 
			 @RequestParam String username, @RequestParam String password, 
			Model model)
	{
		Customer customer = new Customer();
		customer.setName(fullName);
		customer.setUsername(username);
		String salt = PasswordService.getSalt();
		customer.setSalt(salt);
		customer.setPassword(PasswordService.hashThePass(password, salt));
		salt = null;
		password = null;
		model.addAttribute("newAccount", customer);
		return "account";
	}
	
}
