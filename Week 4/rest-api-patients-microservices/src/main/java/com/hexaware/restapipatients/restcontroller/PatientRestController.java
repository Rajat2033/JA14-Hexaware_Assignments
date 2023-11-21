 package com.hexaware.restapipatients.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restapipatients.DTO.PatientDTO;
import com.hexaware.restapipatients.entities.Patients;
import com.hexaware.restapipatients.services.IPatientsService;

@RestController
@RequestMapping("/api/patients")
public class PatientRestController {
	
	@Autowired
	IPatientsService service;
	
	@PostMapping("/add")
	public Patients insertpatients(@RequestBody PatientDTO patientDTO)
	{
		return service.addPatients(patientDTO);
	}
	
	@GetMapping("/getbyname/{patientName}")
	public PatientDTO getPatientByName(@PathVariable String patientName)
	{
		return service.getPatientByName(patientName);
	}
	
	@GetMapping("/getall")
	public List<Patients> getAllPatientData()
	{
		return service.getAllPatients();
	}

}
