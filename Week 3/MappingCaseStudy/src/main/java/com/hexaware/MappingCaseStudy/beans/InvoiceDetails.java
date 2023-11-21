package com.hexaware.MappingCaseStudy.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class InvoiceDetails {
	@Id
	private int id;
	private double amount;
	
	@OneToOne(mappedBy = "invoice",cascade  = CascadeType.ALL)
	Patientsnew patientsnew;

	public InvoiceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceDetails(int id, double amount, Patientsnew patientsnew) {
		super();
		this.id = id;
		this.amount = amount;
		this.patientsnew = patientsnew;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Patientsnew getPatientsnew() {
		return patientsnew;
	}

	public void setPatientsnew(Patientsnew patientsnew) {
		this.patientsnew = patientsnew;
	}
	

}
