package com.cts.freelancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.freelancer.bean.Admin;
import com.cts.freelancer.service.AdminLoginService;

@Controller
public class LoginController {
	
	
	@Autowired
	AdminLoginService adminLoginService;
    
	
	  @RequestMapping(value="adminLoginAuth",method=RequestMethod.POST)
	    public ModelAndView adminAuthentication(@RequestParam("emailId") String emailId,@RequestParam("password") String password)
	    {
	    	ModelAndView modelAndView=new ModelAndView();
	    	boolean result=adminLoginService.authenticate(emailId, password);
	    	if(result)
	    	{
	    		modelAndView.setViewName("adminWelcome");
	    		modelAndView.addObject("user",emailId);
	    	}
	    	else
	    		modelAndView.setViewName("error");
	    	return modelAndView;
	    }

	  @RequestMapping("adminLoginPage")
	  public String loginAdminScreen()
	  {
		  return "adminLogin";
	  }
	
    @RequestMapping(value="registerAdmin",method=RequestMethod.GET)
    public ModelAndView registerAdmin(@ModelAttribute Admin admin)
    {
    	ModelAndView modelAndView=new ModelAndView();
    	boolean result=adminLoginService.registerAdmin(admin);
    	if(result)
    	{
    		modelAndView.setViewName("adminLogin");
    		modelAndView.addObject("admin",admin);
    	}
    	else
    	modelAndView.setViewName("error");
    	return modelAndView;
    }
    
	



}
