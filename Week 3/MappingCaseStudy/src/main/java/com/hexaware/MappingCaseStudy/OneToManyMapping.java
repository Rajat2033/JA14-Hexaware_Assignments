package com.hexaware.MappingCaseStudy;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.MappingCaseStudy.beans.InsuranceCompany;
import com.hexaware.MappingCaseStudy.beans.InsurancePlans;

public class OneToManyMapping {

	public static void main(String[] args) {
		SessionFactory sessionfac=HibernateUtil.getSessionFactory();

		Session session=sessionfac.openSession();
		
		Transaction tr=session.beginTransaction();
		
		InsurancePlans plan1=new InsurancePlans();
		plan1.setPlanId(1);
		plan1.setPlanName("lifeIns");
		plan1.setPlantype("medical");
		
		InsurancePlans plan2=new InsurancePlans();
		plan2.setPlanId(2);
		plan2.setPlanName("AccidentIns");
		plan2.setPlantype("MedicalClaim");
		
		InsurancePlans plan3=new InsurancePlans();
		plan3.setPlanId(3);
		plan3.setPlanName("growLifeIns");
		plan3.setPlantype("Retirement");
		
		
		Set<InsurancePlans>  planset=new HashSet<InsurancePlans>();
		
		planset.add(plan1);
		planset.add(plan2);
		planset.add(plan3);
		InsuranceCompany company1=new InsuranceCompany();
		company1.setCompanyId(101);
		company1.setCopanyName("MaxLife insurances");
		
		
		
		InsuranceCompany company2=new InsuranceCompany();
		company2.setCompanyId(102);
		company2.setCopanyName("SunLife insurances");
		
		company1.addplans(plan1);
		company2.addplans(plan2);
		company1.addplans(plan3);
		company2.addplans(plan1);
		
		session.persist(company1);
		session.persist(company2);
		
		tr.commit();
		sessionfac.close();
		
	
	}

}
