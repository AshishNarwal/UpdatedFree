package com.cts.freelancer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value="/")
	public String welcomePage()
	{
		return "welcome";
	}
    
	
	@RequestMapping(value="admin")
	public String getAdminForm()
	{
		return "adminRegisterForm";
	}
	
	@RequestMapping(value="lancer")
	public String lancerForm()
	{
		return "lancerRegisterForm";
	}
}
