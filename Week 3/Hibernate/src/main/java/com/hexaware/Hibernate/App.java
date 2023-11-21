package com.hexaware.Hibernate;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.Hibernate.entity.Product;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = ProductUtil.getSessionFactory();


		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
//		Product p = new Product(105, "Mobiles", 5000);
//      Save() inserting the value
//		Serializable ser = session.save(p);

		
		
		
		
//      saveorUpdate() insert if not exist if exist then update
//      session.saveOrUpdate(p);
//      System.out.println("Record Updated");
		
		
		
		
//      get (classname,id) fetch by id 
//		Product pData = session.get(Product.class, 105);
//      System.out.println(pData);

		
		
		
		
// 		delete deletes data by id
//      session.delete(pData);
		
		
		
		
		
//		To get single data by HQL
//		Query query = session.createQuery("Select p from Product p where p.pname='Clothes'");
//		System.out.println(query.getSingleResult());
		
		
		
		
		
//		Using Create Named QQuery
		javax.persistence.Query query3=	session.getNamedQuery("getProRecord");
	    List<Product> list =  query3.getResultList();
	    System.out.println("Returning Using get NamedQuery");
		for(Product p1:list)
		{
		System.out.println(p1);
		}
	   
		
//		Using Create Named setting parameter Parameter
		
	TypedQuery<Product> query4=session.getNamedQuery("SortByName");
	query4.setParameter("name", "Clothes");
	
	List list1 =  query4.getResultList();
    System.out.println("Returning Using setting parameter \n"+ list1);
	
		
		
		
		
//		To get All the data use CreateQuery(HQL)
//		Query query1 = session.createQuery("Select p from Product p");
//
//		List<Product> list =  query1.getResultList();
//		for(Product p:list)
//		{
//		System.out.println(list);
//		}
		tr.commit();
		sessionFactory.close();
	}
}
