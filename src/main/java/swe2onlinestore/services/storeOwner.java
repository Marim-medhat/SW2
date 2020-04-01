package swe2onlinestore.services;

public class storeOwner extends User {


	public storeOwner(String userName, String mail, int password,String type) {
		super(userName, mail, password);
		this.type = "storeowner";
	}

	

}
