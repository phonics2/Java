package com.kh.conditionEx;

import java.util.Scanner;

public class asdfkel {

	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("안녕하세요. kh티켓나라입니다. ");
		System.out.print("나이를 입력해주세요. : ");
		int age = sc.nextInt();
		
		if(age <=13) {
			System.out.println("어린이");
		} else if(age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
	}
	
	
	public static void main(String[] args) {
		/*
		 나이를 입력받아
		 13세 이하면 "어린이"
		 13세 초과 18세 이하 "청ㅅ오년"
		 18세 초과 "성인" 
		 
		 */
		 method2();
	}

}
