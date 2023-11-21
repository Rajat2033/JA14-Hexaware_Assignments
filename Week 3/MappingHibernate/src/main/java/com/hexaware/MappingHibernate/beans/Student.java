package com.hexaware.MappingHibernate.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private int stuid;
	private String studname;
	private double salary;

	
//	@JoinColumn(name="Department_No")
//	private Department department;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stuid, String studname, double salary) {
		super();
		this.stuid = stuid;
		this.studname = studname;
		this.salary = salary;
//		this.department = department;
	}

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStudname() {
		return studname;
	}

	public void setStudname(String studname) {
		this.studname = studname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
//
//	public Department getDepartment() {
//		return department;
//	}
//
//	public void setDepartment(Department department) {
//		this.department = department;
//	}

	
	
}
