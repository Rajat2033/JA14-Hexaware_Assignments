package com.hexaware.hibernateApp;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import com.hexaware.hibernateApp.entities.Doctors;
import com.hexaware.hibernateApp.service.DoctorService;
import com.hexaware.hibernateApp.service.IDoctorService;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.hexaware.hibernateApp" })
public class App {

	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(App.class);
		DoctorService service = container.getBean(DoctorService.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to hibernate App");
		System.out.println("1.Add Doctor");
		System.out.println("2.Update Doctor");
		System.out.println("3.Delete Doctor");
		System.out.println("4.Get Doctor By id");
		System.out.println("5.Get All doctors List");
		System.out.println("0.exit");
		int choice = Integer.parseInt(sc.nextLine());
		int docid;
		String name;
		String speciality;
		int exp;
		switch (choice) {
		case 1:
			System.out.println("Enter Values");
			System.out.println("Enter Id of Doctor");
			docid = Integer.parseInt(sc.nextLine());

			System.out.println("Enter Name of Doctor");
			name = sc.nextLine();

			System.out.println("Enter Speciality of Doctor");
			speciality = sc.nextLine();

			System.out.println("Enter experience of Doctor");
			exp = Integer.parseInt(sc.nextLine());

			Doctors doc = new Doctors(docid, name, speciality, exp);

			boolean isAdded = service.addDoct(doc);

			System.out.println("Data Added " + isAdded);
			break;
		case 2:
			System.out.println("Update Values");
			System.out.println("Enter Id of Doctor");
			docid = Integer.parseInt(sc.nextLine());

			System.out.println("Enter Name of Doctor");
			name = sc.nextLine();

			System.out.println("Enter Speciality of Doctor");
			speciality = sc.nextLine();

			System.out.println("Enter experience of Doctor");
			exp = Integer.parseInt(sc.nextLine());

			Doctors doc1 = new Doctors(docid, name, speciality, exp);

			boolean isUpdated = service.updateDoct(doc1);
			System.out.println("Doctor Updated ");
			break;

		case 3:
			System.out.println("Enter Doctor Id You want to delete");
			System.out.println("Enter Doctor id");
			docid = Integer.parseInt(sc.nextLine());

			Boolean isDeleted = service.deleteDoct(docid);
			System.out.println("Record Deleted"+isDeleted);
			break;
		case 4:
			System.out.println("Enter Doctor id to fetch data");
			docid = Integer.parseInt(sc.nextLine());

			Doctors doc2 = service.getById(docid);
			System.out.println("Data Fetched"+doc2);
			break;
		case 0:
			System.out.println("You've been logged out");
			System.exit(choice);
			break;
		case 5:
			System.out.println("Data Fetched of all doctors");
			List<Doctors> list=service.getAllData();
			System.out.println(list);
			break;
		default :
			System.err.println("Enter Valid Input");
			break;

		}
	}
}
