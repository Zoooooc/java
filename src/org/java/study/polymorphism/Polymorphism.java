package org.java.study.polymorphism;


class P{
	
	public void print(int i) {
		System.out.println("나는 숫자");
		System.out.println("숫자 : " + i);
	}
	public void print(String str) {
		System.out.println("나는 문자열");
		System.out.println("문자열 : " + str);
	}
	
}

public class Polymorphism {
	
	// 다형성
	// 하나의 메소드나 클래스가 있을 때
	// 이것들 다양한 방법으로 동작하는 것을 의미한다.
	// 예시로는 오버로딩, 오버라이딩 등이 있다~
	
	public static void main(String[] args) {
		P p = new P();
		p.print(1);
		System.out.println();
		p.print("1");
		
	}
	
	
}
