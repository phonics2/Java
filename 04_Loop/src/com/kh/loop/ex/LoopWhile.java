package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhile {
	/*
	 while(조건식) : 끝이 확실하지 않은 반복에 사용
	 
	 while(조건식이참일경우) {
	 
	 	조건식이 참일 경우에 실행
	 }
	 조건식이 거짓일 경우에 실행 종료
	 
	 예제 코드 1:
	 	while(true) {
	 		System.out.println("무한 반복");
	 }
	 예제 코드 2:
	 	while(false) {
	 		System.out.pringln("실행하지 못한채로 종료");
	 }
	*/
	
	//최종으로 실행하지는 않지만 코드를 작성할 수 있는 메서드
	public static void inLoop() {
		//ctrl + c
		while(true) {
			System.out.println("무한 실행");
		}
	
	}
	public static void outLoop() {
		//while(false) {
		//	System.out.println("실행 안됨");
		//}
	}
	
	public static void whileLoop() {
		//조건 = 조건에서 숫자가 3 이상이면 조건 거짓
		int i = 1;
		while(i <= 2) {
			//조건이 참 일때 실행할 코드
			System.out.println("i의 값 : " + i);
			i++;
		
		}	
	}
	
	public static void whileLoopEX() {
		//스캐너 활용해서 키보드 값 입력 받기
		Scanner sc = new Scanner(System.in);
		while(true) {	
			System.out.println("1. 실행 2. 종료");
			System.out.print("원하는 숫자를 입력하세요 : ");
			
			int num = sc.nextInt();
			
			switch(num) {
				case 1:
					System.out.println("프로그램을 실행합니다.");
					break;
				case 2:
					System.out.println("프로그램을 종료합니다.");
					//break;
					return;
					//break   와 return  모두 case를 탈출하는 구문이기 때문에
					//같이 사용할 수 없음.
					//break   의 경우에는 while이 true일 때 종료되지 않고 계속 반복
					//return   의 경우 while이 true여도 while 코드를 탈출해서 프로그램을 종료
				default:
					System.out.println("잘못된 번호입니다. 번호를 다시 입력해주세요.");
					
			
			
			
			}
		}
		
		
	
	}
	
	
	
	
	//최종으로 실행하는 메인 메서드
	public static void main(String[] args) {
		//inLoop();
		//whileLoop();
		//whileLoopEX();
		
	}

}
