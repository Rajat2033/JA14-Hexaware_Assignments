package com.hexaware.restapiheathcareprovider.DTO;

public class HealthcareProviderDTO {
	private int providerId;
	private String providerName;
	private String providerPassword;
	private String providerGender;
	private String providerSpeciality;
	private String providerDesignation;
	private int providerExperience;
	private String providerQualification;
	private int patientId;
	public HealthcareProviderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HealthcareProviderDTO(int providerId, String providerName, String providerPassword, String providerGender,
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
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
}
