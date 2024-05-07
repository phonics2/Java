package com.kh.oop.constructor;

public class Cafe {
	//필드 선언
		//카페 이름 지역 테이블수
	public String cafename;
	public String location;
	public	  int tableNum;
	
	
	//기본 생성자 와 필수 생성자 만들기
	public Cafe() {
		
	}
	
	public Cafe(String cafeName, String location, int tableNum) {
		this.cafename = cafeName;
		this.location = location;
		this.tableNum = tableNum;
	}
		
	
	// void 메서드 만들기
	public void cafeInfo() {
		//카페이름 지역 테이블수 출력하기
		System.out.println("카페이름 : " + cafename);
		System.out.println("카페지역 : " + location);
		System.out.println("테이블수 : " + tableNum);
		System.out.println("--------------");
	}

	public static void main(String[] args) {
		System.out.println("안녕하세요. kh민족입니다.");
		System.out.println("=== 카페 조회하기 ===");
		
		//Cafe cafe 객체 생성해서 기본생성자로 출력
		Cafe cafe1 = new Cafe();
		cafe1.cafename = "bucks";
		cafe1.tableNum = 7;
		cafe1.cafeInfo();
		
		
		//Cafe cafe 객체 생성해서 기본생성자로 출력
		Cafe cafe2 = new Cafe();
		cafe2.location = "역삼동";
		cafe2.tableNum = 10;
		cafe2.cafeInfo();
		
		//필수생성자로 출력하기
		Cafe cafe3 = new Cafe("bucks", "역삼동", 7);
		cafe3.cafeInfo();
		
		
		
		
		
	}

}
