package com.onion.api4.network.ex.clients;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ClientInput {
	
	private StringBuffer sb;
	
	public ClientInput() {
		sb = new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji-3-89-74-87-");
		sb.append("choa-4-71-25-99-");
	}
	
	// 매개변수 : String student
	public ArrayList<StudentDTO> loadStudents(String students) {
		
		ArrayList<StudentDTO> studentDTOs = new ArrayList<>();
		
		
		StringTokenizer st = new StringTokenizer(students, "-");
		
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			
			studentDTO.setName(st.nextToken());
			
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			
			int kor = Integer.parseInt(st.nextToken());
			studentDTO.setKor(kor);
			
			int eng =Integer.parseInt(st.nextToken()); 
			studentDTO.setEng(eng);	
			
			int math =Integer.parseInt(st.nextToken());
			studentDTO.setMath(math);
			
			int total =kor+eng+math;
			studentDTO.setTotal(total);
			
			double avg = total/3.0;
			studentDTO.setAvg(avg);
			
			studentDTOs.add(studentDTO);
			
		}
		
		return studentDTOs;
	}
	
	//매개변String name 
	public StudentDTO loadStudentOne(String name) {
	
		StringTokenizer st = new StringTokenizer(name, "-");
		
		StudentDTO studentDTO = new StudentDTO();
		
		while(st.hasMoreTokens()) {
			
			
			studentDTO.setName(st.nextToken());
			
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			
			int kor = Integer.parseInt(st.nextToken());
			studentDTO.setKor(kor);
			
			int eng =Integer.parseInt(st.nextToken()); 
			studentDTO.setEng(eng);	
			
			int math =Integer.parseInt(st.nextToken());
			studentDTO.setMath(math);
			
			int total =kor+eng+math;
			studentDTO.setTotal(total);
			
			double avg = total/3.0;
			studentDTO.setAvg(avg);
		
		}
		
		return studentDTO; 
	}
	
	
}
