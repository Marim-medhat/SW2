package com.sw2.Repositories.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class registcontroller {
	 @Autowired
	    private registerationService service;
	 
	
	     
	  @GetMapping( "/regist")
	     public String ShowregistuserForm(Model model) {
		    

	    	 model.addAttribute("user", new User());
	         return "registUserhtml.html";
	     }
	   
	  @PostMapping (value = "/regist")
		 public String registre(Model model, @ModelAttribute User user) {
			 service.registUser(user);
			 model.addAttribute("user",  new User());
			 
			return "home";
			 
			 
		 }
	 }