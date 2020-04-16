package com.sw2.Repositories.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class listController {
	 @Autowired
	 private ListService service;
	
	 
	 @GetMapping( "/list")
     public String ShowList(Model model) {
	    
		 List<User> listUser = service.listAll();
		  model.addAttribute("listUser", listUser);
         return "listusers";
     }
	
	
	
}
