package com.gaurav.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController 
{   @RequestMapping("/view/calcSimpleInterest")
	public ModelAndView calcSimpleInterest(@RequestParam("pa") int principal,
			@RequestParam("yr") int year,@RequestParam("rate") int rate) 
	{
	   double si=(principal*rate*year)*0.01;
	
	   ModelAndView modelAndView=new ModelAndView("helloworld","result","The Simple Interst is :"+ si);
		return modelAndView;
	}

}
