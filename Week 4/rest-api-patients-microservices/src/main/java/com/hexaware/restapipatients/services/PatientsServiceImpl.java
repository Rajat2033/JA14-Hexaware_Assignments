package com.hexaware.restapipatients.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restapipatients.DTO.PatientDTO;
import com.hexaware.restapipatients.entities.Patients;
import com.hexaware.restapipatients.repository.PatientsRepository;

@Service
public class PatientsServiceImpl implements IPatientsService {

	@Autowired 
	PatientsRepository repo;
	
	@Override
	public Patients addPatients(PatientDTO patientDTO) {
		Patients patient =new Patients();
		patient.setPatientName(patientDTO.getPatientName());
		patient.setPatientPassword(patientDTO.getPatientPassword());
		patient.setPatientDOB(patientDTO.getPatientDOB());
		patient.setPatientGender(patientDTO.getPatientGender());
		patient.setPatientContact(patientDTO.getPatientContact());


		patient.setPatientAddress(patientDTO.getPatientAddress());
		patient.setPatientDisease(patientDTO.getPatientDisease());
		
	
		
		return repo.save(patient);
	}

	@Override
	public PatientDTO getPatientByName(String patientName) {
		
		Patients patient=repo.findByPatientName(patientName);
		PatientDTO patientDTO=new PatientDTO();
		patientDTO.setPatientName(patient.getPatientName());
		patientDTO.setPatientAddress(patient.getPatientAddress());
		patientDTO.setPatientContact(patient.getPatientContact());
		patientDTO.setPatientDisease(patient.getPatientDisease());
		patientDTO.setPatientDOB(patient.getPatientDOB());
		patientDTO.setPatientGender(patient.getPatientGender());
		patientDTO.setPatientPassword(patient.getPatientPassword());
	
		return patientDTO;
	}

	@Override
	public List<Patients> getAllPatients() {
		return repo.findAll();
	}

}
