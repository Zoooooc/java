package org.java.study.packages;

import org.java.study.inheritance.Calculator; //

public class B {

	public static void main(String[] args) {
		
		Calculator c = new Calculator(); // 패키지가 달라서 import를 해줘야함 (Line : 3)
		A a = new A(); // 같은 패키지
		
	}

}
