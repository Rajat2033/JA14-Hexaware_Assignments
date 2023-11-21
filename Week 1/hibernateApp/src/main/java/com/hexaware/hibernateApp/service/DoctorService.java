package com.hexaware.hibernateApp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hibernateApp.dao.IDoctorDao;
import com.hexaware.hibernateApp.entities.Doctors;

@Service
public class DoctorService implements IDoctorService {

	@Autowired
	IDoctorDao dao;
	@Override
	public boolean addDoct(Doctors doc) {
		// TODO Auto-generated method stub
		return dao.addDoct(doc);
	}

	@Override
	public boolean updateDoct(Doctors doc) {
		// TODO Auto-generated method stub
		return dao.updateDoct(doc);
	}

	@Override
	public boolean deleteDoct(int docid) {
		// TODO Auto-generated method stub
		return dao.deleteDoct(docid);
	}

	@Override
	public Doctors getById(int docid) {
		// TODO Auto-generated method stub
		return dao.getById(docid);
	}

	@Override
	public List<Doctors> getAllData() {
		// TODO Auto-generated method stub
		return null;
	}

}
