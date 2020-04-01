package swe2onlinestore.services;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class registeration implements regist {

	public registeration() {
	}

	public void register(User user) throws Exception{ 
		if(user==null) {
			 throw new Exception("error in registeration class");
		}
			
		
	}

}
