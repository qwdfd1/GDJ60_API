package com.onion.api2.date;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarMain3 {
	public static void main(String[] args) {
		

		
		//현재 시간
		Calendar ca = Calendar.getInstance();
		ca.set(Calendar.DATE, 30);
		
		//3일 후
		Calendar ca2 = Calendar.getInstance();
		ca2.set(Calendar.DATE, 30);
		
		long d = 1000*60*60*24*3;
		ca2.setTimeInMillis(ca2.getTimeInMillis()+d);

		//1. set
//		ca2.set(Calendar.DATE, ca.get(Calendar.DATE)+time);
		
		//2. add는 큰 단위도 변화
//		ca2.add(Calendar.DATE, 3);
		
		//3. roll은 지정한 단위만 변화
//		ca2.roll(Calendar.DATE, 3);
		
		System.out.println("현재 시간 : " + ca.getTime());
		System.out.println("배송 예정 일자 : " + ca2.getTime());
	}
}
