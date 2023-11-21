package com.hexaware.springcore.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employees {
	
	private int eid;
	private String name;
	
//	@Autowired
	private Address adr;
	 
	
	public 	Employees()
	{
		super();
		System.out.println("Hello");
	}
	
	public Employees(Address adr) {
		super();
		System.out.println("Employee() Created");
		// TODO Auto-generated constructor stub
	}
	public Employees(int eid, String name, Address adr) {
		super();
		this.eid = eid;
		this.name = name;
		this.adr = adr;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdr() {
		return adr;
	}
	@Autowired
	public void setAdr(Address adr) {
		this.adr = adr;
	}
//	@Override
//	public String toString() {
//		return "Employees [eid=" + eid + ", name=" + name + ", adr=" + adr + "]";
//	}
	

}
