package com.gaurav.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController
{
	@RequestMapping("/view/display")
	public ModelAndView display() 
	{
		/*
        first arg is the type of result file,
		second arg is the identifier in expression lang,
		third arg is the data to be displayed*/
		
		ModelAndView modelAndView=new ModelAndView("helloworld","result","Hello World !!");
		return modelAndView;
	}

}
