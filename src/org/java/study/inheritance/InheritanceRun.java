package org.java.study.inheritance;

public class InheritanceRun {

	public static void main(String[] args) {

		Calculator c = new Calculator(10, 20);
		
		int i = c.avg();
		System.out.println(i);
		
		System.out.println("============");
		
		// 상속
		// 객체에 메소드를 추가하는것이 어렵다면..?
		//
		// 객체를 자신이 만들지 않아서 직접 수정이 어려울때
		// 객체가 다양한 곳에서 활용되고 있는데 메소드를 추가하면 다른곳에서는 불필요한 기능이 포함될 수 있다
		
		UpgradeCalculator uc = new UpgradeCalculator(10, 20);
		
		int a = uc.minus();
		
//		a = uc.avg();
//		a = uc.sum();
//		a = uc.getLeft();
//		a = uc.getRight();
		
		System.out.println(a);
		
		System.out.println("============");
		
		// 오버라이딩
		System.out.print("부모 : ");
		c.syso();
		System.out.print("자식 : ");
		uc.syso();
		
		System.out.println("============");
		
		// 오버로딩
		Calculator ucc = new Calculator();
		
		ucc.overloading();
		ucc.overloading("a");
		ucc.overloading("a", "b");
		
		System.out.println();
		
		UpgradeCalculator ugcc = new UpgradeCalculator(10, 20);
		ugcc.overloading();
		ugcc.overloading(1);
		ugcc.overloading("a");
		ugcc.overloading("a", "b");
		
		System.out.println("============");
		
		
	}

}
