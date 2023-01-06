package com.onion.api1.strings.ex3;

import java.util.Scanner;

public class WeatherController {
	// 참조변수 선언
	private Scanner sc;
	private WeatherDTO [] weathers;
	private WeatherData wd;
	private WeatherView weatherView;
	private WeatherInput weatherInput;
	//start
		//1. 날씨정보초기화
			// WeatherData -> init()
			//초기화가 완료되었습니다.
		
		//2. 전국날씨정보
			// WeatherView -> weatherViewAll()
		
		//3. 지역날씨검색
			// WeatherInput -> search()
			// 있으면 날씨정보 출력, 없으면 없습니다 출력
		
		//4. 지역날씨추가
			// WeatherInput -> add()
	
		//5. 지역날씨삭제
			// WeatherInput -> remove()
	
		//6. 종		료
	
	// 생성자를 통해 각 기능에 대한 객체를 생성
	// 여러번 쓰이는 객체같은 경우는 생성자를 통해 객체생성 하는 방법이 효율적이다.(메모리자원 관리)
	public WeatherController() {
		// TODO Auto-generated constructor stub
		weathers = null;
		sc = new Scanner(System.in);
		wd = new WeatherData();
		weatherView = new WeatherView();
		weatherInput = new WeatherInput();
	}
	
	public void start() {
		boolean run = true;
		while(run) {
			
			System.out.println("1. 날씨정보 초기화 2. 전국 날씨 정보 3. 지역 날씨 검색 4. 지역 날씨 추가 5. 지역 날씨 삭제 6. 종료");
			System.out.println("사용하실 메뉴번호를 입력해주세요 : ");
			int select = sc.nextInt();
			//날씨정보 초기화
			if(select == 1) {
				weathers = wd.init();
				System.out.println("초기화가 완료되었습니다");

			}
			
			//전국날씨정보
			else if(select == 2) {
				weatherView.weatherViewAll(weathers);
			}
			
			//지역날씨 검색
			else if(select == 3) {
				System.out.println("도시이름\t기온\t날씨\t미세먼지량\t");
				WeatherDTO searchDTO = weatherInput.search(weathers);
				weatherView.weatherViewOne(searchDTO);
				
			}
			
			//지역날씨 추가
			else if(select == 4) {
				weathers = weatherInput.add(weathers);
			}
			
			//지역날씨 삭제
			else if(select == 5) {
				weathers = weatherInput.remove(weathers);
			}
			
			//종료
			else if(select == 6) {
				run = false;
			}
			
			else {
				System.out.println("잘못된 접근입니다.");
			}
			
			
			
			
			
			
			
		}
	}
	
	
}
