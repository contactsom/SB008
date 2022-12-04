package com.simplilearn.thread8;

//2. thread by Implementing the Runnable Interface
public class MyThread implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			Thread.yield();
			//System.out.println("Inzamam-ul-Haq on non strike ");
			System.out.println("Virat Kohli Playing ");
			
		}
		
		
	}
	
}
