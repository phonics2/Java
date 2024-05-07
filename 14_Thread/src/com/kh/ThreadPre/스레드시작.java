package com.kh.ThreadPre;

public class 스레드시작 {
	
	public static void main(String[] args) {
		

		//for 문으로 스레드 2개 만들기
		for(int i = 0; i < 3; i++) {
			스레드연습 b = new 스레드연습(i);
			//start() 스레드 시작
			b.start();
		
		}
		System.out.println("메인 종료~~");
		//for } 닫은 중괄호밑에 메인메서드 종료 출력 작성 후 실험해보기

		
		
	}
}
