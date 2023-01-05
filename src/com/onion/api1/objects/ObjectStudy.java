package com.onion.api1.objects;

public class ObjectStudy {
	public static void main(String[] args) {
		
		//Object 클래스 : 모든 클래스의 부모 클래스
		Object obj = new Object();
		
		int a = obj.hashCode();
		
		System.out.println(a);
		
		String s = obj.toString();
		
		System.out.println(s);
		
		//object.toString(); 호출과 같다
		System.out.println(obj);		
		
		Child child = new Child();
		Object obj2 = new Object();
		System.out.println(obj == obj2);
		
		boolean check = obj.equals(obj2);
		
		System.out.println(check);
		
		System.out.println(child.toString());
		
		// toString()을 오버라이딩 했으므로 주소값이 아닌 다른값이 나온다
		System.out.println(child);
		
		System.out.println(child.hashCode());
		
		//다형성 
		Object o = child;
		
		
	}
}
