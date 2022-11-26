package com.simplilearn.superthis;

public class University extends College {

	 String universityName;
	 String universityAddress;
	 
	 // University - Child
	 // College - Parent
	 
	public University(String collageName, String collageAddress, String universityName, String universityAddress) {
		
		super(collageName, collageAddress);
		
		this.universityName = universityName;
		this.universityAddress = universityAddress;
	}

	public University() {
		super();
	}

	public University(String collageName, String collageAddress) {
		super(collageName, collageAddress);
	}
	
	
	 
	 
	 
	 
	 
}
