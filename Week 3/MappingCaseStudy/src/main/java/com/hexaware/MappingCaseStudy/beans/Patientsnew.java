package com.hexaware.MappingCaseStudy.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Patientsnew {
	@Id
	private int patient_id;

	private String patient_name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String gender;
	
	@OneToOne
	InvoiceDetails invoice;

	public Patientsnew() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patientsnew(int patient_id, String patient_name, Date dob, String gender, InvoiceDetails invoice) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.dob = dob;
		this.gender = gender;
		this.invoice = invoice;
	}

	public int getPatient_id() {
		return patient_id;
	}

	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}

	public String getPatient_name() {
		return patient_name;
	}

	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public InvoiceDetails getInvoice() {
		return invoice;
	}

	public void setInvoice(InvoiceDetails invoice) {
		this.invoice = invoice;
	}
	
	
}
