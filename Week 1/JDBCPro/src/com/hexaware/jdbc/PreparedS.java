package com.hexaware.jdbc;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hexaware.jdbc.DAO.Employee;
import com.hexaware.jdbc.DAO.EmployeeDAO;

public class PreparedS {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		EmployeeDAO e=new EmployeeDAO();
		Scanner sc=new Scanner(System.in);
		boolean flag;
	
		System.out.println("Enter Choice :");
		System.out.println("1.Insert");
		System.out.println("2.Update");
		System.out.println("3.Delete");
		System.out.println("4.Display by id");
		System.out.println("5.Display all records");
		System.out.println("0.exit");
		int choice=Integer.parseInt(sc.nextLine());
		switch(choice)
		{
		case 1:
		
		System.out.println("Enter Details");
		int id=Integer.parseInt(sc.nextLine());
		String  name=sc.nextLine();
		String city=sc.nextLine();
		
		Employee emp= new Employee(id, name, city);
	    int count=e.insertQuery(emp);
		System.out.println("Record Inserted"+count);
		break;
		
		case 2:
		
			System.out.println("Enter Details");
			int id1=Integer.parseInt(sc.nextLine());
			String  name1=sc.nextLine();
			String city1=sc.nextLine();
			
			Employee emp1= new Employee(id1, name1, city1);
			int count1 =e.updateQuery(emp1);
			System.out.println("Record Updated"+count1);
			break;
		
		case 3:
			System.out.println("Enter eid");
			int id2=Integer.parseInt(sc.nextLine());
			int count2 =e.deleteQuery(id2);
			System.out.println("Record deleted"+count2);
		
		case 4:
			System.out.println("Enter eid");
			int id3=Integer.parseInt(sc.nextLine());
			
			String count4=e.sortById(id3);
			System.out.println("Data Retrieved \n"+count4);
			break;
			
		case 5:
//			
			
			List<Employee> count3 =e.displayData();
//			
			Iterator<Employee> itr= count3.iterator();
			while(itr.hasNext())
			{
				Employee s=itr.next();
				System.out.println(s);
			}
//			for (Employee emp4 : count3) {
//				System.out.println(emp4);
//				
//			}
			System.out.println("Record retrieved");
				break;
		case 0:
			System.out.println("Thank You0");
			flag=false;
			
			break;
		
			
			
		}
	}

}
