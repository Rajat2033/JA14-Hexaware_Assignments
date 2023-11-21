package com.hexaware.springbootdemo.beans;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private int id;
	private String proName;
	private double amount;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", proName=" + proName + ", amount=" + amount + "]";
	}
	public Product(int id, String proName, double amount) {
		super();
		this.id = id;
		this.proName = proName;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
