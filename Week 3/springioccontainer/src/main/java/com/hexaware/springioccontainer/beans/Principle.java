package com.hexaware.springioccontainer.beans;

import org.springframework.stereotype.Component;

@Component
public class Principle {
	private String designation;

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Principle [designation=" + designation + "]";
	}

	public Principle(String designation) {
		super();
		this.designation = designation;
	}

	public Principle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
