package com.simplilearn.thread9;

public class MyThread extends Thread {

	Greetings greetings;
	String name;
	
	
	public MyThread(Greetings greetings, String name) {
		super();
		this.greetings = greetings;
		this.name = name;
	}

	@Override
	public void run() {
			
			greetings.wish(name);
			
	}
	
}
