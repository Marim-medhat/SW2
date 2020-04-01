package swe2onlinestore.services;

public class User {
	String type="";
	String userName="";
	String mail="";
	int password=0;
	public User() {
		
	}
	public User(String userName, String mail, int password) {
		this.userName = userName;
		this.mail = mail;
		this.password = password;
	}
	

}
