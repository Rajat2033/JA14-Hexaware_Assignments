package com.hexaware.MappingHibernate.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int empid;
	private String ename;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Address_id")
	private Address address;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empid, String ename) {
		super();
		this.empid = empid;
		this.ename = ename;
	}

	public Employee(int empid, String ename, Address address) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", address=" + address + "]";
	}

}
