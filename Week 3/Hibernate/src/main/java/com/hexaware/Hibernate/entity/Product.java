package com.hexaware.Hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@NamedQueries({
	@NamedQuery(name = "getProRecord", query = "select p from Product p") ,
	@NamedQuery(name="SortByName",query="select p from Product p where p.pname=:name")
	


})
@Table(name="Products")
public class Product {
	@Id
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
