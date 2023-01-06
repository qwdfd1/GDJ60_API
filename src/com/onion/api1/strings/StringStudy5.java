package com.onion.api1.strings;

public class StringStudy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//전처리 작업(파싱)
//		String str = "1.2# 3.4 , 5.2#60";
		String str = "APple# ApplE , appLe# APPle";
		
		str = str.replace(",","#");
		
		String [] result = str.split("#");
		
		for (String string : result) {
			System.out.println(string.trim().toUpperCase());
		}
		
	}

}
