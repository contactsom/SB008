package com.simplilearn.hashcode;

public class StudentMain {


	public static void main(String[] args) {
		
		Student student1= new Student("ANGSHUMAN BHATTACHARYYA ","101");
		Student student2= new Student("Inturi Chandra  ","102");
		
		System.out.println(student1.hashCode()); 
		System.out.println(student2.hashCode()); 
		
		
	}
}


