package com.hexaware.FileRead;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FireRead {

	public static void main(String[] args) {
		try
		{
		FileReader fr=new FileReader("input.txt");
		int n=0;
		 
		 while((n=fr.read())!=-1)
		 {
			 System.out.print((char)n);
		 }
		}
		catch(FileNotFoundException c)
		{
			c.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
