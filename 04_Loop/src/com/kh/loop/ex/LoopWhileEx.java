package com.kh.loop.ex;

import java.util.Scanner;

public class LoopWhileEx {

	
	/*
	 public static void method1() {
	 Scanner sc = new Scanner(System.in);
	 1. 게임하기 2. 수영하기 3. 잠자기 4.프로그램 종료
	 
	 int menu
	 while(true) {
	 	System.out.println("~~프로그램 작성");
	 	System.out.println("원하는 프로그램 번호를 입력해주세요 : ");
	 	switch(menu){
	 		case 1: 
	 		
	 		case 2:
	 		
	 		case 3:
	 		
	 		case 4:
	 
	 	}
	 
	 }
	 while문을 사용해서
	 4번을 누르면 프로그램을 종료하는 코드를 작성하기
	 
	 
	 
	 
	 */
	
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.게임하기 2. 수영하기 3. 잠자기 4. 프로그램 종료");
			System.out.print("원하는 프로그램을 입력해주세요 : ");
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				System.out.println("게임하기");
				return;
			case 2:
				System.out.println("수영하기");
				return;
			case 3:
				System.out.println("잠자기");
				return;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("올바른 입력이 아닙니다.");
				
			}
		}
	}
	
	/*
	 public static void kh카페(){
	 	Scanner sc = new Scanner(System.in);
	 	while(true){
	 	System.out.println("kh카페에 오신걸 환영합니다. ^^* \n");
	 					+ " 원하는 메뉴를 입력해주세요. \n"
	 					+ "1 아메리카노 2 카페라떼 3 녹차 4 흑당버블티 5 주문취소");
	 					
	 	String menu = sc.next();
	 	
	 	switch(menu) {
	 		case "1": case "아메리카노":
	 			System.out.println("아메리카노 주문 추가되었습니다.");
	 			break;
	 			
	 		case "5": case "주문취소":
	 		default:
	 			System.out.println("번호를 잘못 입력했습니다. 다시 입력해주세요.");
	 	

       }
	}

}
	 kh카페에 오신걸 환영합니다 . ^^*
	 
	 
	 
	 */
	
	public static void kh카페() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("kh카페에 오신걸 환영합니다. ^^*\n"
					+ "원하는 메뉴를 입력해주세요.\n"
					+ "1 아메리카노 2. 카페라떼 3 녹차 4 흑당버블티 5 주문취소");
			System.out.print("(메뉴번호나 숫자 입력) : ");
			String menu = sc.next();
			
			switch(menu) {
			case "1": case "아메리카노":
				System.out.println("아메리카노 주문이 추가되었습니다.");
				break;
			case "2": case "카페라떼":
				System.out.println("카페라떼 주문이 추가되었습니다.");
				break;
			case "3": case "녹차":
				System.out.println("녹차 주문이 추가되었습니다.");
				break;
			case "4": case "흑당버블티":
				System.out.println("흑당버블티 주문이 추가되었습니다.");
				break;
			case "5": case "주문취소":
				System.out.println("주문이 취소되었습니다. 다음에 방문해주세요.");
				break;
				
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
			
			
			
			
			
			
			
		}
	}
	
	
	
	public static void getMoney() {
		//커피값 100원 가진돈 300원
		int coffee = 10;
		int money = 300;
		
		//만약에 돈이 0보다 많다면 커피를 구매하고
		//커피가 다 소진되면 판매를 중지한다.
		
		while(money > 0) {
			System.out.println("돈을 받았으니 커피를 제공");
			//커피가 10잔인데 1잔을 제공했다면, -1
			coffee--;
			System.out.println("남은 커피의 양은 " +coffee+" 잔 입니다.");
			//커피가 모두 소진됐다면 판매를 중지하자
			if(coffee == 0) {
				System.out.println("커피가 다 소진됐습니다. 판매를 중지합니다.");
				return;
			}
		
		
		}
	
	
	}
	
	
	// 1부터 5까지 숫자를 출력
	public static void allNumber() {
		int num = 1;
		while(num <= 5) {
			System.out.println(num);
			num++;  // num = num + 1 
		}
	}
	
	//10번찍어서 안넘어가는 나무 없습니다.~!
	//나무를 10번찍으면 나무 넘기기
	
	public static void tree() {
		// 나무를 찍기 전이기 때문에 공격 0
		int hit = 0;
		while(hit < 10) {
			//나무를 몇번 찍었는지 확인
			hit++;
			System.out.println("나무를 "+ hit + " 번 찍음");
			//만약에 나무를 공격한 수가 10번이 되면 나무가 넘어갑니다 표현
			if(hit == 10) {
				System.out.println("나무가 넘어갑니다~~!!!!! 성공~~!!!");
			}
		}
	}
	
	
	/*
	 사용자로부터 한 개의 숫자를 입력받아 1부터 그 숫자까지의 숫자를 모두 출력
	 단 입력한 수를 1보다 크거나 같아야 함
	 만약에 1 미만의 숫자가 입력됐다면 1이상의 숫자를 입력해주세요 출력하기
	 public static void method2() {
	 	int num = sc.nextInt();
	 	
	 	if (num < 1) {
	 		System.out.println("1이상의 숫자를 입력해주세요.");
	 	}else {
	 		System.out.println("1부터 " + num + "까지의 숫자들")
	 		int abc = 1;
	 		//while문을 사용해서 숫자 abc 부터 num까지 모두 출력하기
	 }	
	 	}
	
	 
	 
	 
	 */
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("0보다 큰 숫자를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		// 만약 1보다 작은 숫자를 넣은 경우 
		if (num < 1) {
			System.out.println("1이상의 숫자를 입력하세요.");
		} else {
			System.out.println("1부터" + num +"까지의 숫자들");
			int abc = 1; // 1 부터니까 1을 고정을 시켜놓는다.
			//while문을 사용해서 숫자abc 부터 num까지 모두 출력하기
			while(abc <= num) {
				System.out.println(abc); 
				abc++; //abc = abc + 1;
			}
			
			
			
		}
	

	
	}
	
	
	
	//커피가 100원 돈이 없으면 커피를 구매하지 못하는 경우
	public static void getCoffee() { //공부하기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("카페에 오신걸 환영합니다.");
		System.out.print("현재 가진 돈을 입력해주세요 : ");
		//커피가격 coffeePrice
		int coffeePrice = 100;
		//현재 가지고 있는 금액 입력
		int money = sc.nextInt();
		//만약에 
		while(money < coffeePrice) {
			/*
			 돈이 부족합니다. 커피를 구매하기 위해 더 많은 돈을 넣어주세요
			 현재 가진 돈을 입력해주세요.
			 현재 가진 돈 입력
			 nextInt();
			 
			 */
		System.out.println("돈이 부족합니다. \n"
				+ "커피를 구매하기 위해 더 많은 돈을 넣어주세요.\n"
				+ "↓ 현재 가진 돈을 입력해주세요 ↓");
		money = sc.nextInt();
		
		
		}
	
		//커피를 구매했다면 구매했습니다. 거스름돈 입력하기
		System.out.println("커피를 구매했습니다. 거스름돈은\n"
				+ (money - coffeePrice)+ " 입니다.");
	}
		
	//10000원 이상 돈이 없을 경우 탕수육을 시키지 못하는 예제
	public static void iLovePork() { //공부하기
		//1. Scanner를 이용해서 현재 보유하고 있는 금액 입력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("어서오세요");
		System.out.print("현재 가진돈을 입력해주세요 : ");
		int tangsuyuk = 10000;
		int myMoney = sc.nextInt();
		// 보유하고 있는 금액이 tangsuyuk 보다 적으면 잔액이 부족합니다.
		while(myMoney < tangsuyuk) {
			//다시 입금해주세요.
			System.out.println("잔액이 부족합니다.\n"
					+ "다시 입금해주세요 \n"
					+ "↓현재 가진돈을 입력하세요↓");
		
		// nextInt() 다시 입금할 금액을 입력		 //while 안에 입력하기 while은 반복문
		myMoney = sc.nextInt();
		}
		//돈이 10000원 이상이면 주문이 완료되었습니다.
		//현재 잔액은 00 입니다/
		System.out.println("주문이 완료되었습니다 \n"
				+ "거스름돈은 " + (myMoney -tangsuyuk) + " 원입니다");
		

	
	}
	
	
	
	
	
	
	
	/*public static void 작성하고싶은이름(){
	  
	  public (많이 사용) : 어디서든 접근 가능한 : 전체공개
	  protected : 같은 폴더 안에서만 접근 가능
	  default : 같은 폴더 안에서 접근 가능
	  		protected 보다 제한되게 접근가능
	  		
	  private 한 class 안에서만 접근 가능
	  		 작성한 공간 안에서만 접근 가능
	
		void : 반환하는 것 없이 바로 출력이 될 때 사용
	
	}
	*/
	
	
	
	public static void main(String[] args) {
		//method1();
		//kh카페();
		//getMoney();
		//allNumber();
		//tree();
		method2();
		//getCoffee();
		//iLovePork();
	}

}
