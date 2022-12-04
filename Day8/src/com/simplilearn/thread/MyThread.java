package com.simplilearn.thread;

//1. By Extending the Thread Class
public class MyThread extends Thread {

	public void run() {
		//Logic
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Child Thread");
		}
	}
}
