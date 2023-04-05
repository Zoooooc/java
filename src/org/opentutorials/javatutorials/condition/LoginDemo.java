package org.opentutorials.javatutorials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		//C:\!@#!@#\bin>java org.opentutorials.javatutorials.condition.LoginDemo [if] [pwd]
		String id = args[0];
		String pwd = args[1];
		if((id.equals("꼬북") || id.equals("꼬부기")) && pwd.equals("0000")) {
			System.out.println("right");
		}else {
			System.out.println("wrong");
		}
	}

}
