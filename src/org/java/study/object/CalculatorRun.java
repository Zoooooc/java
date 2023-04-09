package org.java.study.object;

// 유효범위
class ThisTest{
	int a = 1;
	
	public void a() {
		int a = 2;
		
		System.out.println(a);      // 2
		System.out.println(this.a); // 1
	}
}

public class CalculatorRun {

	public static void main(String[] args) {

		Calculator c = new Calculator(1, 2);
		c.sum();
		c.avg();
		
		System.out.println("========");
		
		ThisTest tt = new ThisTest();
		tt.a();
		
	}

}
