package com.hexare.JdbcPractice;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.hexaware.preparedStatement.Patients;
import com.hexaware.preparedStatementDAO.patientDAO;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		patientDAO dao = new patientDAO();

		Scanner sc = new Scanner(System.in);
		boolean flag;

		System.out.println("Enter Deatils of Patient:");
		System.out.println("1.Insert Patient Details:");
		System.out.println("2.Display All data:");
		System.out.println("3.Delete the data according to id:");
		System.out.println("0.Exit");

		int choice = Integer.parseInt(sc.nextLine());

		switch (choice) {
		case 1:
			System.out.println("Enter Patient id:");
			int pid = Integer.parseInt(sc.nextLine());

			System.out.println("Enter Patient name:");
			String pname = sc.nextLine();

			System.out.println("Enter patient Disease");
			String pdisease = sc.nextLine();

			System.out.println("Enter Patient City:");
			String pcity = sc.nextLine();

			Patients p = new Patients(pid, pname, pdisease, pcity);
			int count = dao.insertQuery(p);

			System.out.println("Data Inserted : " + count);
			break;
		case 2:
			
			List<Patients> list=dao.displayAllData();
			
			Iterator<Patients> itr =list.iterator();
			
			while(itr.hasNext())
			{
				Patients s=itr.next();
				System.out.println(s);
			}
			System.out.println("Record Fetched");
			break;
		
		case 3:
			System.out.println("Enter id you want to delete :");
			int eid=Integer.parseInt(sc.nextLine());
			int count1=dao.deleteData(eid);
			System.out.println("Data deleted for id :"+eid);
			break;
			
		case 0:
			System.out.println("You've been logout");
			System.exit(choice);
			break;
			
		default :
			System.err.println("Wrong Choice. Enter Valid Choice .");
			break;

		}

	}

}
