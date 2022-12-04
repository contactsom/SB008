package com.simplilearn.thread3;

public class MyThreadMain {

	public static void main(String[] args) {
		
		
		MyThread myThread = new MyThread();// Born 
		
		Thread thread = new Thread(myThread);
		
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("****Runnable Parent ****");
		}
	}
}
