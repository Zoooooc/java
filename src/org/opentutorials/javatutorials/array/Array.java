package org.opentutorials.javatutorials.array;

public class Array {

	public static void main(String[] args) {

		// 배열(Array)
		// 연관된 정보를 그룹핑
		// 연관된 데이터를 모아서 관리하기 위해서 사용하는 데이터 타입
		// 변수는 하나의 데이터를 저장하기 위한 것, 배열은 여러 개의 데이터를 저장하기 위한 것
		
		// 배열 선언 1
		String[] pocketMon = {"꼬부기", "파이리", "이상해씨", "피카츄"};
		
		System.out.println(pocketMon[0]);
		System.out.println(pocketMon[1]);
		System.out.println(pocketMon[2]);
		System.out.println(pocketMon[3]);
		
		// 오류
		//System.out.println(pocketMon[4]); // java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println();
		
		// 배열 선언 2
		String[] pocketMon2 = new String[4];
		
		System.out.println(pocketMon2.length);
		pocketMon2[0] = "꼬부기";
		System.out.println(pocketMon2.length);
		pocketMon2[1] = "파이리";
		System.out.println(pocketMon2.length);
		pocketMon2[2] = "이상해씨";
		System.out.println(pocketMon2.length);
		pocketMon2[3] = "피카츄";
		
		System.out.println();
		
		String[] monsterBall = {"꼬부기", "파이리", "이상해씨"};
		
		for(int i=0; i<monsterBall.length; i++) {
			System.out.println(monsterBall[i] + " 안녕~");
		}
		
		System.out.println();
		
		// for-each
		String[] monsterBall2 = {"잠만보", "망나뇽", "거북왕"};
		
		for(String monster : monsterBall2) {
			System.out.println(monster + "안녕~");
		}
		
		
	}

}
