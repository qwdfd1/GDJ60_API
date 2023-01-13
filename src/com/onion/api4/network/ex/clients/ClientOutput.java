package com.onion.api4.network.ex.clients;

import java.util.Scanner;

public class ClientOutput {
	
	private Scanner sc;
	
	
	
	
	public ClientOutput() {
		sc = new Scanner(System.in);
	}

	public String sendStudent(int select) {
		System.out.println("학생 이름 입력 : ");
		String name = sc.next();
		name = select + "@" +  name  ;
		
		return name;

		
	}
	
	public String add(String name) {
		
		System.out.println("학생 이름 : " + name);
		
		System.out.println("학생 번호 : ");
		int num = sc.nextInt();
		
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학 점수 : ");
		int math = sc.nextInt();
	
		String info = name + "-" + num + "-" + kor + "-" + eng + "-" + math + "-";
		
		return info;
		
	}
}
