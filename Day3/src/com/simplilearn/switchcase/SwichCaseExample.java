package com.simplilearn.switchcase;

public class SwichCaseExample {

	public static void main(String[] args) {
	
		System.out.println("**********Case-1**********");
		int x=10;
		
		switch(x) {
		case 10:
			System.out.println("10");
		case 20:
			System.out.println("20");
		case 30:
			System.out.println("30");
		}

		System.out.println("**********Case-2**********");
		int a=30;

		switch(a) {
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		case 40:
			System.out.println("40");
			break;
		}
		
		
		System.out.println("**********Case-3**********");
		int b=300;

		switch(b) {
		case 20:
			System.out.println("20");
			break;
		case 30:
			System.out.println("30");
			break;
		case 40:
			System.out.println("40");
			break;
		default:
			System.out.println("Default:");
		}
		
		System.out.println("**********Case-4**********");
		int c=300;

		switch(c) {
		case 20:
			System.out.println("20");
			break;
		case 300:
			System.out.println("300");
			break;
		case 40:
			System.out.println("40");
			break;
		default:
			System.out.println("Default:");
		}
		
		
		System.out.println("**********Case-5- String**********");
		
		String name="Cena";

		switch(name) {
		case "John":
			System.out.println("I am john");
			break;
		case "Cena":
			System.out.println("I am Cena");
			break;
		case "Robin":
			System.out.println("I am Robin");
			break;
		default:
			System.out.println("Default:");
		}
		
	}

}
