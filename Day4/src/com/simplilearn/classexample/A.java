package com.simplilearn.classexample;

import com.simplilearn.classecample2.C;

public class A {

	public static void main(String[] args) {

		B b = new B();// I am creating the Object Of Class B
		b.getMe();// I am calling the getMe Method From Class B in to Class A.
		
		
		C c = new C();// I am creating the Object Of Class C 
		c.getMeFromC();// I am calling the getMeFromC Method From Class C in to Class A.
		
		
	}

}
