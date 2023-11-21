package com.hexaware.Set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		
		set.add(101);
		set.add(102);
		set.add(103);
		set.add(104);
		set.add(105);
		
		System.out.println(new Employee(101, "Rajat",1000));
		System.out.println(new Employee(104, "Kanchan", 8000));
		System.out.println(new Employee(103,"Ruchi",3000));
		System.out.println(new Employee(106, "Babu", 7000));

	}

}
