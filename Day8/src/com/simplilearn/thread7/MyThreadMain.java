package com.simplilearn.thread7;

public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread rohitThread = new MyThread();// Born 
		
		Thread rohitthread = new Thread(rohitThread);
		
		rohitthread.start();
		rohitthread.join();
		
		
		MyThread1 klrahulThread = new MyThread1();// Born 
		
		Thread klrahulthread = new Thread(klrahulThread);
		
		klrahulthread.start();
		klrahulthread.join();
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("****3. Virat Kohli  ****");
		}
		
	}
}
