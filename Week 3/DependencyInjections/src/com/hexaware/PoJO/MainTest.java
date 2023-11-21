package com.hexaware.PoJO;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee e=new Employee();
//		
//		e.setEid(101);
//		e.setName("Rajat");
//		Address adr=new Address("Pune");
//		adr.setCity("Nagpur");
//		e.setAdr(adr); ////Dependency Inject -Setters and getters
	
		Address adr=new Address("Pune");
		Employee e=new Employee(101, "Rajat", adr);
		System.out.println(e);
	}

}
