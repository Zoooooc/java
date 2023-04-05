package org.opentutorials.javatutorials.condition;

public class SwitchDemo {

	public static void main(String[] args) {
		
		// switch문의 조건으로 들어갈 수 있는 자료형
		// byte, short, char, int, enum, String, Character, Byte, Short, Integer
		switch(0) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default : 
			System.out.println("zero");
		}
		
	}

}
