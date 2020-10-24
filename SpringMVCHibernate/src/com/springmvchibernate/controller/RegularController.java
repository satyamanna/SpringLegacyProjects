package com.springmvchibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvchibernate.model.Users;

@Controller
public class RegularController {
   
	
	
	
	@RequestMapping(value ="/" ) 
	public ModelAndView home () {
		ModelAndView model  = new ModelAndView("index") ;
		Users users  = new Users();
	
		return model ;
	}
	
	
}
