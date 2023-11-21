package com.hexaware.MappingCaseStudy.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Patients_master")
public class Patients {
	@Id
	private int patient_id;

	private String patient_name;
	@Temporal(TemporalType.DATE)
	private Date dob;
	private String gender;

	@ManyToMany(mappedBy = "patients", fetch = FetchType.LAZY)
	Set<HealthcareProvider> provider = new HashSet<HealthcareProvider>();

	public Patients() {
		super();
		// TODO Auto-generated constructor stub
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

	public Set<HealthcareProvider> getProvider() {
		return provider;
	}

	public void setProvider(Set<HealthcareProvider> provider) {
		this.provider = provider;
	}

}
