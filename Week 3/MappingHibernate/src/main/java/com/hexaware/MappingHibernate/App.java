package com.hexaware.MappingHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.MappingHibernate.beans.Address;
import com.hexaware.MappingHibernate.beans.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = ProductUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Transaction tr = session.beginTransaction();
//		Address address = new Address(10, "Nagpur", "440009");
//		Employee employee = new Employee(102, "Rajat Darvhekar", address);
		
		Employee employee=new Employee(104, "Ratna");
		Address address=new Address(15, "Hyderabad","4440000", employee);
		//output - will only enter address but employee will not enter as employee is owner
//	 By using employee we can access address but by using address we will not access employee
		session.persist(address);
		tr.commit();
	}
}
