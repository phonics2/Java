package com.kh.inheritance.ex;

//자식클래스
public class 아이폰 extends 스마트폰 {

//필드
	private int ios;




	
	
//메서드
	//Setter
	public void setIOS(int iOS) {
		ios = iOS;
	}
	
	//Getter
	public int getIOS() {
		return ios;
	}
	//생성자 : 기본
	public 아이폰() {
		
	}

	//생성자 : 필수

	public 아이폰(String 화면, String 통신사, String 성능, int iOS) {
		super(화면, 통신사, 성능);
		this.ios = iOS;
	}
	
	
	//toString
	@Override
	public String toString() {
		return "아이폰 버젼 : " + ios + " / " + super.toString();
	
	}



}
