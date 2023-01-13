package com.onion.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Random;

public class Server2 {
	public static void main(String[] args) {
		// Client 접속 대기
		// 1. 점심메뉴중 하나를 랜덤하게 골라서 전송
		// 2. 저녁메뉴중 하나를 랜덤하게 골라서 전송
		// 3. 종료
		ServerSocket serverSocket = null;
		
		Socket socket = null;
		
		OutputStream outputStream = null;
		OutputStreamWriter outputStreamWriter = null;
		BufferedWriter bufferedWriter = null;
		
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		
		
		try {
			serverSocket = new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중");
			socket = serverSocket.accept();
			System.out.println("Client와 연결 성공");
			
			
			outputStream = socket.getOutputStream();
			outputStreamWriter = new OutputStreamWriter(outputStream);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			inputStream = socket.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			
			String [] lunch = {"짜장면", "일본라멘", "김치찌개", "마라탕", "국밥", "초밥"};
			String [] dinner = {"삼겹살", "양꼬치", "파스타", "인도커리", "곱창전골", "닭도리탕"};
			boolean check = true;
			
			while(true) {
				String msg = bufferedReader.readLine();
				
				
				int select = Integer.parseInt(msg);
			
				
				String desc = "";
				Calendar c = Calendar.getInstance();
				
				Random random = new Random(c.getTimeInMillis());
				
				
				if(select == 1) {
					int ran = random.nextInt(lunch.length);
					msg = lunch[ran];
					desc = "점심";
				}
				else if(select == 2) {
					int ran = random.nextInt(dinner.length);
					msg = dinner[ran];
					desc = "저녁";
				}
				
				else {
					System.out.println("서버 프로그램 종료");
					check = false;
					break;
				}
				
				if(check) {
					bufferedWriter.write(msg + "\r\n");
					bufferedWriter.flush();	
				}
				
				
				
				
			}
			
			
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				inputStream.close();
				bufferedWriter.close();
				outputStreamWriter.close();
				outputStream.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		}
	}
}
