package com.onion.api4.network.ex.clients;

import java.util.ArrayList;

public class ClientView {
	public void studentView(StudentDTO studentDTO) {
		
		String name = studentDTO.getName();
		int num = studentDTO.getNum();
		int kor = studentDTO.getKor();
		int eng = studentDTO.getEng();
		int math = studentDTO.getMath();
		int total = studentDTO.getTotal();
		double avg = studentDTO.getAvg();
		
		System.out.print(name + "\t" + num + "\t" + kor + "\t"  + eng  + "\t" + math
				 + "\t" + total + "\t");
		System.out.printf("%.2f", avg);
		System.out.println();
		
	}
	
	public void studentView(ArrayList<StudentDTO> studentDTOs) {
		System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균");
		for (StudentDTO studentDTO : studentDTOs) {
			studentView(studentDTO);
			
		}
	}
}
