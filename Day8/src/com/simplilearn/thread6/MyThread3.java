package com.simplilearn.thread6;

//2. thread by Implementing the Runnable Interface
public class MyThread3 implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			Thread.yield();
			System.out.println("Child Thread 3 - ");
		}
		
		
	}
	
}
