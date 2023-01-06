package com.onion.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("프로그램 시작");

		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		
		System.out.println("파일명을 입력해주세요");
		System.out.println("FileName  : ");
		String fileName = sc.next();
		boolean check = true;
		
		// 1번째 방법
		// 배열에 담긴 이미지타입과 같은지 검사
		// 반환값이 -1이 아닐때
		for(int i=0; i<names.length; i++) {
			if(fileName.lastIndexOf(names[i]) != -1) {
				System.out.println("확인");
				System.out.println("FileName : " + fileName);
				check = false;
				break;
			}
		}
		
		// 잘못됐을 때
		if(check) {
			System.out.println("잘못된 파일형식입니다");
			System.out.println("FileName : " + fileName);
		}
		
		System.out.println("----------------------------------------------------");

		
		//2번째 방법
		check = true;
		System.out.println("파일명을 입력해주세요");
		System.out.println("FileName  : ");
		fileName = sc.next();
		
		// 확장자 분리
		String result = fileName.substring(fileName.lastIndexOf('.')+1);
		
		// 확장자 검증
		for(int i=0; i<names.length; i++) {
			if(result.equals(names[i])) {
				System.out.println("확인");
				System.out.println("FileName : " + fileName);
				check = false;
				break;
				}
			}
		
		//비정상 파일타입 일 때
		if(check) {
			System.out.println("비정상 파일");
			System.out.println("FileName : " + fileName);
		}
		
		
		
		System.out.println("프로그램 종료");
	}

}
