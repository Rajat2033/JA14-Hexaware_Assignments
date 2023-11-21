package com.hexaware.MappingCaseStudy;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.MappingCaseStudy.beans.InvoiceDetails;
import com.hexaware.MappingCaseStudy.beans.Patientsnew;

public class OneToOneMapping {

	public static void main(String[] args) {

		SessionFactory sessionfac=HibernateUtil.getSessionFactory();
		
		Session session=sessionfac.openSession();
		Transaction tr=session.beginTransaction();
		
		
	
		
		Patientsnew patient=new Patientsnew();
		patient.setPatient_id(101);
		patient.setPatient_name("Rajat");
		patient.setDob(new Date());
		patient.setGender("Male");
		

		InvoiceDetails data=new InvoiceDetails();
		data.setId(101);
		data.setAmount(50000);
		data.setPatientsnew(patient);
		
		
		
		session.persist(data);
		tr.commit();
		sessionfac.close();
	}

}
