package com.simplilearn.hashcode;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(stuName, stuRoll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(stuName, other.stuName) && Objects.equals(stuRoll, other.stuRoll);
	}
	
	
	
	
}
