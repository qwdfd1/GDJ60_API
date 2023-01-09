package com.onion.api2.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListMain3 {
	public static void main(String[] args) {
		
		//Collection은 Type에 안전하지 않다
		//Generic : Type의 연관성(타입 안정성)
		//E : 변수명
		//E = Integer
		ArrayList<Integer> ar = new ArrayList<>();
		ar.add(1);
		
		
		int num = ar.get(0);
		
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity("SEOUL");
		ar2.add(weatherDTO);
		

		
		weatherDTO = new WeatherDTO();
		weatherDTO.setCity("JEJU");
		ar2.add(weatherDTO);
		
		//참조변수에 새로운 객체의 주소값이 담겨있으므로 제주값이 삭제되지는 않음
		weatherDTO = new WeatherDTO();
		weatherDTO.setCity("JEJU");
		
		ar2.remove(weatherDTO);
		
		for(int i=0; i<ar2.size(); i++) {
			System.out.println(ar2.get(i).getCity());
		}
	}
}
