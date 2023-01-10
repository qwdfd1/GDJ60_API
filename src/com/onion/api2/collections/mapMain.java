package com.onion.api2.collections;

import java.util.HashMap;
import java.util.Iterator;



public class mapMain {
	public static void main(String[] args) {
		//HashMap
		// 키가 중복일시 밸류가 수정된다
		
		HashMap<String, String> map = new HashMap<>();
		
		//데이터 추가
		map.put("k1", "v1");
		map.put("k2", "v2");
		map.put("k3", "v3");
		map.put("k2", "v2Re");
		System.out.println(map);
		
		// 데이터 조회
		String s = map.get("k1");
		System.out.println(s);
		
		// 삭제
		s = map.remove("k2");
		
		//전체삭제
		
		boolean check = map.containsKey("k1");
		System.out.println(check);
		
		//반복
		//1. Key들의 정보를 알아야함
		//	 Key들을 Set으로 변환
		//	 Set을 iterator로 변환
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : " + key);
			String value = map.get(key);
			System.out.println("Value : " + value);
		}
		System.out.println(map);
		
	}
}
