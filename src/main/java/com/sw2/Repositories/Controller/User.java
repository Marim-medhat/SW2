package com.sw2.Repositories.Controller;


	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

@Entity
public class User {
	
	 private Integer id;
		
		private String username;
		private String email;
		private String type;
		private String password;
		

		public User() {
			id=0;
			username = "";
			email = "";
			type = "";
			password = "";
		}
		

		public User(Integer id, String username, String email, String type, String password) {
			super();
			this.id = id;
			this.username = username;
			this.email = email;
			this.type = type;
			this.password = password;
		}

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}



}
