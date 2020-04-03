package swe2onlinestore.services;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity

	public class User {
		String type="";
		String userName="";
		String mail="";
		String password="";
		
		
		public User() {
		}


		public User(String userName, String mail, String password) {
			this.userName = userName;
			this.mail = mail;
			this.password = password;
		}
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		public String getId() {
	        return mail;
	    }


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}


		public String getMail() {
			return mail;
		}


		public void setMail(String mail) {
			this.mail = mail;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}
		

	}