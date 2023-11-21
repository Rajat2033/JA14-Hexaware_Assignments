package com.hexaware.MappingCaseStudy;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.MappingCaseStudy.beans.HealthcareProvider;
import com.hexaware.MappingCaseStudy.beans.Patients;



public class ManyToManyMapping {

	public static void main(String[] args) {
		SessionFactory sessionfac=HibernateUtil.getSessionFactory();
		Session session=sessionfac.openSession();
		Transaction tr= session.beginTransaction();
		
		
		Patients patients1=new Patients();
		patients1.setPatient_id(1);
		patients1.setPatient_name("Rajat Darvhekar");
		patients1.setGender("Male");
		patients1.setDob(new Date(2016, 12, 15));
		
		Patients patients2=new Patients();
		patients2.setPatient_id(2);
		patients2.setPatient_name("Kanchan Pandey");
		patients2.setGender("Female");
		patients1.setDob(new Date(2015, 12, 15));
		
		
		Patients patients3=new Patients();
		patients3.setPatient_id(3);
		patients3.setPatient_name("Sonu Bhanarkar");
		patients3.setGender("Male");
		patients3.setDob(new Date(2017, 10, 13));


		HealthcareProvider provider1=new HealthcareProvider();
		provider1.setProvider_id(101);
		provider1.setProvider_name("Mr.Mathur");
		provider1.setProvider_exp(5);
		provider1.setProvider_designation("OPD");
		

		HealthcareProvider provider2=new HealthcareProvider();
		provider2.setProvider_id(102);
		provider2.setProvider_name("Mr.Radhika");
		provider2.setProvider_exp(15);
		provider2.setProvider_designation("OPD");
		
		provider1.addPatients(patients1);
		provider1.addPatients(patients3);
		provider2.addPatients(patients1);
		provider2.addPatients(patients2);
		provider2.addPatients(patients3);
		
		session.persist(provider1);
		session.persist(provider2);
		tr.commit();
		sessionfac.close();
	}

}
