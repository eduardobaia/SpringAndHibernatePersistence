package com.springAndHibernate.SpringAndHibernate.controllers;

import org.springframework.ui.Model;

import com.springAndHibernate.SpringAndHibernate.model.HelloLog;

public enum HelloController {

	@RequesMapping(value ="/hello", method= RequestMethod.POST)
	public String hello(HttpServletRequest request, Model model){
		
		String name = request.getParameter("name");
		
		if(name == null || name ==""){
			name= "world";
		}
		
		HelloLog log = new HelloLog(name);
		
		model.addAttribute("name",name);
		model.addAttribute("title", "Hello, Spring! Response");
	
		return "hello";
	}
	
}
