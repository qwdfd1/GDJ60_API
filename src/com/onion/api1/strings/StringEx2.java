package com.onion.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg", "jpeg", "gif", "png"};
		
		System.out.println("파일명을 입력해주세요");
		System.out.println("FileName  : ");
		String fileName = sc.next();
		boolean check = false;
		
		// 첫번째 방법
		for(int i=0; i<names.length; i++) {
			if(fileName.lastIndexOf(names[i]) != -1) {
				check = true;
				break;
			}
		}
		if(check) {
			System.out.println("확인");
			System.out.println("FileName : " + fileName);
		}
		else {
			System.out.println("잘못된 파일형식입니다");
			System.out.println("FileName : " + fileName);
		}
		
		//2번째 방법
		System.out.println("파일명을 입력해주세요");
		System.out.println("FileName  : ");
		fileName = sc.next();
		
		String result = fileName.substring(fileName.lastIndexOf('.')+1);
		for(int i=0; i<names.length; i++) {
			if(result.equals(names[i])) {
				check = true;
			}
			else {
				check = false;
			}
			}
		
			if(check) {
				System.out.println("확인");
				System.out.println("FileName : " + fileName);
				
			}
			
			else {
				System.out.println("잘못된 파일형식입니다");
				System.out.println("FileName : " + fileName);
			}
		
		
		
	}

}
