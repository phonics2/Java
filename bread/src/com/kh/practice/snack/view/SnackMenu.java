package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;


public class SnackMenu {
	// private고객이 입력하고 보는 창
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	
	
		
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("맛 : ");
		String flavor = sc.next();
		System.out.print("개수 : ");
		int numOf = sc.nextInt();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		
		System.out.println(scr.savaData(kind, name, flavor, numOf, price));
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")) {
			System.out.println(scr.confirmData());
			
		}
			
		
	}
	

}
