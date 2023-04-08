package org.java.study.object;

class Calculator{
	static double PI = 3.14;
	static int base = 10;
	int left, right;
	
	public void setOprand(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right) / 2);
	}
	
}

class Test{
	static int a = 1;
	
	static void a() {
		System.out.println(a);
	}
}

public class CalculatorRun {

	public static void main(String[] args) {

		Calculator c = new Calculator();

		c.setOprand(1, 2);
		c.sum();
		c.avg();
		
		Test.a();
		
		
	}

}
