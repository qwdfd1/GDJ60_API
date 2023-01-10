package com.onion.api2.collections.ex1;

import java.util.ArrayList;

public class ViewStudent {
	public void viewAllStudents(ArrayList<StudentDTO> studentDTOs) {
		System.out.println("학생이름\t학생번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<studentDTOs.size(); i++) {
			viewOneStudent(studentDTOs.get(i));
		}
	}
	
	public void viewOneStudent(StudentDTO studentDTO) {
		
		if(studentDTO == null) {
			System.out.println("해당하는 학생이 없습니다.");
		}
		
		System.out.println(studentDTO.getName() + "\t" + studentDTO.getNum() + "\t" + studentDTO.getKor() + "\t"
		+ studentDTO.getEng() + "\t"  + studentDTO.getMath() + "\t"  + studentDTO.getTotal()
		+ "\t" + studentDTO.getAvg());
	}
}
