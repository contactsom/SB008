package com.simplilearn.thread5;

public class MyThreadMain {

	public static void main(String[] args) {
		
		
		MyThread myThread = new MyThread();// Born 
		
		Thread thread = new Thread(myThread);
		
		thread.setPriority(Thread.MAX_PRIORITY);
		
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("****Runnable Parent ****");
		}
		
		
		System.out.println("After Main Thraed Priority - "+thread.getPriority());
		
	}
}
