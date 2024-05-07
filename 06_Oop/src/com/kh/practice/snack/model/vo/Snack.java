package com.kh.practice.snack.model.vo;

public class Snack {
	
	// 필드생성
	public String kind;
	public String name;
	public String flaver;
	public int numOf;
	public int price;
	
	// 필수는 아니지만 기본 생성자 만들기
	public Snack() {
		
	}
	
	//필수 생성자  생성. 변수지정 은 this.
	public Snack(String 종류, String 이름, String 맛, int 개수, int 가격) {
		this.kind = 종류;
		this.name = 이름;
		this.flaver = 맛;
		this.numOf = 개수;
		this.price = 가격;
	}

	
	
	


}
