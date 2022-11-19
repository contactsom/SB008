package com.simplilearn.ifelse;

public class IfElseIfExample {

	public static void main(String[] args) {
		
		// Case : 1
		int a=20;
		
		if(a<20) {//false
			System.out.println("a is less than 20");
			
		}else if(a==20) {// true
			System.out.println("a is equla to 20");
			
		}else {
			System.out.println("a is Grater Than 20");
		}
		
		// case : 2
		int b=20;
		
		if(b<30) {// true
			System.out.println("b is less than 30");
			
		}else if(b==20) {// true
			System.out.println("b is equla to 20");
			
		}else {
			System.out.println("b is Grater Than 20");
		}
		
		
		// Case : 3
		int c=200;
		
		if(c<30) {// false
			System.out.println("c is less than 30");
			
		}else if(c==20) {// false
			System.out.println("c is equla to 20");
			
		}else {
			System.out.println("c is Neither Less than 30 nor Equal to 20");
		}
		
		
	}

}
