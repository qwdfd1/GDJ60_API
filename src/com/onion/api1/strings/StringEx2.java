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
		
		for(int i=0; i<names.length; i++) {
			if(fileName.lastIndexOf(names[i]) != -1) {
				System.out.println("확인했습니다");
				break;
			}
			else {
				System.out.println("잘못된 파일형식입니다.");
			}
		}
		
	}

}
