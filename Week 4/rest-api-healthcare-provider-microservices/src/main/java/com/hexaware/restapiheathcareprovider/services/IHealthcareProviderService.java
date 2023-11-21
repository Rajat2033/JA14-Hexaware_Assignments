package com.hexaware.restapiheathcareprovider.services;

import java.util.List;

import com.hexaware.restapiheathcareprovider.DTO.HealthcareProviderDTO;
import com.hexaware.restapiheathcareprovider.entities.HealthcareProvider;

public interface IHealthcareProviderService {
	public HealthcareProvider addProvider(HealthcareProviderDTO providerDTO);
	public HealthcareProviderDTO getProvideerByName(String providerName);
	public List<HealthcareProvider> getAllProviderData();
	
}