package com.simplilearn.interface9;

public class Path implements Left,Right{

	@Override
	public void direction(int a) {
		System.out.println("--direction(int a)--");
		
	}

	@Override
	public void direction() {
		System.out.println("--direction()--");
		
	}

}
