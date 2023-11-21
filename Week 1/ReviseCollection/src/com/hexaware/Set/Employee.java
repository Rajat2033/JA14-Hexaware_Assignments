package com.hexaware.Set;

import java.util.Objects;

public class Employee {
	
	private int eid;
	private String ename;
	private int salary;
	@Override
	public String toString() {
		return this.eid+"";
	}
	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid;
	}
	
	
	

}
