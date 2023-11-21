package com.hexaware.lines;

import java.util.stream.Stream;

public class NewStringMethods {

	public static void main(String[] args) {
		
		String str="          Hello \n welcome \n to \n java    ";
		// Strip will delete spaces of both the ends
		// StripTrailing will delete backend spaces
		// StrpLeading will delete front spaces
		Stream<String> stream=str.lines();
		
		stream.filter((line)->{return !line.isBlank();}).
		map(String::stripTrailing).forEach(System.out::println);


	}

}
