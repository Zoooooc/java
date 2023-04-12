package org.java.study.access.inner;


class A{
	
	public String y() {
		return "public void y()";
	}
	private String z() {
		return "public void z()";
	}
	public String x() {
		return z();
	}
	
	
}

public class AccessDemo1 {

	public static void main(String[] args) {

		A a = new A();
		
		System.out.println(a.y()); // o
		//System.out.println(a.z()); // x, class 내에서만 호출 가능
		System.out.println(a.x()); // o
		
		// 접근제어자를 사용하는 이유
		
		
		
		
	}

}
