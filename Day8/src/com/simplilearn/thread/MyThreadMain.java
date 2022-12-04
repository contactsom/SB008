package com.simplilearn.thread;

public class MyThreadMain {

	//Main Thread
	public static void main(String[] args) {

		MyThread myThread = new MyThread();// Initialization of Thread 
		myThread.start();// Start the Thread
		
		//myThread.run();// Wrong: this act as a normal java method not thread class run method
		
		// Some Thread logic inside the main thread
		for (int i = 0; i < 10; i++) {
					
					System.out.println("Main Thread");
			}
		
	}

}
