package com.hexaware.Thread;


public class ThreadMethod1 extends Thread  {

	public static void main(String[] args) { // JVM will create one main thread
		
		ThreadMethod1 t1=new ThreadMethod1(); //user defined thread
		t1.setName("Rajat");
		for(int i=0;i<5;i++)
		{
			System.out.println("Main "+i);
		}
		
		
		
		t1.start(); //internally calling run method
		System.out.println(t1);

	}
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("Child "+i);
		}
	}

	

}
