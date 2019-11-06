package com.gaurav.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController 
{
	@RequestMapping("/view/verifyUser")
	public ModelAndView verifyUser(@RequestParam("na") String name,
			@RequestParam("pass") String password) 
	{
		ModelAndView modelAndView=null;
		
		if ( name != null && password != null)
		{
	      if (name.equals("gaurav") && password.equals("tiger")) 
	      {
	    	   modelAndView=new ModelAndView("success","result",name);
	    	  return modelAndView;
	      }
	      else 
	      {
	    	  modelAndView=new ModelAndView("user","result","Login Failed !!..,Try Again ");
	    	  return modelAndView;
	      }
	    	  
	      }
		return null;
		         
	}
}