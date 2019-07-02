package com.bankapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class AccountViewController 
{
	@PostMapping("/account")
	public String createAccount(Model model)
	{
		return "account";
	}
	
}

