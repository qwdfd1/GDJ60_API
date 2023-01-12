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

public class Client1 {
	public static void main(String[] args) {
		Socket socket = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			//객체 생성시 서버 접속 시도
			socket = new Socket("localhost", 8282);
			System.out.println("Server와 접속 성공");
				
			//0,1
			os = socket.getOutputStream();
			
			//char로 변환
			ow = new OutputStreamWriter(os);
			
			//String 
			bw = new BufferedWriter(ow);
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
		
			
			System.out.println("서버로 보낼 메세지 입력 : ");
			System.out.println("채팅방 나가기를 원할 경우 q를 눌러주세요.");
			
			while(true) {
				//클라이언트가 보낼 메세지

				
				String msg = sc.nextLine();
				System.out.println("입력 : ");
				
				if(msg.equals("q") || msg == null) {
					System.out.println("채팅을 종료합니다");
					break;
				}
				
				bw.write(msg+"\r\n");
				bw.flush();
				
				msg = br.readLine();
				System.out.println("Client가 보낸 메세지 : " + msg);
				
				
				

					
	
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sc.close();
				socket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
