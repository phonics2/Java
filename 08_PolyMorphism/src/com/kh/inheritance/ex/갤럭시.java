package com.kh.inheritance.ex;

public class 갤럭시 extends 스마트폰 {
//필드	
	private int android;




	
//메서드
	//Setter
	public void setAndroid(int android) {
		this.android = android;
	}
	
	//Getter
	public int getAndroid() {
		return android;
	}
	//생성자 : 기본
	public 갤럭시() {
		
	}
	//생성자 : 필수

	public 갤럭시(int android) {
		super();
		this.android = android;
	}

	@Override
	public String toString() {
		return "갤럭시 버젼 : " + android + " / " + super.toString();
	}
	
	
}