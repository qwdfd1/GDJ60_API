package com.onion.api1.wrappers.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		JuminCheck jc = new JuminCheck();
		JuminCheck2 jc2 = new JuminCheck2();
		System.out.println("-는 제외하고 입력");
		System.out.println("주민번호 13자리를 입력해주세요 : ");
		
		String jumin = sc.next();
//		int gender = jc.check1(jumin);
//		jc.check2(jumin, gender);
		jc2.check(jumin);
		
		
		
		
		

		
		
		
	}

}
