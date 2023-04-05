package org.opentutorials.javatutorials.variables;

public class StringDemo {

	public static void main(String[] args) {
		String a, b, c;
		a = "파이리";
		b = "꼬부기";
		c = "이상해씨";
		
		print(a + b + c, true);
		print(a + b + c, false);
	}
	
	
	/**
	 * 
	 * @param strPrint
	 * @param flag
	 */
	public static void print(String strPrint, boolean flag) {
		if(flag) {
			System.out.println(strPrint);
		}else {
			System.out.print(strPrint);
		}
	}
	
}
