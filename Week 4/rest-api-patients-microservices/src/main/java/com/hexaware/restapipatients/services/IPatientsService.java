package com.hexaware.restapipatients.services;

import java.util.List;

import com.hexaware.restapipatients.DTO.PatientDTO;
import com.hexaware.restapipatients.entities.Patients;

public interface IPatientsService {
	public Patients addPatients(PatientDTO patientDTO);
	public PatientDTO getPatientByName(String patientName);
	public List<Patients> getAllPatients();

}
