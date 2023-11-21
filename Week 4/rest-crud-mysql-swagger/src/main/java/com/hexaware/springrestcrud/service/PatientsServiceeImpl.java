package com.hexaware.springrestcrud.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.hexaware.springrestcrud.entities.Patients;
import com.hexaware.springrestcrud.repository.PatientsRepository;

@Service
public class PatientsServiceeImpl implements IPatientsService {

	@Autowired
	PatientsRepository repo;
	@Override
	public Patients insertPatients( Patients patient) {
		// TODO Auto-generated method stub
		return repo.save(patient);
	}

	@Override
	public List<Patients> getAllPatients() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Patients updatePatients(Patients patient) {
		// TODO Auto-generated method stub
		return repo.save(patient);
	}

	@Override
	public Patients getPatientsById(int patientId) {
		// TODO Auto-generated method stub
		return repo.findById(patientId).orElse(null);
	}

	@Override
	public void deletePatients(int patientId) {
		repo.deleteById(patientId);
		
	}

	@Override
	public Patients getByPatientName(String patientName) {
		// TODO Auto-generated method stub
		return repo.findByPatientName(patientName);
	}

	@Override
	public List<Patients> getBySalaryGreaterThan(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Patients> getPatientsSorted(double salary) {
		// TODO Auto-generated method stub
		return repo.getPatientsSorted(salary);
	}

	@Override
	public List<Patients> getSorted() {
		// TODO Auto-generated method stub
//		return repo.findAll(Sort.by("patientName"));
		return repo.findAll(Sort.by(Direction.DESC,"patientName"));
	}

//	@Override
//	public Patients getByPatientDob(LocalDate dob) {
//		// TODO Auto-generated method stub
//		return repo.findByPatientDob(dob);
//	}

}
