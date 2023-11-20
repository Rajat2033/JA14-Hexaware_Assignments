package com.hexaware.MappingHibernate;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.MappingHibernate.beans.Department;
import com.hexaware.MappingHibernate.beans.Student;

public class OnetoManyMapping {

	public static void main(String[] args) {
		SessionFactory sessionfactory=HibernateUtil.getSessionFactory();
		Session session=sessionfactory.openSession();
		Transaction tr= session.beginTransaction();
		
		Student s=new Student();
		s.setStuid(1);
		s.setStudname("Kanchan");
		s.setSalary(20000);
		
		Student s1=new Student();
		s1.setStuid(2);
		s1.setStudname("Pandey");
		s1.setSalary(40000);
		
		Student s2=new Student();
		s2.setStuid(3);
		s2.setStudname("Rajat");
		s2.setSalary(50000);
		
		Set<Student> student=new HashSet<Student>();
		student.add(s);
		student.add(s1);
		student.add(s2);
		
		Department department=new Department();
		department.setDeptId(100);
		department.setDeptName("Computer Technology");
		department.setStudents(student);
		
		session.persist(department);
		tr.commit();
		
	

	}

}
