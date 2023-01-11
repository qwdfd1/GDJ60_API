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
		
//		 Set
		HashSet<Integer> set = new HashSet<>();
		
		int num = 0;
		
		boolean check1 = true;
		while(set.size() < 6) {
			set.add(random.nextInt(1,46));
		}
		
		System.out.println(set);


		

		
//		//1. 배열
//		int [] nums = new int[6];
//		
//		for(int i=0; i<nums.length; i++) {
//			nums[i] = random.nextInt(1,46);
//			for(int j=0; j<i; j++) {
//				if(nums[i] == nums[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//
//		}
		
		//2. ArrayList
		
//		ArrayList<Integer> nums = new ArrayList<>();
//		
//		
//		while(nums.size() < 6) {
//			
//			boolean check = true;
//			int num = random.nextInt(1,46);
//			
//			for(int i=0; i<nums.size(); i++) {
//				if(nums.get(i) == num) {
//					check=false;
//					break;
//				}
//			}
//					
//			if(check) {
//				nums.add(num);
//			}
//
//		}
//		
//		for(int i=0; i<nums.size(); i++) {
//			System.out.println(nums.get(i));
//		}
//		
		
			
		
		
		
		

		
		
		
		
		
		


	}
}
