package com.onion.api1.wrappers.ex1;

public class JuminCheck2 {
	
	// check
	// 주민번호를 받아서
	// 991224-1234567
	// 맨끝자리는 체크용 번호로 뺌
	//	9	8	0	7	2	4 -	1	2	3	4	5	6
	//	2	3	4	5	6	7	8	9	2	3	4	5
	//	18	24	0	35	12	28	8	18	6	12	20	30
	// 합이 122, 합을 11로 나누어서 나머지를 구함
	// 122 / 11 = 몫:11, 나머지는 1
	// 나머지값을 11로 뺀 결과값하고 체크용 번호랑 같은지 확인
	
	// 11-1=10
	// 11로 뺀 결과값이 두자리면
	// 11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인
	// 10/10 몫:1, 나머지:0 0==7??
	
	public void check(String jumin) {
		String [] strs = jumin.split("");
		int [] nums = new int[strs.length];
		int sum = 0;
		int checkNum = 0;
		int idx = 2;
		int result = 0;
		

		for(int i=0; i<jumin.length(); i++) {

			//문자열 파싱 후 숫자배열에 대입
			nums[i] = Integer.parseInt(strs[i]);
			
			//마지막번호 체크용번호변수에 대입
			if(i==12) {
				checkNum = nums[i];
				continue;
			}
			
			//배수가 9보다 커질 때 2로 초기화
			if(idx>9) {
				idx = 2;
			}
			
			// 각 숫자의 배수를 곱한 값의 합
			sum += nums[i]*(idx);; 
			idx++;
		
		}
		
		//합을 11로 나눈 나머지
		result = sum%11;

		//11에서 나머지를 뺀 값
		result = 11-result;
		
		//만약 결과값이 2자리라면 한번 더 10으로 나눈 나머지 값
		if(result >= 10) {
			result = result%10;
		}
		
		//마지막번호(체크용번호)랑 결과값이 같은지 비교
		if(result == checkNum) {
			System.out.println("정상적인 주민번호입니다");
		}
		else {
			System.out.println("정상적이지 않은 주민번호입니다");
		}
		
			
	}
	
	
}	
