package com.hexaware.restapipatients.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.restapipatients.DTO.PatientDTO;
import com.hexaware.restapipatients.entities.Patients;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, Integer> {

	public Patients findByPatientName(String patientName);
}
