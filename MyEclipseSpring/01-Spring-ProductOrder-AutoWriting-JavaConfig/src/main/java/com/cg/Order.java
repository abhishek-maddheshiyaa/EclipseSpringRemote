package com.cg;

import org.springframework.beans.factory.annotation.Autowired;

public class Order {
	private int orderId;
	private String orderDate;
	private int quantity;
	private Product product;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, String orderDate, int quantity, Product product) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.product = product;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}
	@Autowired
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void orderDetail()
	{
		System.out.println("Order Detain: ");
		System.out.println("orderId : "+orderId+" order date : "+orderDate+" quantiti : "+quantity+" product : "+product);
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", quantity=" + quantity + ", product="
				+ product + "]";
	}
	
	
	
}
