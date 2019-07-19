package com.bankapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController
{
	@GetMapping("/")
	public String showHome()
	{
		return "forward:/static/index.html";
	}
	
	@GetMapping("/create")
	public String showCreate()
	{
		return "create";
	}
	
	@GetMapping("/login")
	public String showLogin()
	{
		return "login";
	}
	
	@GetMapping("/err")
	public String showErr()
	{
		return "err";
	}
	
}
