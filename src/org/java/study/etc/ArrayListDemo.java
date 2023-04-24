package org.java.study.etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<>();
		int data;
		int sum = 0;
		
		while((data = sc.nextInt()) >= 0) {
			al.add(data);
		}
		
		for(int i=0; i < al.size(); i++) {
			sum += al.get(i);
		}
		
		System.out.println("평균 : " + (sum / al.size()));
		
		System.out.println();
		
		ArrayList<Integer> intArrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
	    ArrayList<Integer> newArrayList = new ArrayList<>(intArrayList.subList(2, 5));

	    System.out.println("intArrayList: " + intArrayList);
	    System.out.println("newArrayList: " + newArrayList);
	
		
	}
	
}
