package com.hexaware.DTO;

public class HealthcareProviderDTO {
	private int providerId;
	private String providerName;
	
	private String providerSpeciality;

	public HealthcareProviderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthcareProviderDTO(int providerId, String providerName, String providerSpeciality) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.providerSpeciality = providerSpeciality;
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

	public String getProviderSpeciality() {
		return providerSpeciality;
	}

	public void setProviderSpeciality(String providerSpeciality) {
		this.providerSpeciality = providerSpeciality;
	}
	
}
