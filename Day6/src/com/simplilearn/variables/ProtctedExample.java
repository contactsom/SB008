package com.simplilearn.variables;

public class ProtctedExample {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		String mName=mobile.mobileName;
		int mprice=mobile.mobilePrice;
		
		System.out.println("Mobile Class- "+mName);
		System.out.println("Mobile Class- "+mprice);
		
		
		// Mobile : Parent
		// Samsung : Child
		
		Samsung samsung = new Samsung();// Created the Object of Child Class
		
		String mobileName=samsung.mobileName;// With the referance of child class (Samsung) I am accessing the parent(Mobile) class variables .
		int mobilePrice=samsung.mobilePrice;// With the referance of child class (Samsung) I am accessing the parent(Mobile) class variables .
		
		String samsungmobileName=samsung.smobileName;
		int samsungmobilePrice=samsung.smobilePrice;
		
		
		
		
	}
}
