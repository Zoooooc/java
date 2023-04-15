package org.java.study.polymorphism;

interface I{
	public void printI();
}
interface I2{
	public void printI2();
}
class AA implements I, I2{

	public void printI2() {
		System.out.println("I2");
	}

	public void printI() {
		System.out.println("I1");
	}
	
}

public class Polymorphism3 {

	public static void main(String[] args) {
		AA a = new AA();
		I b = new AA();
		I2 c = new AA();
		
		a.printI();
		a.printI2();
		
		System.out.println();
		
		b.printI();
		//b.printI2(); // 다형성
		
		System.out.println();
		
		//c.printI(); // 다형성
		c.printI2();
		
	}
}
