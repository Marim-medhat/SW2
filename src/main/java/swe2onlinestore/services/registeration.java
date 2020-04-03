package swe2onlinestore.services;

	import java.util.List;

	import org.apache.catalina.User;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;

	import com.sw2.Repositories.reprosatory;
	 
	@Service
	@Transactional
	public class registeration   {

		 @Autowired
		    private reprosatory repo;
		
		 public List<User> listAll() {
		        return repo.findAll();
		    }
		 
		 public void registUser(User user) {
		        repo.save(user);
		    }
		 
		 
		 
		 
		 
		 
			}