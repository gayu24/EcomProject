package org.eCommerce;

public class Product {
	
	private int productId;
	private String productName;
	private double price ;
	private int quantity;
	private String category;
	
	public Product( int productId,  String productName, double price, int quantity, String category ) {
		this.productId = productId;
		this.productName =  productName;
		this.price = price;
		this.quantity = quantity;
		this.category = category; 
	}
	public Product() {
		
	}
	
	public int getproductId ()  {
    	return productId;
    }
    public void setproductId (int productId)  {
    	if (productId>=0) {
			this. productId =  productId;
		} else {
		System.out.println("the  productId is empty");	
		
	}    }
    public String getproductName ()  {
    	return productName;
    }
    public void setproductName (String productName)  {
    	if ( productName!=null) {
			this. productName =  productName;
		} else {
		System.out.println("the  productName is empty");	
		
	}
    }
    public double getprice ()  {
    	return price;
    }
    public void setprice (double price)  {
    	 if (price > 0) {
             this.price = price;
         } else {
             System.out.println("Price should not zero");
         }    }
    public int getquantity()  {
    	return quantity;
    }
    public void setquantity (int quantity)  {
    	if (quantity >= 0) {
            this.quantity = quantity;
        } else {
           System.out.println("Quantity should not zero");
        }
    }
    public String getcategory ()  {
    	return category;
    }
    public void setcategory (String category)  {
    	if (category!=null) {
			this.category = category;
		} else {
		System.out.println("the category is empty");	
		
	}
    }
    
    public String getproductDetails() {
    	return "Product ID: " + getproductId() + ", Name: " + getproductName() + ", Price: " + getprice() + ", Quantity: " + getquantity() + ", Category: " + getcategory();
    	
    }
    
    public void updateQuantity(int newQuantity) {
    	this.quantity =  newQuantity;
    }
    
    public void updatePrice(double newPrice) {
    	this.price = newPrice;
    }
    
    
    
    
    
    

}
