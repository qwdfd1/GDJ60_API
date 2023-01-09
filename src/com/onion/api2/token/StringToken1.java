package com.onion.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nations="Korea,Seoul,USA,Washington,UK,London,Japan,Tokyo";
		String [] n = nations.split(",");
		
		for(int i=0; i<n.length; i++) {
			NationDTO nationDTO = new NationDTO();
			nationDTO.setName(n[i++]);
			nationDTO.setCity(n[i]);
			System.out.println("나라 이름 : " + nationDTO.getName());
			System.out.println("도시 이름 : " + nationDTO.getCity());
		}
		
		StringTokenizer st = new StringTokenizer(nations,",");
		while(st.hasMoreTokens()) {
			NationDTO nationDTO = new NationDTO();
			
			
			String t1  = st.nextToken();
			nationDTO.setName(t1);
			
			String t2 = st.nextToken();
			nationDTO.setCity(t2);
			
			System.out.println("나라 이름 : " + nationDTO.getName());
			System.out.println("도시 이름 : " + nationDTO.getCity());
			
		}
		
	}

}
