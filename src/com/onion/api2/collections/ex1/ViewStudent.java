package com.onion.api2.collections.ex1;

import java.util.ArrayList;

public class ViewStudent {
	
	public void view(String msg) {
		System.out.println(msg);
	}
	
	public void viewAllStudents(ArrayList<StudentDTO> studentDTOs) {
		System.out.println("학생이름\t학생번호\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<studentDTOs.size(); i++) {
			viewOneStudent(studentDTOs.get(i));
		}
	}
	
	public void viewOneStudent(StudentDTO studentDTO) {
		

		System.out.print(studentDTO.getName() + "\t" + studentDTO.getNum() + "\t" + studentDTO.getKor() + "\t"
		+ studentDTO.getEng() + "\t"  + studentDTO.getMath() + "\t"  + studentDTO.getTotal()
		+ "\t" );
		
		System.out.printf("%.2f", studentDTO.getAvg());
		System.out.println();
	}
}
