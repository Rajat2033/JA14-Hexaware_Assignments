package com.hexaware.hibernateApp.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hexaware.hibernateApp.HibernateUtil;
import com.hexaware.hibernateApp.entities.Doctors;

@Repository
public class DoctorDAO implements IDoctorDao{
	
	SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
	Session session=sessionfactory.openSession();
	Transaction t=session.beginTransaction();
	
	@Override
	public boolean addDoct(Doctors doc) {
		session.save(doc);
		t.commit();
	return true;
		
	}

	@Override
	public boolean updateDoct(Doctors doc) {
		session.saveOrUpdate(doc);
		t.commit();
		return true;
	}

	@Override
	public boolean deleteDoct(int docid) {
		session.delete(docid);
		
		return true;
	}

	@Override
	public Doctors getById(int docid) {
		Doctors doc=session.get(Doctors.class, docid);
		
		return doc;
	}

	@Override
	public List<Doctors> getAllData() {
		TypedQuery<Doctors> query= session.getNamedQuery("getDocRecord");
		List list =query.getResultList();
		t.commit();
		
		return list;
	}

}
