package com.hexaware.springrestcrud.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Patients implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	private String patientPassword;
	private Long contactNumber;
	private LocalDate dob;
	private double salary;
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patients(int patientId, String patientName, String patientPassword, Long contactNumber, LocalDate dob) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientPassword = patientPassword;
		this.contactNumber = contactNumber;
		this.dob = dob;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientPassword() {
		return patientPassword;
	}
	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Patients [patientId=" + patientId + ", patientName=" + patientName + ", patientPassword="
				+ patientPassword + ", contactNumber=" + contactNumber + ", dob=" + dob + "]";
	}
	
	
	
}
