package org.opentutorials.javatutorials.loop;

public class LoopDemo {

	public static void main(String[] args) {

		// while(반복 조건){ 실행문 }
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println();
		
		// for(초기값; 반복조건; 반복실행){ 실행문 }
		for(int j=0; j<10; j++) {
			
			if(j!=0 && j%4 == 0) {
				System.out.println("4의 배수");
				continue;
			}
			
			if(j == 9) break; // 실행문이 한줄이면 스코프 생략 가능
			
			System.out.println(j);
		}
		
		
	}

}
