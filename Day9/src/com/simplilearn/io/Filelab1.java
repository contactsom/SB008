package com.simplilearn.io;

import java.io.File;
import java.io.IOException;
/* WAP to create a file name with abc.ttxt in current working directory*/
public class Filelab1 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		f.createNewFile();
		
		
	}
}
