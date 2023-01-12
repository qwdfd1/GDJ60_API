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
import java.util.Scanner;

public class Server1 {
	public static void main(String[] args) {
		
		//요청을 받아주는 클래스
		ServerSocket ss = null;
		
		//클라이언트 정보를 담은 소켓
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		
		try {
			//포트를 열고 요청을 대기하는 중...
			ss = new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중");
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			boolean quit = true;
			
			System.out.println("채팅방 나가기를 원할 경우 q를 눌러주세요.");
			while(quit) {
				// 클라이언트가 보낸 메세지
				String msg = br.readLine();
				
				if(msg == null || msg.equals("q")) {
					System.out.println("채팅을 종료합니다");
					break;
				}
				
				System.out.println("Client가 보낸 메세지 : " + msg);

				// 서버가 보낼 메세지


				msg = scanner.nextLine();
				System.out.println("입력 : ");
				
				bw.write(msg+"\r\n");
				bw.flush();	
				

			
				

				
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				is.close();
				ir.close();
				br.close();
				os.close();
				ow.close();
				bw.close();
				scanner.close();
				sc.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			
		}
		
	}
}
