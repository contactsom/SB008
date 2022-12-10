package com.simplilearn.io;

import java.io.File;
import java.io.IOException;
/* WAP to place a file in to created directory name FILE and create the file lab3.txt */
public class Filelab3 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("FILE","lab3.txt");
		
			f.createNewFile();
			
			
		
		System.out.println("File Created Successfully");
		
		
	}
}
