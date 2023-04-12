package org.java.study.access.inner;

public class CalculatorRun {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.setOprands(2, 3);
		c.sumDecoMinus();
		c.sumDecoPlus();
	}

}
