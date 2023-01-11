package com.onion.api3.exception;

import java.util.Random;

public class ExceptionSample2 {
	
	public void ex2() throws Exception{
		ExceptionSample1 e1 = new ExceptionSample1();
		e1.ex1();
	}
}
