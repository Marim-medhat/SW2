package com.sw2.Repositories.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

 
@Service
@Transactional
public class ListService {

	 @Autowired
	 private reprosatory repo;
	 
	 
	 public List<User> listAll() {
	        return repo.findAll();
	    }
}


