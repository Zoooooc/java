package org.opentutorials.javatutorials.condition;

public class Condition {

	public static void main(String[] args) {

		if(true) {
			System.out.println("result : true");
		}
		
		System.out.println();
		
		if(true) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}
		System.out.println(5);
		
		System.out.println();
		
		if(false) {
			System.out.println(1);
		}else if(true){
			System.out.println(2);
		}else if(true) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
		
		
	}

}
