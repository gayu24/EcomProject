package org.eCommerce;

import java.util.Date;
import java.util.List;

public class Order implements OrderActions {
	private int orderId;
	private int customerId;
	private Date orderDate;
	private String orderStatus;
    private List<Product> orderedProducts;
	
	
	 public Order( int orderId, int customerId, Date orderDate, String orderStatus, List<Product> orderedProducts) {
	     
		    this.orderId = orderId;
	        this.customerId = customerId;
	        this.orderDate = new Date();
	        this.orderStatus = "Shipped";
	        this.orderedProducts = orderedProducts;
	    }

	   

	    public int getOrderId() {
	        return orderId;  
	    }
	 

	    public int getCustomerId() {
	        return customerId;
	    }
	   

	    public Date getOrderDate() {
	        return orderDate;
	    }
	   
	    

	    public String getOrderStatus() {
	        return orderStatus;
	    }
	   
	    public List<Product> getOrderedProducts() {
	        return orderedProducts;
	    }
	   

	
//	public String getOrderDetails() {
//		return "Order ID: "+getOrderId() + ", Customer ID: "+getCustomerId() + ", Order Date: "+getOrderDate() + ", Order Status: "+getOrderStatus() + ", Ordered Products: "+getOrderedProducts();
//		
//
//	}

	
    public void placeOrdere() {
    	orderStatus = "placed";
    	System.out.println("order placed with Id: "+ orderId+ "your order has been succesfully placed");
    }
	
	public void cancleOrder() {
		orderStatus = "cancelled";
		System.out.println("order cancelled with Id: "+ orderId+ "your order has been succesfully cancelled");
	}
	
	public void trackOrder() {
		orderStatus = "orderTracked";
		System.out.println("order track with Id: "+ orderId+ "your order is on the way");
	}
	public void updateOrderStatus(String  status ) {
		 this.orderStatus = status;
		 System.out.println("order status updated to: "+status);
	}


}
