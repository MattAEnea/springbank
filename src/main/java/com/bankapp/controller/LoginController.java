package com.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bankapp.beans.Customer;
import com.bankapp.service.CustomerService;
import com.bankapp.service.PasswordService;

@Controller
public class LoginController
{
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/loginProcess")
	public String accountLogin(@RequestParam String username, 
			@RequestParam String password, Model model)
	{
		Customer customer = customerService.findByUser(username);
		if(PasswordService.checkPass(password, customer.getPassword(),
				customer.getSalt()))
		{
			model.addAttribute("customerLogin", customer);
			return "account";
		}
		else
		{
			model.addAttribute("msg", "wrong password");
			return "err";
		}
	}
	
}