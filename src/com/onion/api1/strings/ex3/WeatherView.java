package com.onion.api1.strings.ex3;

public class WeatherView {
	
	
	WeatherData wd = new WeatherData();
	
	
	//2개의 메서드 선언
	
	//1. 모든 날씨 정보를 출력
	public void weatherViewAll(WeatherDTO [] weatherDTOs) {
		System.out.println("도시이름\t기온\t날씨\t미세먼지량\t");
		for(int i=0; i<weatherDTOs.length; i++) {
			weatherViewOne(weatherDTOs[i]);
		}
	}
	
	//2. DTO하나의 정보를 출력
	public void weatherViewOne(WeatherDTO weatherDTO) {
		if(weatherDTO == null) {
			System.out.println("찾는 도시 이(가) 없습니다");
		}
		
		else {
			// 도시이름의 첫글자는 대문자
			// 그 뒤에 문자는 소문자로 출력
			
			String substr = weatherDTO.getCity().substring(1).toLowerCase();
			
			System.out.println(weatherDTO.getCity().substring(0,1)+substr + "\t" + weatherDTO.getGion() 
			+ "\t" + weatherDTO.getStatus() + "\t" + weatherDTO.getDust());
		}
			
	}
}
