package com.hexaware.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hexaware.DTO.HealthcareProviderDTO;

import com.hexaware.entities.Patients;
import com.hexaware.repository.PatientRepository;
@Service
public class HealthcareProviderServiceImpl implements IHealthcareProviderService {

	List<HealthcareProviderDTO>  providerList=new ArrayList<>();
	
	@Autowired
	PatientRepository repo;
	
	@Autowired
	private PasswordEncoder encoder;

	@Autowired
	HealthcareProviderDTO provider;
	

	@Override
	public List<HealthcareProviderDTO> getAllProviderData() {
		providerList.add(new HealthcareProviderDTO(1, "Sharmila", "OPD"));
		providerList.add(new HealthcareProviderDTO(2,"Kavita", "Nurse"));
		providerList.add(new HealthcareProviderDTO(3, "Geeta", "Physiotherapy"));
		providerList.add(new HealthcareProviderDTO(4, "Babita", "OPD"));
		return providerList;
	}


	@Override
	public String addUser(Patients patient) {
		   patient.setPatientPassword(encoder.encode(patient.getPatientPassword()));
	        repo.save(patient);
	        
	        return "User Has Added";
	}


	@Override
	public HealthcareProviderDTO getProvider(int providerId) {
	    return providerList.stream()
                .filter( provider -> provider.getProviderId() == providerId)
                .findAny()
                .orElseThrow(() -> new RuntimeException("provider " + providerId + " not found"));
	}
	
}
