package com.hexaware.Thread;

public class Admission implements Runnable {
	int seats =1;
	public static void main(String[] args) {
		Admission a=new Admission();
		Thread t=new Thread(a,"Kanchan");
		Thread t1=new Thread(a,"Rajat");
		t.start();
		t1.start();
		
		

	}

	@Override
	public synchronized void run() {
		System.out.println("Seats Available Now "+seats);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(seats>0)
		{
			
			System.out.println(Thread.currentThread().getName()+" You have got seats");
			seats=seats-1;
			
		}
		else
		{
			System.err.println(Thread.currentThread().getName()+" Try next year");
		}
		
	
	}

}
