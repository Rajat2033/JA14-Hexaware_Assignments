package com.hexaware.Exception;

public class ExceptionDemo {

	public static void main(String[] args)  {
		int acc[]= {101,102,103,104,105};
		String names[]= {"Rajat","Kanchan","Javeed","sonu","Pranay"};
		double balance[]= {5000.0,6000.0,7000.0,3000.0,2000.0};

		for(int i=0;i<acc.length;i++)
		{
			System.out.println(acc[i]+" "+names[i]+" "+balance[i]);
			if(balance[i]<4000.0)
			{
				try {
				throw new LowBalanceException();
				}
			
				catch(LowBalanceException e)
			{
					System.out.println(names[i]+ " Your Balance is low than "+balance[i]);
			}
			}
		}
		
	}

}
