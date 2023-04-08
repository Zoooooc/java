package org.opentutorials.javatutorials.method;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Method2 {

	public static void main(String[] args) {
		//       인자 argument
		numbering(5);
		
		System.out.println("==========");
		
		String result = numbering(1,5);
		System.out.println(result);
		
		// 파일
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		}catch(IOException e) {
			// 
		}
		
		System.out.println("==========");
		
		String[] members = getPocketMon();
		for(String member : members) {
			System.out.println(member);
		}

		
	}
	
	//                          매개변수 parameter
	public static void numbering(int limit) {
		int i = 0;
		while(i <= limit) {
			System.out.println(i);
			i++;
		}
	}

	//            return type
	public static String numbering(int start, int limit) {
		String result = "시작 값은 " + start + ", 끝 값은 " + limit;
		
		if(start < limit) {
			while(start <= limit) {
				System.out.println(start);
				start++;
			}
		}
		
		return result;
	}
	
	public static String[] getPocketMon(){
		String[] member = {"꼬부기", "어니부기", "거북왕"};
		return member;
	}
	
}
