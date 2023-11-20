package com.hexaware.jdbctemplate.beans;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	
	private int pid;
	private String pname;
	private double pamount;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, double pamount) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pamount = pamount;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPamount() {
		return pamount;
	}
	public void setPamount(double pamount) {
		this.pamount = pamount;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pamount=" + pamount + "]";
	}
	

}
