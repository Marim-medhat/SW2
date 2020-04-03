package com.sw2.Repositories.Controller;


import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import swe2onlinestore.services.registeration;
@Controller
public class registcontroller {
	 @Autowired
	    private registeration service;
	 
	
	     
	     @RequestMapping(value = "/regist", method = RequestMethod.POST)
	     
	     public String registuser(@ModelAttribute("user") User user) {
	         service.registUser(user);
	          
	         return "redirect:/";
	     }
	 }