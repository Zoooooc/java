package org.opentutorials.javatutorials.numberstring;

public class CharString {

	public static void main(String[] args) {
		
		System.out.println('꼬');
		System.out.println("꼬부기");
		
		// 꼬부기는 문자열이므로 '' > ""
//		System.out.println('꼬부기');
		System.out.println("꼬");
		
		// 더하기 연산자로 문자열 연결 가능
		System.out.println("꼬부" + "기");
		
		// 이스케이프
		// \를  " 앞에 붙여 " 의 문법적인 역할을 이스케이프해서 문자로 인식하게함
		System.out.println("꼬부기 : \"꼬북꼬북\""); // 꼬부기 : "꼬북꼬북"

		
		
		
	}

}
