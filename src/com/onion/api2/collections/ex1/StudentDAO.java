package com.onion.api2.collections.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	private Scanner sc;

	public StudentDAO() {
		sc = new Scanner(System.in);
		this.sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
	}
	
	public void saveStudent(ArrayList<StudentDTO> studentDTOs) {
		Calendar calendar = Calendar.getInstance();
		long now = calendar.getTimeInMillis();
		File file = new File("C:\\fileTest", now+".txt");
		
		//finally에서도 참조변수를 사용하기위해 try문 밖에서 선언 후 null로 초기화
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file);
			
			for(StudentDTO studentDTO : studentDTOs) {
				StringBuffer sb = new StringBuffer();
				sb.append(studentDTO.getName());
				sb.append("-");
				sb.append(studentDTO.getNum());
				sb.append("-");
				sb.append(studentDTO.getKor());
				sb.append("-");
				sb.append(studentDTO.getEng());
				sb.append("-");
				sb.append(studentDTO.getMath());
				sb.append("\n");
				
				fw.write(sb.toString());
				fw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
	
	public ArrayList<StudentDTO> init() {
	

		
		//1. 읽어올 파일의 부모디렉토리 경로
		File parent = new File("C:\\fileTest");
		
		// 부모경로의 파일리스트
		String [] fileList = parent.list();
		
		// 부모경로의 파일들의 이름을 담을 Long타입 배열
		Long [] fileNames = new Long[fileList.length];
		long max = 0;
	
		
		for(int i=0; i<fileList.length; i++) {
			
			//파일의 확장자를 잘라내고 long타입으로 변환
			fileNames[i] = Long.parseLong(fileList[i].substring(0, fileList[i].lastIndexOf('.')));
			
			//두 수를 비교하고 큰 수를 max변수에 대입
			if(fileNames[i] > max) {
				max = fileNames[i];
			}
		}
		
		
		//제일 최근 백업파일 읽어오기
		File file = new File(parent, max+".txt");
		
		
		//2. 파일내용 읽기위해서 연결 준비
		//다른 구문에서도 사용하기위해 변수 선언후 null로 초기화
		FileReader fr = null;
		BufferedReader br = null;
		
		ArrayList<StudentDTO> studentDTOs = new ArrayList<>();

		
		
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			String data = null;
			
			
			
			while((data = br.readLine()) != null) {

				//문자열 파싱
				data = data.replace(", ", "-");
				data = data.replace(" ", "-");
				StringTokenizer st = new StringTokenizer(data,"-");
				
				//각 토큰을 setter로 각 객체멤버에 대입
				
					StudentDTO studentDTO = new StudentDTO();
					
					String name = st.nextToken();
					studentDTO.setName(name);
					
					int num = Integer.parseInt(st.nextToken());
					studentDTO.setNum(num);
					
					int kor = Integer.parseInt(st.nextToken());
					studentDTO.setKor(kor);
					
					int eng = Integer.parseInt(st.nextToken());
					studentDTO.setEng(eng);
					
					int math = Integer.parseInt(st.nextToken());
					studentDTO.setMath(math);
					
				
					
					int total = kor+eng+math;
					studentDTO.setTotal(total);
					
					double avg = total/3.0;
					studentDTO.setAvg(avg);

					studentDTOs.add(studentDTO);
										
				}

			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		return studentDTOs;
		
	}
	
	public StudentDTO search(ArrayList<StudentDTO> studentDTOs) {
		System.out.println("조회할 학생 이름 입력 : ");
		String name = sc.next();
		
		
		for (StudentDTO studentDTO : studentDTOs) {
			if(studentDTO.getName().equals(name)) {
				return studentDTO;
			}
		}
		return null;
	}
	
	public void add(ArrayList<StudentDTO> studentDTOs) {
		
		System.out.println("학생이름 입력 : ");
		String name = sc.next();
		
		int num = studentDTOs.size()+1;
		
		System.out.println("국어점수 입력 : ");
		int kor = sc.nextInt();
		
		System.out.println("영어점수 입력 : ");
		int eng = sc.nextInt();
		
		System.out.println("수학점수 입력 : ");
		int math = sc.nextInt();
		
		int total = kor+eng+math;
		
		double avg = total/3.0;
		
		StudentDTO studentDTO = new StudentDTO();
		
		studentDTO.setName(name);
		studentDTO.setNum(num);
		studentDTO.setKor(kor);
		studentDTO.setEng(eng);
		studentDTO.setMath(math);
		studentDTO.setTotal(total);
		studentDTO.setAvg(avg);
		
		studentDTOs.add(studentDTO);
		
		
	}
	
	public void remove(ArrayList<StudentDTO> studentDTOs) {
		System.out.println("삭제할 학생이름 입력 : ");
		String name = sc.next();
		boolean flag = false;
		

		for(int i=0; i<studentDTOs.size(); i++) {
			if(studentDTOs.get(i).getName().equals(name)) {
				studentDTOs.remove(i);
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("학생정보가 없습니다");
		}
		
	}
	

	
	
	
	
	
}
