package com.simplilearn.tostring;

public class StudentMain {


	public static void main(String[] args) {
		
		Student student1= new Student("ANGSHUMAN BHATTACHARYYA ","101");
		Student student2= new Student("Inturi Chandra  ","102");
		
		System.out.println(student1); // com.simplilearn.tostring.Student@15db9742
		System.out.println(student2); // com.simplilearn.tostring.Student@6d06d69c
		
		System.out.println(student1.toString()); // com.simplilearn.tostring.Student@15db9742
		System.out.println(student2.toString()); // com.simplilearn.tostring.Student@6d06d69c
		
	}
}


