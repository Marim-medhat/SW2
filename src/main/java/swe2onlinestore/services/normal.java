package swe2onlinestore.services;

public class normal extends User {

	public normal(String userName, String mail, int password,String type) {
		super(userName, mail, password);
		this.type = "normal";
	}

	
}
