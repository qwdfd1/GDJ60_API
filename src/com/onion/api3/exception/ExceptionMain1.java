package com.onion.api3.exception;

import java.util.Random;

public class ExceptionMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = null;
		Random random = new Random();
		int n = random.nextInt(2);
		
		if(n == 0) {
			num="test";
		}
		
		try {
			int a = 10;
			System.out.println(3/n);
			//throw new ArithmeticException();
			
			System.out.println(num.charAt(0));
			
		} catch (ArithmeticException e) {
			System.out.println("예외 발생");
		} catch (RuntimeException e) {
			e.printStackTrace();
			// TODO: handle exception
		} catch (Exception e) {
			System.out.println("Null ");
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		System.out.println("종료합니다");
	}

}
