package com.onion.api1.strings;

public class StringBuffer1 {
	public static void main(String[] args) {
		
		// StringBuffer는 String이 아님
		StringBuffer sb = new StringBuffer("Hello");
		
		// Hello + World
		sb.append("World");
		
		// print -> HelloWorld
		System.out.println(sb);
		
		// 참조변수를 출력하면 toString() 호출 : 클래스명@객체주소
		// object클래스에서 상속받은 메서드 toString()을 오버라이딩 하였다
		// 변수에는 같은 데이터타입만 대입 가능
		
		String str = sb.toString();
		System.out.println(str);
		
		// 객체 생성안하고 문자열로 변환 방법
		str = String.valueOf(123);
		
		System.out.println(str);
		
		// 객체 생성하면서 문자열로 변환 방법
		str=123+"";
		System.out.println(str);
		
		
		
		
		
		
	}
}
