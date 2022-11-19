package com.simplilearn.whileloop;

public class WhileLoopExample {

	public static void main(String[] args) {

		System.out.println("****** While Loop Case 1");
		int a=10;
		int b=20;
		
		while(a<b) {
			System.out.println("a is less than b");
		}
			System.out.println("I am Done");
			
		
		System.out.println("****** While Loop Case 2");		
		int x=10;
		int y=20;
			
		while(x<y) {
			System.out.println("x is less than y");
			x=x++;
		}
			System.out.println("I am Done");
				
	}

}
