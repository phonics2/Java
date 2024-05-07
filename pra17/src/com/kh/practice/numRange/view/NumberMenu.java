package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	private Scanner sc = new Scanner(System.in);
	private NumberController nc = new NumberController();
	
	public void menu() throws NumRangeException {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		nc.checkDouble(num1, num2);
		
		if(nc.checkDouble(num1, num2)) {
			System.out.println(num1+"은"+num2+"의 배수인가?"+"true");
		}else{
			System.out.println(num1+"은"+num2+"의 배수인가?"+"false");
		} 
		
		
		
		
		
	}
}
