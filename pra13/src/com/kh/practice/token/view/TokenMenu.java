package com.kh.practice.token.view;

import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 시스템 종료");
		System.out.print("메뉴 선택 : ");
		int num  = sc.nextInt();
		sc.nextLine();
		switch(num) {
		case 1:
			tokenMenu();
			break;
		case 2:
			inputMenu();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			return;
		default :
			System.out.println("잘못입력. 다시입력하세요.");
		}
	}
}
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m ";
		System.out.println("토큰 처리전 : "+str);
		System.out.println("토큰 처리전 개수 "+str.length());
		tc.afterToken(str);
		System.out.print("처리후 글자 : ");
		
		System.out.println("대문자로 변경:"+tc.Cap(str));
		
		
		
	}
	public void inputMenu() {
		
	}
	
}
