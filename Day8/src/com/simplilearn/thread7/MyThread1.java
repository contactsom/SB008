package com.simplilearn.thread7;

//2. thread by Implementing the Runnable Interface
public class MyThread1 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			Thread.yield();
			System.out.println("2. K L Rahul");
		}
		
		
	}
	
}
