package com.onion.api1.wrappers;

import org.w3c.dom.TypeInfo;

public class Wrapper2 {
	public static void main(String[] args) {
		
		int num = 10;
		
//		Auto-Boxing
//		Primitive -> Reference
//		Integer num2 = new Integer(num);
		
		Integer num2 = num;
		
		//Auto-UnBoxing
		//Reference -> Primitive 
		//num = num2.intValue();
		num = num2;
		
		
		
		
	}
}
