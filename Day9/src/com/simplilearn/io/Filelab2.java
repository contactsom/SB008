package com.simplilearn.io;

import java.io.File;
import java.io.IOException;
/* WAP to create a directory*/
public class Filelab2 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("FILE");
		f.mkdir();
		
		
	}
}
