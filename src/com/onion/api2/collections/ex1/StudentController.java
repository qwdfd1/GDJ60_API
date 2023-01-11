package com.onion.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
	//1. 학생정보 초기화
	//2. 학생정보전체조회
	//3. 학생정보검색조회(이름)
	//4. 학생정보 추가
	//5. 학생정보삭제(이름)
	//6. 프로그램 종료
	

	Scanner sc;
	
	//의존성
	StudentDAO studentDAO;
	ArrayList<StudentDTO> studentDTOs;
	ViewStudent viewStudent;
	boolean run;
	
	
	public StudentController()
	{
		sc = new Scanner(System.in);
		
		//의존성 주입
		studentDAO = new StudentDAO();
		studentDTOs = null;
		viewStudent = new ViewStudent();
		run = true;
		
	}
	
	
	public void start() {
		while(run) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. 학생정보 초기화 2. 학생정보 전체조회 3. 학생정보 검색조회(이름)");
			System.out.println("4. 학생정보 추가 5. 학생정보 삭제(이름) 6. 학생정보 백업 7. 프로그램 종료");
			int select = sc.nextInt();
			
			// 학생정보 초기화
			if(select == 1) {
				studentDTOs = studentDAO.init();
				System.out.println("초기화가 완료되었습니다");
			}
			
			// 학생정보 전체조회
			else if(select == 2) {
				System.out.println("학생 전체조회");
				viewStudent.viewAllStudents(studentDTOs);
			}
			
			// 입력받은 이름을 가진 학생정보 조회
			else if(select == 3) {
				System.out.println("학생정보 조회");
				System.out.println("학생이름\t학생번호\t국어\t영어\t수학\t총점\t평균");
				StudentDTO studentDTO = studentDAO.search(studentDTOs);
				if(studentDTO != null) {
					viewStudent.viewOneStudent(studentDTO);					
				}
				else {
					viewStudent.view("찾는학생이 없습니다");
				}
				
			}
			
			// 학생정보 추가
			else if(select == 4) {
				System.out.println("학생정보 추가");
				studentDAO.add(studentDTOs);
			}
			
			// 입력받은 이름을 가진 학생정보 삭제
			else if(select == 5) {
				System.out.println("학생정보 삭제");
				studentDAO.remove(studentDTOs);
			}
			
			// 학생정보 백업
			// 현재시간을 밀리세컨즈로 해서 파일 작성
			else if(select == 6) {
				studentDAO.saveStudent(studentDTOs);
			}
			// 프로그램 종료
			else if(select == 7) {
				System.out.println("프로그램 종료");
				run = false;
			}
			
			// 그 외의 번호를 입력했을 때
			else {
				System.out.println("잘못된 접근입니다");
			}
		}
		
	}
}
