package com.cg;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	private String prodName;
	private String price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String prodName, String price) {
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
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [prodName=" + prodName + ", price=" + price + "]";
	}
	
	
}
