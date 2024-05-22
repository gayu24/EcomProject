package org.eCommerce;

import java.util.ArrayList;

public class Customer extends User  {

	private ArrayList<Product> cart;
	
	public Customer(int UserId, String UserName, String PassWord,String Email) {
			super(UserId, UserName, PassWord, Email); 
		this.cart = new ArrayList<>();
	}
	
	
	
	
	public void addToCart(Product Product)  {
		cart.add(Product);
		System.out.println(Product.getproductName() + "added to cart.");
	}
    public void removeFromCart(Product Product)  {
		cart.remove(Product);
		System.out.println(Product.getproductName() + "removed to cart.");
	}
    public void checkout() {
    	System.out.println("checking out the following items:");
    	for(Product Product  : cart) {
    		System.out.println(Product.getproductDetails());
    	}
    	cart.clear();
    }
	@Override
    public void viewProfile () {
    	System.out.println("customer profile: "+getusername() + ", Email: "+ getemail());
}
	@Override
	public void updateProfile(String newEmail, String newPassword) {
		if( newEmail != null && !newEmail.isEmpty()) {
		System.out.println("updating Email from" + getemail() + "to" + newEmail);
	}
		
	}
	protected void SetUserId(int nextUserId) {
		
	}
		
	

}
