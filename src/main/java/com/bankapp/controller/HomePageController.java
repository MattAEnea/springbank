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
	
	@GetMapping("form")
	public String showForm()
	{
		return "form";
	}
	
}
