package org.java.study.access.inner;

public class Calculator {

	private int left;
	private int right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	private int sum() {
		return this.left + this.right;
	}
	
	public void sumDecoPlus() {
		System.out.println("++++" + sum() + "++++");
	}
	
	public void sumDecoMinus() {
		System.out.println("----" + sum() + "----");
	}
	
}
