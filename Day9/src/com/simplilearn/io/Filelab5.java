package com.simplilearn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/*WAP to print the name of all the sub directory present in to respective folder */
public class Filelab5 {

	public static void main(String[] args) throws IOException {
		

		FileWriter filewriter= new FileWriter("lab5.txt",true);
		filewriter.write("I am first Line ");
		filewriter.write("\n");
		
		filewriter.write("I am Second Line ");
		filewriter.write("\n");
		filewriter.write("I am Third Line ");
		filewriter.write("\n");
		filewriter.write("I am Fourth Line ");
		filewriter.write("\n");
		filewriter.write("I am Fifth Line ");
		filewriter.write("\n");
		
		
		filewriter.flush();
		filewriter.close();
		
		
	}
}
