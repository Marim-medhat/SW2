package swe2onlinestore.services;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	String type="";
	String userName="";
	String mail="";
	int password=0;
	
	public User(String userName, String mail, int password) {
		this.userName = userName;
		this.mail = mail;
		this.password = password;
	}
	

}
