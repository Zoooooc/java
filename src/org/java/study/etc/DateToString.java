package org.java.study.etc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {

	public static void main(String[] args) throws ParseException {

		// String으로 받은 값이 SimpleDateFormat의 format과 일치해야함
		
		// Date Format
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		// String to Date
		Date date1 = sdf.parse("2023-04-19");
		
		// Date to String
		Date now = new Date();
		String date2 = sdf.format(now);
		
		System.out.println(date1); // Wed Apr 19 00:00:00 KST 2023
		System.out.println(date1.getClass().getName()); // java.util.Date
		
		System.out.println(date2); // 2023-04-19
		System.out.println(date2.getClass().getName()); // java.lang.String
		
		
	}

}
