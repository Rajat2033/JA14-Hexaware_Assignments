package com.hexaware.Thread;

public class RennableMethod implements Runnable{

	public static void main(String[] args)
	{
		Runnable r=new RennableMethod();
		
		Thread t=new Thread(r);
		Thread t1=new Thread(r);
		
		t.start();
		t1.start();
		t.setName("Run");
		t1.setName("Walk");
//		for(int i=0;i<5;i++)
//		{
//			t.setName("Run");
//			System.out.println(i);
//		}
//		
//		System.out.println(t.getName());
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
		
	}

}
