package com.onion.api3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class FileMain2 {
	public static void main(String[] args) {
		File file = new File("C:\\fileTest", "test.txt");
		System.out.println(file.exists());
		
		//파일에 내용을 작성
		String name = "Onion";
		try {
			//생성자 2번째 매개변수 append는 기본값으로 false
			FileWriter fw = new FileWriter(file, true);
			
			//내용을 쓰고 버퍼를 땡기고 줄바꿈
			fw.write(name +"\r\n");
			
			//버퍼 밀어주기
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
