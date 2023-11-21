package com.hexaware.streamDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapStreamDemo {

	public static void main(String[] args) {
		
		String[] names= {"smith","divya","rajat","kanchan"};
		
		List<String> list= Arrays.asList(names);
		
		list.stream().map((String name)->{
			System.out.println(name);
			return name.length();})
		.forEach((len)->{System.out.println(len);});

	}

}
