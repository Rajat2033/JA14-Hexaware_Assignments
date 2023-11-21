package com.hexaware.restapiheathcareprovider.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restapiheathcareprovider.DTO.HealthcareProviderDTO;
import com.hexaware.restapiheathcareprovider.entities.HealthcareProvider;
import com.hexaware.restapiheathcareprovider.repository.HealthcareProviderRepository;
@Service
public class HeathcareProviderServiceImpl implements IHealthcareProviderService {

	
	@Autowired
	HealthcareProviderRepository repo;
	@Override
	public HealthcareProvider addProvider(HealthcareProviderDTO providerDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HealthcareProviderDTO getProvideerByName(String providerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HealthcareProvider> getAllProviderData() {
		// TODO Auto-generated method stub
		return null;
	}

}
