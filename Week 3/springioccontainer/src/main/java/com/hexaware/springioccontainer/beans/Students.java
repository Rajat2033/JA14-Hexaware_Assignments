package com.hexaware.springioccontainer.beans;

import org.springframework.stereotype.Component;

@Component
public class Students {

	private int id;
	private String name;
	private Principle principle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Principle getPrinciple() {
		return principle;
	}
	public void setPrinciple(Principle principle) {
		this.principle = principle;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", principle=" + principle + "]";
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int id, String name, Principle principle) {
		super();
		this.id = id;
		this.name = name;
		this.principle = principle;
	}
	
}
