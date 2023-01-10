package com.onion.api2.sample;

import java.util.ArrayList;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		//부모클래스타입의 Arraylist 생성
		ArrayList<Parent> ar = new ArrayList<>();
		
		//부모클래스 상속받은 각각 다른 자식클래스타입 객체들 모을수 있음
		ar.add(child1);
		ar.add(child2);
		
		//객체를 꺼낼땐 형변환을 해주어야함
		Child1 ch1 = (Child1)ar.get(0);
		
		//객체타입을 묻는 연산자 instanceof
		System.out.println(ar.get(0) instanceof Child1);
		
		//부모클래스를 상속받는 클래스타입들을 모을수 있는 ArrayList
		ArrayList<? extends Parent> ar2 = new ArrayList<>();
		
		//부모클래스의 부모클래스들을 모을수 있는 ArrayList
		ArrayList<? super Parent> ar3 = new ArrayList<>(); 
	
		
		
		
	}

}
