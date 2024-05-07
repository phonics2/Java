package com.kh.oop.method.ex;

public class HambergerStore {

	
	//필드
	private String name;
	private int price;
	

	//메서드
	
	//getter
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	//기본 생성
	public HambergerStore() {
		
	}
	
	//필수생성
	public HambergerStore(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public void info() {
		System.out.println("햄버거이름 : " + name);
		System.out.println("햄버거가격 : " + price+"원");
	}

	
	public static void main(String[] args) {
		HambergerStore berger = new HambergerStore();
		berger.setName("불고기버거");
		berger.setPrice(2000);
		berger.info();
		System.out.println("---------------");
		
		
		
		HambergerStore berger2 = new HambergerStore("치즈버거",3000);
		berger2.info();
	}
}

