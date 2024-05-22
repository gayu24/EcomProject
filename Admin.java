package org.eCommerce;

public class Admin extends User {
	
	public Admin(int UserId, String UserName, String PassWord, String Email)  {
		super( UserId, UserName, PassWord, Email);
	}
	public void addProduct(Product Product) {
		System.out.println("Product added:" + Product.getproductDetails());
	}
	public void removeProduct(Product Product) {
		System.out.println("Product removed:" + Product.getproductDetails());
	}
	public void updateProduct(Product Product, double newPrice, int newQuantity)  {
		Product.updatePrice(newPrice);
		Product.updateQuantity(newQuantity);
		System.out.println("Product Update:" +Product.getproductDetails());
		
	
	}
    public void viewProfile () {
    	System.out.println("admin profile:" + getusername());
    }
	
	public void updateProfile(String newEmail,String newPassWord ) {
		if(newEmail != null && ! newEmail.isEmpty()) {
		System.out.println("Updating email from" + "to" +newEmail);
		}
		if (newPassWord != null && ! newPassWord.isEmpty()) {
			System.out.println("Updating PassWord.");
		}
		
	}
		@Override
		protected  void SetUserId(int nextUserId) {
			
		


	}
}
