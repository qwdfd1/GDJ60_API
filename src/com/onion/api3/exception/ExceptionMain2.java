package com.onion.api3.exception;

public class ExceptionMain2 {
	public static void main(String[] args) {
		ExceptionSample1 e1 = new ExceptionSample1();
		ExceptionSample2 e2 = new ExceptionSample2();
		
		
		
		try {
			e1.ex2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
			System.out.println(e.getMessage());
		}
		System.out.println("종료합니다");
		
	}
}
