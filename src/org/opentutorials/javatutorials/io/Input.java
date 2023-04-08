package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// C:\java\java>java -cp bin org.opentutorials.javatutorials.io.Input one two three
		System.out.println("args.length : " + args.length);
		for(String arg : args) {
			System.out.println(arg);
		}
		
		System.out.println("========");
		
		System.out.print("scanner 입력 : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.close();
		System.out.println("scanner로 입력한 값 : " + i);
	}

}
