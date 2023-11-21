package com.hexaware.springrestcrud.service;

import java.time.LocalDate;
import java.util.List;

import com.hexaware.springrestcrud.entities.Patients;

public interface IPatientsService {

	public Patients insertPatients(Patients patient);

	public Patients updatePatients(Patients patient);

	public Patients getPatientsById(int patientId);

	public void deletePatients(int patientId);

	List<Patients> getPatientsSorted(double salary);

	public List<Patients> getAllPatients();

	public List<Patients> getBySalaryGreaterThan(double salary);

	public Patients getByPatientName(String patientName);
	
	public List<Patients> getSorted();
//
//	public Patients getByPatientDob(LocalDate dob);

}
