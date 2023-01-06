package com.onion.api1.strings;

public class StringStudy3 {
	public static void main(String[] args) {
		
		//같은 패키지 또는 java.lang패키지는 임포트 하지않고도 사용 가능
		Object obj = new Object();
		// String은 불변
		// 1,2는 상수구역에서 찾으면서 같으면 같은 주소값을 준다. 그래서 true
		// 3,4는 new키워드로 객체생성, 주소값을 비교한다. 그래서 false
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		System.out.println(str1==str2);
		System.out.println(str3==str4);
		System.out.println(str1==str3);
		

		// String은 연산시에는 연산할 때 마다 새로운 객체를 생성한다
		// 연산을 마치고나면 최종객체의 주소값을 반환해준다. 
		str1 = str1+"world"+str2;
		System.out.println(str1);

		
	}
}
