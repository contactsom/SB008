package com.simplilearn.thread4;

public class MyThreadMain {

	public static void main(String[] args) {
		
		
		MyThread myThread = new MyThread();// Born 
		
		Thread thread = new Thread(myThread);
		
		thread.start();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("****Runnable Parent ****");
		}
		
		
		System.out.println("*************** Thread Details ************");
		
		
		System.out.println("MyThreadMain- "+Thread.currentThread().getName()); //MyThreadMain- main
		
		Thread.currentThread().setName("--I am main Thread--");
		
		System.out.println("MyThreadMain- "+Thread.currentThread().getName()); //--I am main Thread--
		
		
		
		
		
	}
}
