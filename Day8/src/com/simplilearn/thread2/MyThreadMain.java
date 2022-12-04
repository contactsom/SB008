package com.simplilearn.thread2;

public class MyThreadMain {

	//Main Thread
	public static void main(String[] args) {

		MyThread myThread = new MyThread();// Initialization of Thread 
		myThread.start();// Start the Thread
		
		// Some Thread logic inside the main thread
		for (int i = 0; i < 10; i++) {
					
					System.out.println("Main Thread");
			}
		
		// Starting the thread again
		myThread.start();// Start the Thread
	}

}
