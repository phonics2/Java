package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;
//Product를 가져와서 실행하는 클래스
public class Run {
	//메인 메서드
	public static void main(String[] args) {

		Product 정보 = new Product();
		정보.setpName("사과");
		정보.setPrice(2000);
		정보.setBrand("유기농 마을");
		
		
		정보.information();
		System.out.println("=== get 불러오기 ===");
		System.out.println("이름 : " + 정보.getpName());
		System.out.println("가격 : " + 정보.getPrice());
		System.out.println("브랜드 : " + 정보.getBrand());
		
		
		
	}

}
