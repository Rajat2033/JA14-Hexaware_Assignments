package com.hexaware.springbootcustomermicro.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_data")
public class Customer {

	@Id
	private int cId;
	private String cName;
	private String cCity;
	private long cNumber;
	private int pid;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Customer(int cId, String cName, String cCity, long cNumber, int pid) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCity = cCity;
		this.cNumber = cNumber;
		this.pid = pid;
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



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}

}
