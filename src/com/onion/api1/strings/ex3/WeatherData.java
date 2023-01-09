package com.onion.api1.strings.ex3;

public class WeatherData {
	
	private String data;
	
	public WeatherData() {
		this.data = "SEOUL,12,맑음,60,Daegu,68,비,10," 
		+ "Jeju,-56,눈,12,junju,32,흐림,5";
	}
	
	//init
	//data를 파싱해서 각 data를 DTO에 대입하고 DTO들을 리턴
	
	public WeatherDTO [] init() {
		
		String [] weathers = data.split(",");
		WeatherDTO [] wdtos = new WeatherDTO[weathers.length/4];
		for(int i=0; i<wdtos.length; i++) {
			WeatherDTO wdto = new WeatherDTO();
			wdto.setCity(weathers[i*4].toUpperCase());
			wdto.setGion(Integer.parseInt(weathers[i*4+1]));
			wdto.setStatus(weathers[i*4+2]);
			wdto.setDust(Integer.parseInt(weathers[i*4+1]));
			wdtos[i] = wdto; 
		}
		
		return wdtos;

	}
	
	
}
