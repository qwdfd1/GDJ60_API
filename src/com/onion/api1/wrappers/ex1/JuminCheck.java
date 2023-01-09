package com.onion.api1.wrappers.ex1;

public class JuminCheck {
	
	//check1
	//주민등록번호를 받아서
	//남자인지 여자인지 출력
	
	public int check1(String jumin) {
		
		String jumin2 = jumin.substring(6);
		
		int gender = Integer.parseInt(jumin2.substring(0,1));
		
		if(gender == 1 || gender == 3) {
			System.out.println("성별 : 남자");
		}
		else if(gender == 2 || gender == 4) {
			System.out.println("성별 : 여자");
		}
		else {
			System.out.println("주민번호 형식이 맞지않습니다.");
		}
		
		return gender;
		
	}
		
	

	//check2
	//주민등록번호를 받아서
	//나이를 계산해서 출력
	//2-5 : 봄
	//6-8 : 여름
	//9-11 : 가을
	//12-2 : 겨울
	
	
	public void check2(String jumin, int gender) {
		System.out.println(jumin);
		int year = 1900;
		String juminYear = jumin.substring(0,2);
		
		int juminMonth = Integer.parseInt(jumin.substring(2,4));
		
		int age = 0;
		String season = null;
		
		if(gender == 3 || gender == 4) {
			year = 2000;
		}
		
		year = year+Integer.parseInt(juminYear);
		age = 2023-year;
		
		System.out.println("당신의 나이 : " + age + "세");
		
		if(juminMonth<=5 && juminMonth>=2) {
			season = "봄";
		}
		else if(juminMonth<=6 && juminMonth>=8) {
			season = "여름";
		}
		else if(juminMonth<=9 && juminMonth>=11) {
			season = "가을";
		}
		else if(juminMonth == 12 && juminMonth <= 2) {
			season = "겨울";
		}
		
		System.out.println("태어난 계절 : " + season);
	}
	

}
