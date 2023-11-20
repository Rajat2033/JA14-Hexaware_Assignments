package com.hexaware.springjdbctemplate.beans;

import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Students {
	
	@Id
	private int roll;
	private String name;
	private String city;
	private int classn;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int roll, String name, String city, int classn) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.classn = classn;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getClassn() {
		return classn;
	}
	public void setClassn(int classn) {
		this.classn = classn;
	}
	
	
	
	

}
