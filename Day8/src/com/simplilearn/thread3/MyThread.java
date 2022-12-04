package com.simplilearn.thread3;

//2. thread by Implementing the Runnable Interface
public class MyThread implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("****Runnable Child****");
		}
	}
	
}
