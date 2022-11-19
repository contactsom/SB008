package com.simplilearn.dowhileloop;

public class DoWhileExample4 {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		
		do {
			System.out.println("a is less than b");
			a++;//11,12,13......20
		}while(a<b);// 11<20=T, 12<20=T,13<20=T.......20<20=F
		
	}


}
