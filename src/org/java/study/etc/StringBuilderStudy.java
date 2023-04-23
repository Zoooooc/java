package org.java.study.etc;

public class StringBuilderStudy {

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
		
		StringBuilder sb = new StringBuilder("Hello"); // Heap영역에 공간을 생성하여 "Hello"가 저장
		sb.append(" World!"); // 기존 공간에 " World!" 추가
		// String과 달리 불필요한 메모리 공간을 생성하지 않음
		// StringBuilder는 하나의 공간으로 문자열을 관리
		
		
		// StringBuilder 객체
		
		// StringBuilder()
		// 매개변수가 없는 StringBuilder() 생성자 함수는 StringBuilder 객체의 초기 용량을 16Byte로 설정
		StringBuilder sb1 = new StringBuilder();
		System.out.println("StringBuilder() capacity : "+sb1.capacity());
		
		// StringBuilder(int capacity)
		// int 타입의 값을 StringBuilder 생성자 함수에 잔덜하면, StringBuilder 객체의 초기 용량을 설정할 수 있다.
		StringBuilder sb2 = new StringBuilder(5);
		System.out.println("StringBuilder(int capacity) capacity : "+sb2.capacity());
		
		// StringBuilder(CharSequence Seq)
		// String 대신 CharSequence를 StringBuilder 생성자 함수에 전달할 수 있음
		// CharSequencefmf StringBuilder 생성자 함수에 전달하는 경우 StringBuilder 객체의 초기 용량은 (매개변수로 전달된 CharSequence의 길이 +16)입니다.
		CharSequence seq = "Hello";
		StringBuilder sb3 = new StringBuilder(seq);
		System.out.println("StringBuilder(CharSequence Seq) capacity : " + sb3.capacity());
		
		// StringBuilder(String str)
		// StringBuilder 생성자 함수에 문자열을 전달할 수 있습니다.
		StringBuilder sb4 = new StringBuilder("Hello");
		System.out.println("StringBuilder(String str) capacity : "+sb4.capacity());
		
		// 버퍼 크기 초과 테스트
		StringBuilder sb5 = new StringBuilder("Hello");
		
		System.out.println("버퍼 크기 초과 전");
		System.out.println("capacity : " + sb5.capacity());
		System.out.println("length : " + sb5.length());
		
		sb5.append(" World! Hello Java~~~!~~!");
		
		System.out.println("버퍼 크기 초과 후");
		System.out.println("capacity : " + sb5.capacity());
		System.out.println("length : " + sb5.length());
		// StringBuilder의 객체인 sb5는 초기 버퍼 크기가 21( 5 + 16 )
		// append메서드를 사용해 문자열을 초기 버프 크기의 21보다 크게 추가하면
		// 버퍼의 크기는 44( (21 + 1) * 2 )로 변경
		
		
		// https://developer-talk.tistory.com/774
	}

}
