package com.simplilearn.io;

import java.io.File;
import java.io.IOException;
/*WAP to print the name of all the sub directory present in to respective folder */
public class Filelab4 {

	public static void main(String[] args) throws IOException {
		
		File f = new File("/Users/om/SB008/");
		//File f = new File("D:\FolderName"); Windows
		
			String[] directories=f.list();
			
			for (String dir : directories) {
				
				System.out.println(dir);
			}
			
		
		
	}
}
