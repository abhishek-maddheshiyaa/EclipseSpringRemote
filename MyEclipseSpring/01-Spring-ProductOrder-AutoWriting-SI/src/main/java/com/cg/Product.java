package com.cg;

public class Product {
	private String prodName;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prodName, double price) {
		super();
		this.prodName = prodName;
		this.price = price;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", price=" + price + "]";
	}
	
	
}
