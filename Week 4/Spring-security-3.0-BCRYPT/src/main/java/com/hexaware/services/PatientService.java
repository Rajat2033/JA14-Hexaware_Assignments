package com.hexaware.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Service;

import com.hexaware.entities.Patients;
import com.hexaware.repository.PatientRepository;

@Service
public class PatientService {
	
	
	@Autowired
	PatientRepository repo;
	
	public List<Patients> getAllPatient()
	{
		return null;
		
	}

}
