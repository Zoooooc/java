package org.opentutorials.javatutorials.condition;

public class AndOrDemo {

	public static void main(String[] args) {

		// And &&
		// t && t = t
		// t && f = f
		// f && t = f
		// f && f = f
		if(true && true) {
			System.out.println(1);
		}
		
		// Or ||
		// t || t = t
		// t || f = t
		// f || t = t
		// f || f = f
		if(false || false) {
			System.out.println(0); // 실행 안됨
		}
		
		
		
	}

}
