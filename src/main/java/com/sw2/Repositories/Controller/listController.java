package com.sw2.Repositories.Controller;


import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import swe2onlinestore.services.ListService;
import swe2onlinestore.services.registerationService;
@Controller
public class listController {
	 @Autowired
	    private ListService service;
	
	
	@RequestMapping("/list")
	public String viewHomePage(Model model) {
	    List<User> listUser = service.listAll();
	    model.addAttribute("listUser", listUser);
	     
	    return "listusers";
	}
}
