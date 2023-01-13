package com.onion.api2.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {
	
	public static void main(String[] args) {
		
		
		// 날짜 포맷
		Calendar ca = Calendar.getInstance();
		
		//2023년 1월 11일
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd E요일");
		String date = sd.format(ca.getTime());
		
		System.out.println(date);
		
		
	}
}
