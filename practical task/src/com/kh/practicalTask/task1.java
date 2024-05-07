package com.kh.practicalTask;

import java.util.Scanner;

public class task1 {

	public static void method1 () {
		Scanner sc = new Scanner(System.in);
		System.out.println("↓ 아래에 숫자를 입력하세요 ↓");
		System.out.print("숫자 1 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		System.out.println("더한값 : " + sum);
		System.out.println("뺀값 : " + sub);	
		System.out.println("곱한 값 : " + mul);	
		System.out.println("나눈 값 : " + div);	
		
		sc.close();
		
	}
	
	public static void method2 () {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.println();
		System.out.println(num1==num2);
		
		sc.close();
	}
	
	public static void method3 () {
		//변수선언 하고 앞에 스캐너 변수 붙이기 sc.
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 :w);
		int 국어 = sc.nextInt();
		System.out.print("영어 :   점");
		int 영어 = sc.nextInt();
		System.out.print("수학 :   점");
		int 수학 = sc.nextInt();
		
		System.out.println();
		System.out.print("합계 : " + 국어 + 영어 + 수학);
		System.out.print("평균 : " + 국어 + 영어 + 수학/3);
		
		
	}
	public static void main(String[] args) {

		//method1 ();
		//method2();
		method3();
	}

}
