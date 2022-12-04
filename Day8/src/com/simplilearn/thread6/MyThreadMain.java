package com.simplilearn.thread6;

public class MyThreadMain {

	public static void main(String[] args) {
		
		
		MyThread myThread = new MyThread();// Born 
		
		Thread thread = new Thread(myThread);
		
		thread.start();
		
		
		MyThread2 myThread2 = new MyThread2();// Born 
		
		Thread thread2 = new Thread(myThread2);
		
		thread2.start();
		
		
		MyThread3 myThread3 = new MyThread3();// Born 
		
		Thread thread3 = new Thread(myThread3);
		
		thread3.start();
		
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("****Runnable Parent ****");
		}
		
	}
}
