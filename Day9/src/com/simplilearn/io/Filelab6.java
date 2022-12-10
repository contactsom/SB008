package com.simplilearn.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/*WAP to print the name of all the sub directory present in to respective folder */
public class Filelab6 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("lab5.txt");

		FileReader filereader = new FileReader(file);
		//System.out.println(filereader.read()); // Unicode of the First character
		//Ref: https://en.wikipedia.org/wiki/List_of_Unicode_characters
		
		
		char[] ch2 = new char[(int) file.length()]; // Creatd A char array with same file size
		
		filereader.read(ch2); // File data copied in to array
		
		for (char c : ch2) {
			
			System.out.print(c);
		}
		
		System.out.println("****************");
		
	}
}
