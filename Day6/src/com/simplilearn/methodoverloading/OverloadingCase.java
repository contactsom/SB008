package com.simplilearn.methodoverloading;

public class OverloadingCase {

	public void getMyName(StringBuffer sb) {
		System.out.println("-----StringBuffer sb-----");
	}
	
	public void getMyName(String s) {
		System.out.println("-----String s-----");
	}
	
	
	public static void main(String[] args) {
		OverloadingCase overloadingCase = new OverloadingCase();
		
		overloadingCase.getMyName(new StringBuffer("ABC"));
		overloadingCase.getMyName("DEF");
		
		//overloadingCase.getMyName(null);//The method getMyName(StringBuffer) is ambiguous for the type OverloadingCase

	}

}
