package com.onion.api2.date;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class UUIDMain {
	public static void main(String[] args) {
		
		String uid = UUID.randomUUID().toString();
		System.out.println(uid);
		
		//random.nextInt() -> 가짜 난수(난수가 생성되는 패턴이 존재)
		
		//Random(long seed) 
		Calendar calendar = Calendar.getInstance();
		uid = calendar.getTimeInMillis()+"abc";
		Random random = new Random(calendar.getTimeInMillis());
		
	}
}
