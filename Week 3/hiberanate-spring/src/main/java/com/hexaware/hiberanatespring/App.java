package com.hexaware.hiberanatespring;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hiberanatespring.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
    	System.out.println(sessionFactory);
    	Session session=sessionFactory.openSession();
    	
    	Transaction t=session.beginTransaction();
    	
    	Employee emp= new Employee(101, "Kanchan",20000);
    	Serializable s= session.save(emp);
    	
    	System.out.println("Data Inserted "+s.toString());
    	
    	t.commit();
       
    }
}
