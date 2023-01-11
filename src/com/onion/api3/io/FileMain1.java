package com.onion.api3.io;

import java.io.File;
import java.util.Iterator;

public class FileMain1 {
	public static void main(String[] args) {
		//1.	File클래스
		// 		HDD에 파일과 폴더의 정보를 담을려고하는 클래스
		
		File file = new File("C:\\");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());
		System.out.println(file.exists());
		
		if(!file.exists()) {
			file.mkdir();	
		}
		
//		file.delete();
		
		String [] files = file.list();
		for (String name : files) {
			System.out.println(name);
			File f = new File("C:\\", name);	//절대 경로(root)
//			File f = new File(file, name);	//new File(parent경로, child경로) 사용 가능
			System.out.println(f.isDirectory());
		}
		
		File [] fs = file.listFiles();
	}
}
