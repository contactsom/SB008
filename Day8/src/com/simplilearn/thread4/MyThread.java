package com.simplilearn.thread4;

//2. thread by Implementing the Runnable Interface
public class MyThread implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("****Runnable Child****");
		}
		
		System.out.println("MyThread- "+Thread.currentThread().getName()); // MyThread- Thread-0
		Thread.currentThread().setName("--I am Child Thread--");
		System.out.println("MyThread- "+Thread.currentThread().getName()); // --I am Child Thread--
	}
	
}
