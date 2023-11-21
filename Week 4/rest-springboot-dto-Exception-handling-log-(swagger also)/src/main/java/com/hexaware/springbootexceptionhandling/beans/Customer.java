package com.hexaware.springbootexceptionhandling.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_data")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cName;
	private String cCity;
	private long cNumber;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cId, String cName, String cCity, long cNumber) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCity = cCity;
		this.cNumber = cNumber;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public long getcNumber() {
		return cNumber;
	}

	public void setcNumber(long cNumber) {
		this.cNumber = cNumber;
	}

}
