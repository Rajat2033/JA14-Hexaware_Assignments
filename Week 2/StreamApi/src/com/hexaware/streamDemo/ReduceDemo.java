package com.hexaware.streamDemo;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class ReduceDemo {

	public static void main(String[] args) {
int arr1[] = { 15, 20};
		
		IntStream stream2=Arrays.stream(arr1);
		
		OptionalInt optional=stream2.reduce((element1,element2)->{return element1+element2;});
		
		if(optional.isPresent())
		{
			int result=optional.getAsInt();
			System.out.println(result);
		}
		else
		{
			System.err.print("Error Empty");
		}
			// OR
		
		IntStream stream3=Arrays.stream(arr1);
		int result=stream3.reduce((a,b)->{return a-b;} ).orElse(0);

		System.out.println(result);
		
			
		

	

	}

}
