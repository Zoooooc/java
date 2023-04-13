package org.java.study.abstractstudy;

abstract class A{
	
	// 본체가 있는 메소드는 abstract 키워드를 가질 수 없다
	// 멤버 중에 abstract이 하나라도 존재하면 해당 클래스는 abstract
	// 추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다.
	
	// 추상클래스는 상속을 강제하기 위한것
	// 부모클래스에는 메소드의 시그니처만 정의
	// 부모클래스의 메소드를 상속 받은 하위 클래스의 책임으로 위임
	
	// public abstract int c(){System.out.println("Hello");}
	public abstract int b();
	public void d() {
		System.out.println("wolrd");
	}
	
}

class B extends A{
	// abstract은 상속을 강제한다
	@Override
	public int b() {
		return 1;
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {

		// A a = new A(); // 에러발생
		B b = new B();
		System.out.println(b.b());
		b.d();
		
	}

}
