package com.sw2.Repositories.Controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;
	 
	@Service
	@Transactional
	public class registerationService   {

		 @Autowired
		    private reprosatory repo;
		
		
		 
		 public void registUser(User user) {
		        repo.save(user);
		    }
		 
		 
		 
		 
		 
		 
			}