package com.onion.api1.strings;

public class StringStudy4 {
	public static void main(String[] args) {
		String str = "StarWars";
		
		String result = str.substring(4,6);
		
		System.out.println(result);
		
		str = "qwdfd@naver.com";
		
		result = str.substring(6);
		
		System.out.println(result);
		
	
		result = str.substring(str.lastIndexOf('@')+1);
		System.out.println(result);
	}
}
