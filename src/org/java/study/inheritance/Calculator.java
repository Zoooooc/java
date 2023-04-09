package org.java.study.inheritance;

public class Calculator {

	// f
	int left;
	int right;
	int third = 0;
	
	// c
	public Calculator() {
		System.out.println("Calculator()~");
	}
	
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
		System.out.println("Calculator(int left, int right)~");
	}
	
	public Calculator(int left, int right, int third) {
		this.left = left;
		this.right = right;
		this.third = third;
		System.out.println("Calculator(int left, int right, int third)~");
	}

	// g/s
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
	
	public int getThird() {
		return third;
	}

	public void setThird(int third) {
		this.third = third;
	}

	// m
	public int sum() {
		return left + right + third;
	}
	
	public int avg() {
		return sum() / 3;
	}
	
	public void syso() {
		System.out.println("난 부모야~");
	}
}
