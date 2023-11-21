package com.hexaware.lines;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {

	public static void main(String[] args) throws IOException {

			Path p=Paths.get("input.ext");
			String data=Files.readString(p);
			
			
			Path p2=Paths.get("input.ext");
			Files.writeString(p2, data);
			
			System.out.println(data);

	}

}
