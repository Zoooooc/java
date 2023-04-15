package org.java.study.polymorphism;

class A{
	
	public String x() {
		return "Ax";
	}
	
}
class B extends A{
	
	
	public String x() {
		return "Bx";
	}
	public String y() {
		return "Ay";
	}
	
}
class B2 extends A{
	
	public String x() {
		return "B2x";
	}
	
}

public class Polymorphism2 {

	public static void main(String[] args) {

		A obj = new B(); // 
		A obj2 = new B2(); // 
		
		System.out.println(obj.x());
		System.out.println(obj2.x());
		
		//obj.y(); // A를 상속받은 B로 인스턴스를 만들었지만 A타입인 obj에 담았기 때문에 
	}

}
