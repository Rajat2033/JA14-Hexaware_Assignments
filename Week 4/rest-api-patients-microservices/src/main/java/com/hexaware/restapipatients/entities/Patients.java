package com.hexaware.restapipatients.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Patients {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patientId;
	private String patientName;
	private String patientPassword;
	private String patientDOB;
	private String patientGender;
	private long patientContact;
	private String patientAddress;
	private String patientDisease;
	public Patients() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patients(int patientId, String patientName, String patientPassword, String patientDOB, String patientGender,
			long patientContact, String patientAddress, String patientDisease) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientPassword = patientPassword;
		this.patientDOB = patientDOB;
		this.patientGender = patientGender;
		this.patientContact = patientContact;
		this.patientAddress = patientAddress;
		this.patientDisease = patientDisease;
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
	public String getPatientDOB() {
		return patientDOB;
	}
	public void setPatientDOB(String patientDOB) {
		this.patientDOB = patientDOB;
	}
	public String getPatientGender() {
		return patientGender;
	}
	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}
	public long getPatientContact() {
		return patientContact;
	}
	public void setPatientContact(long patientContact) {
		this.patientContact = patientContact;
	}
	public String getPatientAddress() {
		return patientAddress;
	}
	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}
	public String getPatientDisease() {
		return patientDisease;
	}
	public void setPatientDisease(String patientDisease) {
		this.patientDisease = patientDisease;
	}
	@Override
	public String toString() {
		return "Patients [patientId=" + patientId + ", patientName=" + patientName + ", patientPassword="
				+ patientPassword + ", patientDOB=" + patientDOB + ", patientGender=" + patientGender
				+ ", patientContact=" + patientContact + ", patientAddress=" + patientAddress + ", patientDisease="
				+ patientDisease + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(patientAddress, patientContact, patientDOB, patientDisease, patientGender, patientId,
				patientName, patientPassword);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patients other = (Patients) obj;
		return Objects.equals(patientAddress, other.patientAddress) && patientContact == other.patientContact
				&& Objects.equals(patientDOB, other.patientDOB) && Objects.equals(patientDisease, other.patientDisease)
				&& Objects.equals(patientGender, other.patientGender) && patientId == other.patientId
				&& Objects.equals(patientName, other.patientName)
				&& Objects.equals(patientPassword, other.patientPassword);
	}
	
	

}
