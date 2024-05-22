package org.eCommerce;

import java.util.ArrayList;
import java.util.List;

public class LoginSystem {
	private List<User> users;
	private int nextUserId;
	
	public LoginSystem () {
		this.users = new ArrayList<>();
		this.nextUserId = 1; 
	}
	
	public void register(User user) {
		user.SetUserId(getNextUserId());
		users.add(user);
		System.out.println("User registered successfully.");
	}
	 int getNextUserId() {
		return nextUserId++;
	}
	

	public User login(String username, String password) {
		for (User user : users) {
			if(user.getusername().equals(username) && user.getpassword().equals(password)) {
				user.login();
				return user;
			}
			
		}
		System.out.println("invalid username or password.");
		return null;
		
	}
	public void logout( User user) {
		user.logout();
	}

	}
