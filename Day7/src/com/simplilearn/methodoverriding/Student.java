package com.simplilearn.methodoverriding;

public class Student extends University {

	@Override
	public String getMyUniversity() {
		
			return "I am in Student University";
			
		}
	
	public String getMyUniversityLocation(String name) {
			
			return "I am in BANGALORE";
		}


	public String getMyUniversityZip(String zip) {
		
		return "I am in BANGALORE 621435";
	}

	
	public Integer getMyUniversityFee(String zip) {
			
			return 101;
		}
	
	
	
	public Integer getMyUniversityCode(String zip) {
		
		return 8888;
	}

	
	
	
	
	
	
	
	
	

}
