package org.java.study.etc;

public class StringBuilder {

	public static void main(String[] args) {
		
		// StringBuilder 클래스
		// java에서 제공하는 StringBuilder 클래스는
		// 단일 스레드에서는 안전, 멀티스레드에서는 불안전
		// 문자열을 추가, 삭제, 변경할 수 있는 메서드 제공
		// String 클래스보다 우수
		
		// String 클래스의 문제점
		String str = "Hello"; // 리터럴 방식이므로 JVM은 String Pool에 해당 문자열("Hello")가 존재하는지 판단 후 저장
		str += " World";      // += 연산자를 사용하여 문자열을 추가하면 String Pool에 생성되지 않고 String Pool 외부영역에 생성
		str += "!";           // 위와 같음
		
		// str을 위와 같이 정의하면
		// Heap 영역 안 String Pool 영역 안에는 "Hello"
		// Heap 영역 안 String Pool 영역 밖에는 "Hello World", "Hello World!"
		
		// String의 문제는 문자열을 추가하거나 변경할 경우 Heap 영역에 메모리를 불필요하게 낭비
		// 불필요한 메모리 공간은 GC(가비지 컬렉션)에 의해 회수되지만, GC가 처리해야 하는 일이 많아집니다.
		// String 대신 StringBuilder를 사용하면, 하나의 메모리 공간만 할당되므로 메모리 공간을 효율적으로 사용
		
		
		
		
		
	}
	
}
