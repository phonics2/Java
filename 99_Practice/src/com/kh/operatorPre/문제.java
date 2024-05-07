package com.kh.operatorPre;

import java.util.Scanner;

public class 문제 {
		/*public static void controlPractice8() {
		/
		 키보드로 두 개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰
		 연산 결과 출력
		 두 개의 정수 모두 양수일때만 작동하며 없는 연산 기호를 입력했을 경우
		 "잘못 입력했습니다." 출력
		
		 /
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("연산기호(+, -, *, /, %) : ");
		String a = sc.next();
		String result = "";
		char oper = sc.next().charAt(0);
		switch(oper) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
			 // % 0으로 나눌 수 없기 때문에 if문으로 값이 0이될 경우 처리를 해줘야함.
		case '/':
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
			}
			result = (double)num1 / num2;
			break;
		case '%':
			if(num2 == 0) {
				System.out.println("0으로 나눌수 없습니다. 프로그램을 종료합니다.");
			}
			result = num1 + num2;
			break;
		default:
			System.out.println("올바른 연산기호가 아닙니다.");
			return;
		}
		System.out.print(num1 + " " +oper+ " " + num2 + "=" +result);
		     
	}*/
	
	
	public static void controlPractice() {
		/*
		 키보드로 두 개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰
		 연산 결과 출력
		 (두 개의 정수 모두 양수일때만 작동하며 없는 연산 기호를 입력했을 경우
		 "잘못 입력했습니다." 출력
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+, -, *, /, %): ");
		String operator = sc.next(); 
		
		double result;
		switch(operator) {
		case "+" :
			result = num1 + num2;
			break;
		case "-" :
			result = num1 - num2;
			break;
		case "*" :
			result = num1 * num2;
			break;
			/* / % 0으로 나눌 수 없기 때문에 if문으로 값이 0이될 경우 처리를 해줘야함 */
		case "/" :
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = (double) num1 / num2;
			break;
		case "%" : 
			if(num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
				return;
			}
			result = num1 % num2;
			break;
		default:
			System.out.print("잘못 입력했습니다. 프로그램을 종료합니다");
			return;
		}
		System.out.println(num1 + " " + operator + " " + num2 + "=" + result);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

	}

}
