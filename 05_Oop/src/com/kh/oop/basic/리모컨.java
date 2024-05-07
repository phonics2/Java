package com.kh.oop.basic;

public class 리모컨 {

	//1. 필드
	//public boolean powerOn;
	//public int volume;
	
	
	//2. 생성자 (공산 생성자, 필수 생성자)
	//public 리모컨(int vol) {
	// this.volume = vol;
	//}
	
	//3. 메서드
	//public void 상태() {
	//System.out,println("음량 : " + volume);
	//}
	
	
	// 최종 출력할 메인 메서드를 만들어서
	// 리모컨 음량을 200으로 만들어서 음량이 200이 맞는지 확인하기

	
	//필드 만들기
	public boolean powerOn;
	public int volume;
	
	//공간생성자 (필수)
	public 리모컨() {
		
	}
	
	public 리모컨(boolean powerOn, int vol) {
		this.volume = vol;
		this.powerOn = powerOn;
	}
	
	//3. 메서드
	public void 상태() {
		System.out.println("음량 : "+ volume);
	}

	public static void main(String[] args) {
		//리모컴 객체 생성하기
		리모컨 rmc = new 리모컨();
		rmc.powerOn = true;
		rmc.volume = 100;
		System.out.println("리모컨의 전원은"+rmc.powerOn+" 이고 "
				+"볼륨은" + rmc.volume + " 입니다.");
		
// 리모컨 음량을 200으로 만들어서 음량이 200이 맞는지 확인하기
		
		리모컨 orderRmc = new 리모컨(true,200);
		System.out.println("리모컨의 전원은"+orderRmc.powerOn+" 이고 "
				+"볼륨은" + orderRmc.volume + " 입니다.");
		
	}
		

}
