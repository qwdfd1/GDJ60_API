package com.onion.api3.exception;

import java.util.Random;

public class ExceptionSample1 {
	
	public void ex1() throws ArithmeticException {
		Random random = new Random();
		int num = random.nextInt(2);
		
		num = 10/num;
		
		System.out.println(num);
	}
	
	public void ex2() throws Exception {
		//2자리
		int num1 = 65;
		int num2 = 48;
		
		//3자리
//		int sum = num1 + num2;
		
		int sum = num2-num1;
		if(sum<0) {
			throw new CustomException("음수는 모릅니다");
		}
		
		if(sum>99) {
				throw new CustomException("세자리 숫자는 모릅니다");
		}
		

		
	}
}
