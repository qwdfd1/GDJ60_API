package com.onion.api1.strings.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherInput {
	
	Scanner sc;
	
	ArrayList<E>
	
	public WeatherInput() {
		sc = new Scanner(System.in);
	}
	
	//search
	//배열을 받고, 키보드로부터 검색할 도시명을 입력 받음(대소문자 구분x, 도시명만 맞으면 일치)
	//찾았으면 dto를 리턴해줌, 아니면 null 리턴
	
	public WeatherDTO search(WeatherDTO[] weatherDTOs) {
		System.out.println("검색할 도시명을 입력해주세요 : ");
		String city = sc.next().toUpperCase();
		for(int i=0; i<weatherDTOs.length; i++) {
			if(city.equals(weatherDTOs[i].getCity())) {
				return weatherDTOs[i];
			}
		}
		return null; 
		
	}
	
	//add
	//배열을받고, 키보드로부터 정보들을 입력 받음
	//배열을 추가하고 리턴
	
	public WeatherDTO[] add(WeatherDTO[] weatherDTOs) {
		
		//추가할 도시 정보 입력받기
		System.out.println("지역 추가");
		System.out.println("날씨정보를 추가할 도시이름 : ");
		String city = sc.next();
		
		System.out.println("도시의 기온 : ");
		int gion = sc.nextInt();
		
		System.out.println("도시의 날씨 : ");
		String status = sc.next();
		
		System.out.println("도시의 미세먼지량 ㅣ ");
		int dust = sc.nextInt();
		
		// 날씨정보가 담을 도시객체 생성
		WeatherDTO addWeatherDto = new WeatherDTO();
		// 인자값으로 받은 배열의 크기보다 1만큼 더 큰 배열 선언 및 초기화
		WeatherDTO [] copy = new WeatherDTO[weatherDTOs.length+1];
		
		// 기존배열에 들어있던 객체 주소값 복사
		for(int i=0; i<weatherDTOs.length; i++) {
			copy[i] = weatherDTOs[i];
		}
		
		// 입력받은 정보들 도시객체에 셋팅
		addWeatherDto.setCity(city.toUpperCase());
		addWeatherDto.setGion(gion);
		addWeatherDto.setStatus(status);
		addWeatherDto.setDust(dust);
		
		// 복사한 배열의 인덱스는 기존배열의 크기값.		--> ex) 기존배열 크기 :4 새로운 배열 마지막 인덱스 :4
		copy[weatherDTOs.length] = addWeatherDto;
		
		// 주소값 복사
		weatherDTOs = copy;
		
		System.out.println("도시가 추가되었습니다");
		
		return weatherDTOs;
		
		
	}
	
	//remove
	//배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
	//해당도시가 들어있는 dto를 삭제하고 dto배열 리턴
	
	public WeatherDTO [] remove(WeatherDTO[] weatherDTOs) {
		System.out.println("삭제할 도시명을 입력해주세요 : ");
		WeatherDTO [] copy = new WeatherDTO[weatherDTOs.length-1];
		
		String removeCity = sc.next().toUpperCase();
		int idx =0;
		
		// 
		for(int i=0; i<weatherDTOs.length; i++) {
			
			if(removeCity.equals(weatherDTOs[i].getCity())) {
				continue;
			}
			copy[idx] = weatherDTOs[i];
			idx++;
		}
		
		weatherDTOs = copy;
		
		System.out.println("도시가 삭제되었습니다.");
		
		return weatherDTOs;
	}
	

}
