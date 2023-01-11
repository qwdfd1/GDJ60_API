package com.onion.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GregorianCalendar
		Calendar ca = new GregorianCalendar();
		
		//현재날짜와 시간으로 객체가 만들어짐
		ca = Calendar.getInstance();
		System.out.println(ca);
		
		ca.set(Calendar.YEAR, 2032);
		ca.set(Calendar.MONTH, 11);
		
		//Year
		int year = ca.get(Calendar.YEAR);
		
		//Month
		//월은 0부터 시작
		int month = ca.get(Calendar.MONTH)+1;
		
		//date
		int date = ca.get(Calendar.DATE);
		
		//day
		int day = ca.get(Calendar.DAY_OF_WEEK);
		
		//hour
		int hour = ca.get(Calendar.HOUR);
		
		//minute
		int minute = ca.get(Calendar.MINUTE);
		
		//second
		int second = ca.get(Calendar.SECOND);
		
		System.out.print(year + "년  ");
		System.out.print(month+ "월  ");
		System.out.print(date+ "일  ");
		System.out.print(day+ "요일  ");
		System.out.print(hour+ "시  ");
		System.out.print(minute+ "분  ");
		System.out.println(second+ "초  ");

	}

}
