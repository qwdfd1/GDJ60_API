package com.onion.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain2 {
	public static void main(String[] args) {
		int [] arr = new int[3];
		
		ArrayList ar = new ArrayList();
		
		//다형성
		//primitive type -> wrapper class -> Auto-Boxing 
		//오브젝트는 모든 클래스의 부모이기 때문에 상속관계 적용(다형성 조건 성립)
		ar.add(1);		//Auto-Boxing
		
		ar.add("안녕");
		ar.add(3.4f);
		ar.add('a');
		ar.add(true);
		ar.add(new Scanner(System.in));
		
		//형변환 -> 언박싱
		int n1 = (Integer)ar.get(0);
		double n2 = (Double)ar.get(2);
		
		for (Object object : ar) {
			System.out.println(object);
		}
		
	}
}
