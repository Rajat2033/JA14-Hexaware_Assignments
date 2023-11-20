package com.hexaware.hibernateApp.dao;

import java.util.List;

import com.hexaware.hibernateApp.entities.Doctors;

public interface IDoctorDao {
	public boolean addDoct(Doctors doc);
	public boolean updateDoct(Doctors doc);
	
	public Doctors getById(int docid);
	public List<Doctors> getAllData();
	boolean deleteDoct(int docid);
}
