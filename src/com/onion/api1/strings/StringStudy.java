package com.onion.api1.strings;

import java.util.Scanner;

public class StringStudy {
	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str==str2);
		
		// equals()는 Object클래스의 메서드
		// Object는 모든 클래스의 부모
		// String클래스는 Object클래스를 상속받음
		// 그래서 매개변수가 Object타입이여도 String클래스를 인자값으로 보낼 수 있음(다형성)
		boolean check = str.equals(str2);
		
		char ch = str.charAt(0);
		System.out.println(ch);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("넘어가용~");
		ch = sc.next().charAt(0);
		System.out.println(ch);
		
		int num = str.indexOf('c');
		System.out.println(num);
	}
	
}
