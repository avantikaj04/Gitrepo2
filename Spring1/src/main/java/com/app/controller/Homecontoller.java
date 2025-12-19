package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Controller
public class Homecontoller 
{
	@RequestMapping("/")
	public String defaultpage()
	{
		return "index";
	}
	@RequestMapping("hello")
	public String preWelcome()
	{
		return "welcome";
	}

	public void display()
	{
		System.out.println("display");
	}
	
	public void hello()
	{
		System.out.println("hello");
	}
	
	
	
	
}

