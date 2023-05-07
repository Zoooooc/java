package org.java.study.etc;

public class ThreadTest extends Thread{

	static int share;

	public static void main(String[] args) {

		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		t1.start();
		t2.start();
	}

	public void run() {
		for(int count=0; count<10; count++) {
			System.out.println(share++);
			System.out.println();
			
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				
			}
			
		}
		
	}
	
	
	
}
