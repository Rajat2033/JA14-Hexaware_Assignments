package com.hexaware.FileReading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		int s = 0;
		try {
			FileReader f = new FileReader("Input.txt");

			try {
				s = f.read();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println((char)s);
			while((s = f.read())!=-1)
			{
				System.out.print((char)s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
