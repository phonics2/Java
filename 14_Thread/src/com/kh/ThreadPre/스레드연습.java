package com.kh.ThreadPre;

public class 스레드연습 extends Thread{
//필드 
	int 초;
	
//메서드
	
	public 스레드연습() {
		
	}
	//생성자 : 필수
	public 스레드연습(int 초) {
		this.초 = 초;
	}
	

	
	public void run() { //try catch
		System.out.println(this.초 + " 스레드 시작중");
		try {

			Thread.sleep(3000); //3초 대기

		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(this.초 +" 스레드 종료중");
		
	
	}
}
