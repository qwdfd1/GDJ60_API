package com.onion.api1.strings.ex3;

public class Ex3main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData wd = new WeatherData();
		WeatherDTO [] wdto = wd.init();
		
		System.out.println("도시이름\t기온\t날씨\t미세먼지량\t");
		for(int i=0; i<wdto.length; i++) {
			System.out.println(wdto[i].getCity() + "\t" + wdto[i].getGion() 
					+ "\t" + wdto[i].getStatus() + "\t" + wdto[i].getDust());
			
		}
	}

}
