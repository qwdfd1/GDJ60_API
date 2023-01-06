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
		boolean  flag = true;
		
		//확장자 분리
		String result = fileName.substring(fileName.lastIndexOf('.')+1);
		
		//확장자 이미지타입인지 검사
		for(int i=0; i<names.length; i++) {
			if(result.equals(names[i])) {
				System.out.println("정상 파일입니다");
				flag = !flag;
				break;
			}
		}
		
		if(flag) {
			System.out.println("비정상 파일입니다.");
		}
		
	}

}
