package com.hexaware.streamDemo;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		
		Integer arr[]= {30,45,55,15,20,25,65};
		
		Stream<Integer> stream1=Arrays.stream(arr);
		
//		stream1.forEach((element)-> {System.out.print(element+" ");});
//						OR
		stream1.forEach(System.out::println);
		///Method Reference or Constructor References ::
	}

}
