package com.kh.oop.method.oop;

public class DrinkMaker {
	//필드
	private String drinkType;//음료종류
	private    int quantity;//음료 양
	private   int temp;	//온도
	
		
	

	//메서드
	
	
	//setter
	public void setDrinkType(String drinkType) {
		this.drinkType = drinkType;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	
	//getter
	public String getDrinkType() {
		return drinkType;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTemp() {
		return temp;
	}
	//생성자 : 기본
	public DrinkMaker() {
		
	}
	//생성자 : 필수 음료종류  음료양 온도
	public DrinkMaker(String drinkType, int quantity, int temp) {
		this.drinkType = drinkType;
		this.quantity = quantity;
		this.temp = temp;
	}
	//void makeDrink
		//음료종류 음료양 
	public void makeDrink() {
		System.out.println("주문 음료 : " + drinkType);
		System.out.println("음료 양 : " + quantity+" ml");
		if(temp < 5) {
			System.out.println("차갑게");
		}else if((temp >= 5) && (temp <= 10)) {
			System.out.println("미지근하게");
		}else {
			System.out.println("뜨겁게");
		}
	}
		//if 온도 (<5) 차갑게
		//else if 온도(5~10) 미지근하게
		//else { 뜨겁게
}
