package com.simplilearn.thread9;

public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		Greetings greetingsThread1 = new Greetings();
	
		MyThread myThread1 = new MyThread(greetingsThread1,"Dhoni");
		MyThread myThread2 = new MyThread(greetingsThread1,"Kohli");
		
		myThread1.start();
		myThread2.start();
		
	}
}
