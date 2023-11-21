package com.hexaware.PoJO;

public class Employee {

	private int eid;
	private String name;
	private Address adr;  //loose coupling HAS-A Relationship.
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String name, Address adr) {
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
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", adr=" + adr + "]";
	}
	
	
}
