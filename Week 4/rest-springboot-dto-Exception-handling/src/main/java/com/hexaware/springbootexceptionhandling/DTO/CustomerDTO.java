package com.hexaware.springbootexceptionhandling.DTO;

import javax.persistence.Table;


public class CustomerDTO {
	
	private int cId;
	private String cName;
	private String cCity;
	private long cNumber;
	
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
