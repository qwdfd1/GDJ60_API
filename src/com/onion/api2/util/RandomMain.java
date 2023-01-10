package com.onion.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		//1000원 로또 구매 1-45
		//6개의 숫자 출력
		HashSet<Integer> fuck = new HashSet<>();
		
		int num = 0;
		
		boolean check1 = true;
		while(check1) {
			num = random.nextInt(1,45);
			fuck.add(num);
			if(fuck.size() == 6) {
				check1 = false;
			}
		}

		Iterator<Integer> fuckkkkkk = fuck.iterator();
		while(fuckkkkkk.hasNext()) {
			System.out.print(fuckkkkkk.next() + "\t");
		}
		

		

		
		
		
		
		
		


	}
}
