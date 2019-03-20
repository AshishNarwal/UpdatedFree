package com.cts.freelancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.freelancer.bean.User;
import com.cts.freelancer.service.UserLoginService;

@Controller
public class UserController {
	
	@Autowired
	UserLoginService userLogin;
	
	@RequestMapping(value="registerUser",method=RequestMethod.GET)
	public ModelAndView registerUser(@ModelAttribute User user)
	{
		ModelAndView modelAndView=new ModelAndView();
		boolean result=userLogin.registerUser(user);
		if(result)
		{
			modelAndView.setViewName("userLogin");
		}
		else
		{	
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}
	
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public ModelAndView loginUser(@RequestParam ("emailId") String emailId,@RequestParam ("password") String password)
	{
		ModelAndView modelAndView=new ModelAndView();
		boolean result=userLogin.authenticate(emailId, password);
		if(result)
		{
			modelAndView.setViewName("userWelcome");
			modelAndView.addObject("user",emailId);
		}
		else
		{
			modelAndView.setViewName("error");
		}
		return modelAndView;
	}

}
