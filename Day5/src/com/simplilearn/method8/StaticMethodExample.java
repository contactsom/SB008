package com.simplilearn.method8;

import com.simplilearn.method9.WirlessPhone;

public class StaticMethodExample {

	public static void main(String[] args) {
		
		//WirlessPhone WirlessPhone = new WirlessPhone();
		//WirlessPhone.getIphone();
		
		WirlessPhone.getIphone(); // Different package
		
		//StaticMethodExample.getMe();
		getMe();// Same class 
		
		
	}

	
	
	public static void getMe() {
		System.out.println("*****Get Me*****");
	}
}
