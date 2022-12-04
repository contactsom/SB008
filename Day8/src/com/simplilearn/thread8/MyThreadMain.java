package com.simplilearn.thread8;

public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException {
		
		
		MyThread viratThread = new MyThread();// Born 
		
		Thread viratthread = new Thread(viratThread);
		
		viratthread.start();
		viratthread.sleep(5000);// ms
		
		
		for (int i = 0; i < 10; i++) {
			
			//System.out.println("****3. Virat Kohli Playing ****");
			System.out.println("Inzamam-ul-Haq on non strike ");
		}
		
	}
}
