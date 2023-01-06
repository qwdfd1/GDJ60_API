package com.onion.api1.strings;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열에서 '='들의 인덱스 찾기
		String phone = "010-1234-5678";
		boolean check = true;

		int idx = 0;
		
		while(check) {
			idx = phone.indexOf('-', idx);
			if(idx != -1) {
				System.out.println("Idx : " + idx);
				idx++;
			}
			else {
				check = false;
				break;
			}
		}
		
		System.out.println(phone.length());
		

	}

}
