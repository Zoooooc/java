package org.opentutorials.javatutorials.io;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int i = sc.nextInt();
			if(i==0) {
				System.out.println("종료");
				return;
			}
			System.out.println("입력한 숫자는 " + i + " 입니다.");
		}
		sc.close();
		
		
	}

}
