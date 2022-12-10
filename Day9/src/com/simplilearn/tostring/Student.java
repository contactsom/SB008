package com.simplilearn.tostring;

public class Student {

	String stuName;
	String stuRoll;
	
	public Student(String stuName, String stuRoll) {
		super();
		this.stuName = stuName;
		this.stuRoll = stuRoll;
	}

	@Override
	public String toString() {
		
		return "Student {stuName=" + stuName + ", stuRoll=" + stuRoll + "}";
	}
	
	
}
