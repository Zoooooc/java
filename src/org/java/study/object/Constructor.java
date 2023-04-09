package org.java.study.object;

public class Constructor {

	public static void main(String[] args) {
	
		Calculator c = new Calculator(1, 2);
		
		System.out.println(c.getLeft());  // 1
		System.out.println(c.getRight()); // 2
		System.out.println(c.PI);
		c.piVal();
		
		System.out.println("=========");
		
		// static
		System.out.println(Calculator.PI); // 2
		Calculator.piVal();
		
		
	}

}
