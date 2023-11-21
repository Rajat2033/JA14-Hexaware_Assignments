package com.hexaware.streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
//		Integer arr[] = { 30, 45, 55, 15, 20, 25, 65 };
//
//		Stream<Integer> in = Arrays.stream(arr);
//		in.distinct().forEach(System.out::println);

		int arr1[] = { 15, 20, 25, 65 };
		
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
	}

}
