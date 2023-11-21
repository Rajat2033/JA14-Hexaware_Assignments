package com.hexaware.services;

import java.util.List;

import com.hexaware.DTO.HealthcareProviderDTO;
import com.hexaware.entities.Patients;


public interface IHealthcareProviderService {
	public String addUser(Patients patient);

	public HealthcareProviderDTO getProvider(int providerId);
	/* public HealthcareProviderDTO getProvideerByName(String providerName); */
	public List<HealthcareProviderDTO> getAllProviderData();
	
	
}