package com.onion.api2.date;

import java.util.Calendar;

public class CalendarMain2 {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		
		birth.set(1997, 4, 29);
		
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE)+1);
		
		//현재 시간을 천분의1초 단위로 변환
		long n = now.getTimeInMillis();
		long s = birth.getTimeInMillis();
		
		n = n-s;
		n = n/(1000*60*60*24);
		n = n/365;
		
		
		
		System.out.println("n : " + n);
		System.out.println("s : " + s);
		System.out.println(now.getTime());
		
		System.out.println(birth.getTime());
		
	}
}
