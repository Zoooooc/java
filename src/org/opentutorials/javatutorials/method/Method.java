package org.opentutorials.javatutorials.method;

public class Method {

	public static void main(String[] args) {
		numbering(); // 메소드 호출
	}
	
	// 메소드
	public static void numbering() {
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
	}
	
}
