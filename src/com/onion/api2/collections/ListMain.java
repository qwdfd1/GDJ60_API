package com.onion.api2.collections;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		//순서유지 , 값의 중복 허용, 배열기반
		int [] arr = new int[3];
		
		ArrayList ar = new ArrayList();
		
		ar.add(1);
		ar.add(2);
		ar.add(0,5);
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		ar.remove(0);
		ar.set(0, 3);
		
		//요소는 삭제되지만 null은 아니다 
//		ar.clear();
		//false
//		System.out.println(ar==null);

		
		for (Object object : ar) {
			System.out.println(object);
		}
	}

}
