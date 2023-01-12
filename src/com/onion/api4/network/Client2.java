package com.onion.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {
	public static void main(String[] args) {
		//1. 서버 접속 시도
		//2. 1. 점심 2. 저녁 3. 종료
		//3. 1,2,3 고르기
		//1번 : 서버에서 점심 메뉴 중 하나를 보내줌, 출력
		//2번 : 서버에서 점심 메뉴 중 하나를 보내줌, 출력
		//3번 : 출력
		Scanner sc = new Scanner(System.in);
		
		Socket socket = null;
		OutputStream outputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		BufferedWriter bufferedWriter = null;
		
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		
		
		try {
			socket = new Socket("192.168.1.84", 8282);
			System.out.println("Server와 접속 성공");
			System.out.println("점심메뉴 고르기");
			System.out.println("메뉴를 골라주세요");
			
			outputStream = socket.getOutputStream();
			System.out.println(outputStream);
			outputStreamWriter = new OutputStreamWriter(outputStream);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			inputStream = socket.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			
			
			
			while(true) {
				System.out.println("1. 점심메뉴 2. 저녁메뉴 3. 종료");
				String msg = sc.next();
				if(msg.equals("3")) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				
				bufferedWriter.write(msg+"\r\n");
				bufferedWriter.flush();
				
				msg = bufferedReader.readLine();
				String desc = bufferedReader.readLine();
				System.out.println(desc + "메뉴 : " + msg);
				
				
				
				
				
				
				
			}
			
			
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			try {
				bufferedWriter.close();
				outputStreamWriter.close();
				outputStream.close();
				bufferedReader.close();
				inputStreamReader.close();
				inputStream.close();
				sc.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
		
	}
}
