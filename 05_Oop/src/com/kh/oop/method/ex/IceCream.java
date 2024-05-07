package com.kh.oop.method.ex;

public class IceCream {
//필드
	private String name;
	private int sugar;
	private boolean milk;
//메서드	
	
	//Getter
	public int getSugar() {
		return sugar;
	}
	public String getName() {
		return name;
	}
	public boolean isMilk() {
		return milk;
	}
	
	//Setter
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMilk(boolean milk) {
		this.milk = milk;
	}
	

	
	
	//생성자 : 기본
	public IceCream() {
		
	}
	//생성자 : 필수 이름 설탕 우유 유무
	public IceCream(String name, int sugar, boolean milk) {
		this.name = name;
		this.sugar = sugar;
		this.milk = milk;
	}
	//void makeIceCream() {
		//아이스크림 만들고
		//이름 설탕 우유 유무 출력
		//	우유는 추가 하면 우유 추가
		//	우유 미추가하면 우유 미추가 출력
		//}
	void makeIceCream() {
		System.out.println("아이스크림 만들기");
		System.out.println("이름 : " + name);
		System.out.println("설탕 : " + sugar +" g");
		if(milk) {
			System.out.println("우유 추가");
		} else {
			System.out.println("우유 미추가");
		}
		System.out.println("아이스크림 완성.");
	}
	

	

}
