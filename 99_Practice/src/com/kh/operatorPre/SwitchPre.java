package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchPre {

	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int day = sc.nextInt(); //키보드로 받은 숫자 입력
		
		switch (day) {
		case 1 :
			System.out.println("월요일입니다.");
			break;
		
		case 2 :
			System.out.println("화요일입니다.");
			break;
		
		default : 
			System.out.println("아무요일도 아닙니다.");
		}
		
		
	}
	
	/*method2 
	  Scanner sc = new Scanner(System.in);
	  int menuNumber = sc.nextInt();
	  
	  switch 
	  		case 1 = 아메리카노 나왔습니다.
	  		case 2 = 카페라떼 나왔습니다.
	  		case 3 = 흑당버플티 나왔습니다.
	  		default = 잘못 입력했습니다. 다시 이용해주세요
	
	
	*/
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
		
		switch(menuNumber) {
		
		case 1:
			System.out.println("아메리카노 나왔습니다.");
			break;
		case 2:
			System.out.println("카페라떼 나왔습니다.");
			break;
		case 3:
			System.out.println("흑당버블티 나왔습니다.");
			break;
		
		default:
			System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
		}
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("도시를 입력하세요 : ");
		String city = sc.nextLine();
		
		switch (city) {
		   case "서울":
		   System.out.println("대한민국");
		   break;
		  
		   default:
		   System.out.println("지역을 다시 입력하세요.");
		}
	}
	
	public static void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12까지 숫자를 입력하세요 : ");
		int month = sc.nextInt();
		switch (month) {
		
		case 12: case 1: case 2:
			System.out.println("겨울");
			break;

		case 3: case 4: case 5:
			System.out.println("봄");
			break;

		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		
		default:
			System.out.println("해당하는 계절이 없습니다.");
		
		// case는 중복되지 않음.
		
		
		
		}	
	}
	
	
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
			System.out.println();
		
		}
	}
	
	//등급에 따라서 학점을 출력하는 코드
	public static void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A, B, C, D, E, F 중 하나의 등급을 입력하세요. : ");
		// charAt 을 호출해서 작성한 문자열 중에 0번째 문자를 출력하겠다는 의미.
		char grade = sc.next().charAt(0);
		switch (grade) {
		
		case 'A': case 'a':
			System.out.println("4.0");
			break;
		case 'B': case 'b':
			System.out.println("3.0");
			break;
		case 'C': case 'c':
			System.out.println("2.0");
			break;
		case 'D': case 'd':
			System.out.println("1.0");
			break;
		
		default:
			System.out.println("입력한 정보가 없습니다.");
		
		
		
		
		}	
		
	}
	
	public static void main(String[] args) {
		//method1();
		//method2();
		//method3();
		//method4();
		method5();
	}

}
