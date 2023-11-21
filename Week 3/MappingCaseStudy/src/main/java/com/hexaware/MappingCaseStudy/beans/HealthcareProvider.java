package com.hexaware.MappingCaseStudy.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="HealthcareProvider_table")
public class HealthcareProvider {
	
	
	@Id
	private int provider_id;
	private String provider_name;
	private String provider_designation;
	private int provider_exp;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="Doctor_patients",joinColumns = {@JoinColumn(name="provider_id")},inverseJoinColumns = {@JoinColumn(name="patient_id")} )
	Set<Patients> patients=new HashSet<Patients>();

	public HealthcareProvider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProvider_id() {
		return provider_id;
	}

	public void setProvider_id(int provider_id) {
		this.provider_id = provider_id;
	}

	public String getProvider_name() {
		return provider_name;
	}

	public void setProvider_name(String provider_name) {
		this.provider_name = provider_name;
	}

	public String getProvider_designation() {
		return provider_designation;
	}

	public void setProvider_designation(String provider_designation) {
		this.provider_designation = provider_designation;
	}

	public int getProvider_exp() {
		return provider_exp;
	}

	public void setProvider_exp(int provider_exp) {
		this.provider_exp = provider_exp;
	}

	public Set<Patients> getPatients() {
		return patients;
	}

	public void setPatients(Set<Patients> patients) {
		this.patients = patients;
	}
	
	public void addPatients(Patients patients)
	{
		this.getPatients().add(patients);
	}

}
