package com.superweb.superwebapp.beans;

public class ProductBean {
	
	private String name;
	private double price;
	private long subcatid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getSubcatid() {
		return subcatid;
	}
	public void setSubcatid(long subcatid) {
		this.subcatid = subcatid;
	}
	@Override
	public String toString() {
		return "ProductBean [name=" + name + ", price=" + price + ", subcatid=" + subcatid + "]";
	}
	
	
}
