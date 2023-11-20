package com.hexaware.springrestcrud.restcontroller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestcrud.entities.Patients;
import com.hexaware.springrestcrud.service.IPatientsService;

@RestController
@RequestMapping("/api/patients")
public class PatientsRestController {
	
	@Autowired
	IPatientsService service;
	@PostMapping(value="/add",consumes="application/json",produces="application/json")
	public Patients insertPatient(@RequestBody Patients patient)
	{
		return service.insertPatients(patient);
	}
	
	
	@PutMapping("/update")
	public Patients updatePatient(@RequestBody Patients patient)
	{
		return service.updatePatients(patient);
	}
	
	@GetMapping("/getbyid/{patientId}")
	public Patients getById(@PathVariable int patientId)
	{
		return service.getPatientsById(patientId);
	}
	
	@DeleteMapping("/delete/{patientId}")
	public String deleteById(@PathVariable int patientId)
	{
		 service.deletePatients(patientId);
		 return "Record Deleted";
	}
	
	@GetMapping(value="/getall",produces="application/json")
	public List<Patients> getAllPatients()
	{
		return service.getAllPatients();
	}
	
	@GetMapping("/getbyname/{patientName}")
	public Patients getByName(@PathVariable String patientName)
	{
		return service.getByPatientName(patientName);
	}
	@GetMapping("/get/geater/{salary}")
	public List<Patients> getGreaterSalary(@PathVariable double salary)
	{
		return service.getBySalaryGreaterThan(salary);
	}
	
	@GetMapping("/get/sorted/{salary}")
	public List<Patients> getPatientsSorted(@PathVariable double salary)
	{
		return service.getPatientsSorted(salary);
	}
	
	@GetMapping("/get/sorted")
	public List<Patients> getSorted()
	{
		return service.getSorted();
	}
	
//	@GetMapping("/getbydob/{dob}")
//	public Patients getByDob(@PathVariable LocalDate dob)
//	{
//		return service.getByPatientDob(dob);
//	}

}
