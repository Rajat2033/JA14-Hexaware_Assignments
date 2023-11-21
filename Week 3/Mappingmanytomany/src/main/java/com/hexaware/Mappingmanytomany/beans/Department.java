package com.hexaware.Mappingmanytomany.beans;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	
	private int deptId;
	private String deptName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "department")
	
	//Given for handling null pointer exception for one `to many we uses set bcz it does not allows duplicates and insertion order is preserved
	private Set<Student> students = new HashSet<Student>();

	public Department(int deptId, String deptName, Set<Student> students) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.students = students;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void addStudents(Student student) {
		// here students need dept obj so adding dept obj in stud obj
		student.setDepartment(this);
		Set<Student> std=getStudents();
		std.add(student);
	}

}
