package com.onion.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Setmain {
	public static void main(String[] args) {
		
		//HashSet
		HashSet<Integer> ar = new HashSet<>();
		
		ar.add(1);
		ar.add(11);
		ar.add(19);
		ar.add(2);
		ar.remove(11);
		
		//toString() 오버라이딩함
		System.out.println(ar.toString());
		//순서가 없으므로 인덱스번호도 없다
		//get()메서드 사용 불가능
		System.out.println(ar.size());
		
		//Set의 Data들을 Iterator형식으로 변경한다.
		//Set은 하나의 무리로는 이동할 수 있지만 데이터를 하나씩 꺼내기에는 불편하다
		//변수 선언 - 다형성
		Iterator<Integer> is = ar.iterator();
		//interface는 abstract class든 객체생성은 불가능하지만 데이터타입으로 선언은 가능
		while(is.hasNext()) {
			Integer num = is.next();
		}
		
	}
}
