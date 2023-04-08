package org.opentutorials.javatutorials.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileScanner {

	public static void main(String[] args) {

		try {
			File file = new File("out.txt"); // out.txt에 내용을 읽어서
			Scanner sc = new Scanner(file); // 스캔
			System.out.println(sc.nextInt()); // 결과 출력
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
