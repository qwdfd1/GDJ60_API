package com.onion.api1.strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {
	
	private String data;
	
	public WeatherData() {
		this.data = "SEOUL,12,맑음,60,Daegu,68,비,10," 
		+ "Jeju,-56,눈,12,junju,32,흐림,5";
	}
	
	public WeatherDTO [] init (){
		StringTokenizer st = new StringTokenizer(data,",");
		WeatherDTO [] weatherDTOS = new WeatherDTO[st.countTokens()/4];
		int idx = 0;
		
		while(st.hasMoreTokens()) {
			WeatherDTO weatherDTO = new WeatherDTO();
			String city = st.nextToken();
			weatherDTO.setCity(city);
			String gion = st.nextToken();
			weatherDTO.setGion(Integer.parseInt(gion));
			String status = st.nextToken();
			weatherDTO.setStatus(status);
			String dust = st.nextToken();
			weatherDTO.setDust(Integer.parseInt(dust));
			
			weatherDTOS[idx] = weatherDTO;
			++idx;
			
		}
		
		return weatherDTOS;
	}
	
	//init
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
	
//	public WeatherDTO [] init() {
//		
//		String [] weathers = data.split(",");
//		WeatherDTO [] wdtos = new WeatherDTO[weathers.length/4];
//		for(int i=0; i<wdtos.length; i++) {
//			WeatherDTO wdto = new WeatherDTO();
//			wdto.setCity(weathers[i*4].toUpperCase());
//			wdto.setGion(Integer.parseInt(weathers[i*4+1]));
//			wdto.setStatus(weathers[i*4+2]);
//			wdto.setDust(Integer.parseInt(weathers[i*4+1]));
//			wdtos[i] = wdto; 
//		}
//		
//		return wdtos;
//
//	}
	
	
}
