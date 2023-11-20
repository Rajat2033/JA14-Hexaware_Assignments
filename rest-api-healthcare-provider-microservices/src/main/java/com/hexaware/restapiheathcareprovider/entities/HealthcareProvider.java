package com.hexaware.restapiheathcareprovider.entities;

import java.util.Objects;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HealthcareProvider {
	@Id
	private int providerId;
	private String providerName;
	private String providerPassword;
	private String providerGender;
	private String providerSpeciality;
	private String providerDesignation;
	private int providerExperience;
	private String providerQualification;
	private int patientId;
	public HealthcareProvider() {
		super();
	}
	
	public HealthcareProvider(int providerId) {
		super();
		this.providerId = providerId;
	}

	public HealthcareProvider(int providerId, String providerName, String providerPassword, String providerGender,
			String providerSpeciality, String providerDesignation, int providerExperience,
			String providerQualification) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerPassword = providerPassword;
		this.providerGender = providerGender;
		this.providerSpeciality = providerSpeciality;
		this.providerDesignation = providerDesignation;
		this.providerExperience = providerExperience;
		this.providerQualification = providerQualification;
	}
	
	public HealthcareProvider(int providerId, String providerName, String providerPassword, String providerGender,
			String providerSpeciality, String providerDesignation, int providerExperience, String providerQualification,
			int patientId) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerPassword = providerPassword;
		this.providerGender = providerGender;
		this.providerSpeciality = providerSpeciality;
		this.providerDesignation = providerDesignation;
		this.providerExperience = providerExperience;
		this.providerQualification = providerQualification;
		this.patientId = patientId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getProviderId() {
		return providerId;
	}
	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public String getProviderPassword() {
		return providerPassword;
	}
	public void setProviderPassword(String providerPassword) {
		this.providerPassword = providerPassword;
	}
	public String getProviderGender() {
		return providerGender;
	}
	public void setProviderGender(String providerGender) {
		this.providerGender = providerGender;
	}
	public String getProviderSpeciality() {
		return providerSpeciality;
	}
	public void setProviderSpeciality(String providerSpeciality) {
		this.providerSpeciality = providerSpeciality;
	}
	public String getProviderDesignation() {
		return providerDesignation;
	}
	public void setProviderDesignation(String providerDesignation) {
		this.providerDesignation = providerDesignation;
	}
	public int getProviderExperience() {
		return providerExperience;
	}
	public void setProviderExperience(int providerExperience) {
		this.providerExperience = providerExperience;
	}
	public String getProviderQualification() {
		return providerQualification;
	}
	public void setProviderQualification(String providerQualification) {
		this.providerQualification = providerQualification;
	}
	@Override
	public String toString() {
		return "HealthcareProvider [providerId=" + providerId + ", providerName=" + providerName + ", providerPassword="
				+ providerPassword + ", providerGender=" + providerGender + ", providerSpeciality=" + providerSpeciality
				+ ", providerDesignation=" + providerDesignation + ", providerExperience=" + providerExperience
				+ ", providerQualification=" + providerQualification + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(providerDesignation, providerExperience, providerGender, providerId, providerName,
				providerPassword, providerQualification, providerSpeciality);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HealthcareProvider other = (HealthcareProvider) obj;
		return Objects.equals(providerDesignation, other.providerDesignation)
				&& providerExperience == other.providerExperience
				&& Objects.equals(providerGender, other.providerGender) && providerId == other.providerId
				&& Objects.equals(providerName, other.providerName)
				&& Objects.equals(providerPassword, other.providerPassword)
				&& Objects.equals(providerQualification, other.providerQualification)
				&& Objects.equals(providerSpeciality, other.providerSpeciality);
	}

	
	
	
	

}
