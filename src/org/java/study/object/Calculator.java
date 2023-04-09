package org.java.study.object;

public class Calculator {

	private int left;
	private int right;
	static double PI = 3.14;
	
	public Calculator() {}
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getRight() {
		return right;
	}

	public void setRight(int right) {
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right) / 2);
	}
	
	public static void piVal() {
		System.out.println(PI);
	}
	
	
}
