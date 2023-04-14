package org.java.study.interfaces;

interface I extends X, Y{
	// 인터페이스도 상속됨
	// 싹 다 구현해야함
	public void z();
}

public class A implements I{ 
	// 클래스 A가 인터페이스 I, X, Y를 구현
	// 모두 구현해야함
	// 인터페이스의 멤버는 반드시 public

	public void z() {}
	public void x() {}
	public void y() {}
	
}
