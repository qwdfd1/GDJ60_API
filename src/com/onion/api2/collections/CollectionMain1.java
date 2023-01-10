package com.onion.api2.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class CollectionMain1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> ar1 = new ArrayList<>();
		ArrayList<Integer> ar2 = new ArrayList<>();
		
		
		ArrayList<ArrayList<Integer>> ars = new ArrayList<>();
		
		ars.add(ar1);
		ars.add(ar2);
		
		ars.get(0);
		
		//키들과 밸류들을 담을 hashMap 생성
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		
		ArrayList<HashMap<String, ArrayList<Integer>>> mapList = new ArrayList<>();
		
		mapList.get(0).put("ar1", ar2);
		
		
		
	}
}
