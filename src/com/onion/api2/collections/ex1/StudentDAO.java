package com.onion.api2.collections.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	private StringBuffer sb;
	private Scanner sc;
	private final long now;
	private Calendar calendar;

	public StudentDAO() {
		calendar = Calendar.getInstance();
		now = calendar.getTimeInMillis();
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
		
		for(int i=0; i<studentDTOs.size(); i++) {
			StudentDTO studentDTO = studentDTOs.get(i);
			String str = studentDTO.getName() + "-" + studentDTO.getNum() + "-"  + studentDTO.getKor()
			 + "-" + studentDTO.getEng() + "-"  + studentDTO.getMath() + "\r\n";
			File file = new File("C:\\fileTest", now+".txt");
			try {
				FileWriter fw = new FileWriter(file, true);
				fw.write(str);
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	public ArrayList<StudentDTO> init() {
	
		//문자열 파싱
		String data = sb.toString();

		data = data.replace(", ", "-");
		data = data.replace(" ", "-");

		
		StringTokenizer st = new StringTokenizer(data,"-");
		ArrayList<StudentDTO> studentDTOs = new ArrayList<>();
		
		//각 토큰을 setter로 각 객체멤버에 대입
		while(st.hasMoreTokens()) {
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
