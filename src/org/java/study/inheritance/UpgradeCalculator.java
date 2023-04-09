package org.java.study.inheritance;

public class UpgradeCalculator extends Calculator {
	
	public UpgradeCalculator(int left, int right) {
		super(left, right);
		System.out.println("UpgradeCalculator(int left, int right)~");
	}
	
	public UpgradeCalculator(int left, int right, int third) {
		super(left, right, third);
		System.out.println("UpgradeCalculator(int left, int right, int third)~");
	}



	public int minus() {
		int result;
		
		if(this.left < this.right) {
			result = this.right - this.left;
		}else {
			result = this.left - this.right;
		}
		
		return result;
	}

	public void syso() {
		super.syso();
		System.out.println("난 자식이야~");

		// 아래의 조건들이 부모 메소드와 자식 메소드가 동일해야 오버라이딩 가능
		// 메소드의 이름
		// 메소드 매개변수 갯수, 데이터 타입, 순서
		// 메소드 리턴 타입
		
	}

	
}
