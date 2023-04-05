package org.opentutorials.javatutorials.compare;

public class EqualDemo {

	public static void main(String[] args) {

			System.out.println(1 == 2); // false
			System.out.println(1 == 1); // true
			System.out.println("one" == "two"); // false
			System.out.println("one" == "one"); // true
			
			System.out.println();
			
			System.out.println(1 != 2); // true
			System.out.println(1 != 1); // false
			System.out.println("one" != "two"); // true
			System.out.println("one" != "one"); // false
			
			System.out.println();
			
			System.out.println(10 >= 20); // false
			System.out.println(10 >= 2); // true
			
			System.out.println();
			
			// .equals
			String a = "Hello world";
			String b = new String("Hello world");
			
			System.out.println("Hello world" == "Hello world"); // true
			System.out.println(a == b); // false
			System.out.println(a.equals(b)); // true
			System.out.println(new String("Hello world") == "Hello world"); // false
			
	}
}
