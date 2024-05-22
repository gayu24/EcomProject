package org.eCommerce;

abstract public class User {
	private int userId;
	private String username;
	private String password;
	private String email;
	
	public User(int userId, String username, String password, String email) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	
	
	public int getuserId() {
		return userId;
	
	
	}

	public String getusername() {
		return username;
	}
	
	
	

	public String getpassword() {
		return password;
	}
	
	
	public String getemail() {
		return email;
	}
	
		
	
	
	
	
	public void login() {
		System.out.println(username + "logged in.");
	}
	public void logout() {
		System.out.println(username + "logged out.");
	}
	
	
	 public abstract void viewProfile ();
	
	 public abstract void updateProfile (String newEmail, String newPassword);
	
	protected abstract void SetUserId(int nextUserId);

}
