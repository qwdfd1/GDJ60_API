package com.onion.api1.strings;

public class StringStudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이메일을 한글자씩 출력하기 	--> charAt();
		String email = "qwdfd@123@qwer@naver.com";
		
		int idx = email.lastIndexOf("@");
		System.out.println(idx);
		
		System.out.println(email.length());
		
		for(int i=0; i<email.length(); i++) {
			System.out.println(email.charAt(i));
		}
		
		//@를 언더바로 바꾸기
		
		System.out.println("Before Email : " + email);
		email = email.replace('@', '_');
		System.out.println("After Email : " + email);
	}	

}
