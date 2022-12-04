package com.simplilearn.thread9;

public class Greetings {

	//synchronized
	public  void wish(String name) {
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Good Morning !!! "+name);
			
			try {
				
				Thread.sleep(300);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}
	
	
}
