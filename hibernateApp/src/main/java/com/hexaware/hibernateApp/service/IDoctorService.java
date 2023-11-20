package com.hexaware.hibernateApp.service;

import java.util.List;

import com.hexaware.hibernateApp.entities.Doctors;

public interface IDoctorService {
	
	public boolean addDoct(Doctors doc);
	public boolean updateDoct(Doctors doc);
	public boolean deleteDoct(int docid);
	public Doctors getById(int docid);
	public List<Doctors> getAllData();
	
	

}
