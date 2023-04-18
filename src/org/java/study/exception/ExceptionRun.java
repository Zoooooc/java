package org.java.study.exception;

public class ExceptionRun {

	public static void main(String[] args) {

		try {
			
			int a = 1;
			int b = 0;
			
			System.out.println(a / b);
			
		}catch(Exception e) {
			System.out.println("오류 : "+ e.getMessage() );
			// .getMessage();
			// 오류에 대한 기본적인 내용을 출력
			// 상세하지 않음
			
			// .toString
			// .getMessage()보다 좀 더 자세한 예외 정보를 제공
			
			// .printStackTrace()
			// .getMessage(), .toString()과는 다르게 리턴값이 없다
			// 메소드가 내부적으로 예외 결과를 화면에 출력
			// 자세한 예외 정보 제공
			
		}
		
	}

}
