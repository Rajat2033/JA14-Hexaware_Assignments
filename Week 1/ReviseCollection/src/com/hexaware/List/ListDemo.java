package com.hexaware.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		
		list.add("Hello");
		list.add("Hello");
		list.add("Hexaware");
		list.add("This is Rajat Darvhekar");
		list.add("Doing Collection");
		
		System.out.println(list);
		
		for (String object : list) {
			
			System.out.println(object);
			
		}
		System.out.println("***************");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())
		{
			String b=itr.next();
			System.out.println(b);
		}
		
List<String> list1=new Vector<String>();
		
		list.add("HII");
		list.add("Hello");
		list.add("Cognizant");
		list.add("This is Rajat Darvhekar");
		list.add("Doing Collection");
		
		
		
		
		Iterator<String> itr1=list.iterator();
		System.out.println("***************");
		while(itr1.hasNext())
		{
			
			String b=itr1.next();
			System.out.println(b);
		}
		
		
		

	}

}
