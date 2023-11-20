package com.hexaware.springrestcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestcrud.entities.Patients;

@Repository
public interface PatientsRepository extends JpaRepository<Patients, Integer> {

	//should start with findBy
	
	public Patients findByPatientName(String patientName);
	
	public List<Patients> findBySalaryGreaterThan(double salary);
	
	//writing customized query
	
//	@Query("select p from Patients p where p.salary > ?1")
	@Query("select p from Patients p where p.salary > ?1 order by p.patientName")
	List<Patients> getPatientsSorted(double salary);
	
	
//	public Patients findByPatientDob(LocalDate dob);
	
	
	
}
