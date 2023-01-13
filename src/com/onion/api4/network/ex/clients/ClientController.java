package com.onion.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientController {
	
	//	1.전체학생정보출력
	//	2.학생정보검색출력
	//	3.학생정보추가
	//	4.학생정보삭제
	//	5.종료
	
	Scanner sc;
	Socket socket;
	OutputStream outputStream;
	OutputStreamWriter outputStreamWriter;
	BufferedWriter bufferedWriter;
	
	InputStream inputStream;
	InputStreamReader inputStreamReader;
	BufferedReader bufferedReader;
	
	ClientInput clientInput;
	ClientOutput clientOutput;
	ClientView clientView;
	
	ArrayList<StudentDTO> studentDTOs;
	
	public ClientController() {
		sc = new Scanner(System.in);
		socket = null;
		outputStream = null;
		outputStreamWriter = null;
		bufferedWriter = null;
		
		inputStream = null;
		inputStreamReader = null;
		bufferedReader = null;
		
		clientInput = new ClientInput();
		clientOutput = new ClientOutput();
		clientView = new ClientView();
		
		studentDTOs = null;
	}
	public void start() {
		

		
	
		try {
			socket = new Socket("192.168.1.79", 8282);
			System.out.println("Server와 연결 성공");
			
			inputStream = socket.getInputStream();
			inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			
			outputStream = socket.getOutputStream();
			outputStreamWriter = new OutputStreamWriter(outputStream);
			bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			boolean check = true;
			
			while(check) {
				System.out.println("1.전체학생 정보 출력 2. 학생정보 검색 3. 학생정보 추가 4. 학생정보 삭제 5. 종료");
				int select = sc.nextInt();
				
			
				
				//전체학생정보 출력
				if(select == 1) {

					
					bufferedWriter.write(select + "@\r\n");
					bufferedWriter.flush();
					System.out.println("test");
					
					String students = bufferedReader.readLine();
					studentDTOs = clientInput.loadStudents(students);
					clientView.studentView(studentDTOs);
				}
				
				//학생정보 검색
				else if(select == 2) {
					System.out.println("검색할 학생의 이름을 입력해주세요 : ");
					String name = clientOutput.sendStudent(select);
					
					bufferedWriter.write(name+"\r\n");
					bufferedWriter.flush();
					
					name = bufferedReader.readLine();
					StudentDTO studentDTO = clientInput.loadStudentOne(name);
					clientView.studentView(studentDTO);
					
					
				}
				
				//학생정보 추가
				else if(select == 3) {
					System.out.println("학생 정보 추가");
					System.out.println("학생의 정보를 입력해주세요");
					String name = clientOutput.sendStudent(select);
					String info = clientOutput.add(name);
					
					System.out.println(info);
					bufferedWriter.write(info + "\r\n");
					bufferedWriter.flush();
					
				}
				
				//학생정보 삭제
				else if(select == 4) {
					System.out.println("정보를 삭제할 학생의 이름을 입력해주세요 : ");
					String name = clientOutput.sendStudent(select);
					
					bufferedWriter.write(name + "\r\n");
					bufferedWriter.flush();
					
//					System.out.println(bufferedReader.readLine());

					
				}
				
				//종료
				else if(select == 5) {

					System.out.println("프로그램을 종료합니다");
//					bufferedWriter.write(select + "\r\n");
//					bufferedWriter.flush();
					
//					System.out.println(bufferedReader.readLine());
					
					check = false;
					break;
					
				}
				else {
					System.out.println("잘못된 접근입니다");
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			try {
				bufferedReader.close();
				inputStreamReader.close();
				inputStream.close();
				bufferedWriter.close();
				outputStreamWriter.close();
				outputStream.close();
				sc.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
