package com.onion.api2.collections;

import java.util.LinkedList;

public class ListMain4 {
	public static void main(String[] args) {
		
		// 링크드리스트는 새로운 요소 삽입시 새로운 객체를 생성하고 실제값이 아닌 주소값을 넣어준다(차후 인덱스 과정 반복) 
		LinkedList<Integer> ar = new LinkedList<>();
		ar.add(1);
		
		ar.get(0);
		
		ar.remove(0);
	}
}
