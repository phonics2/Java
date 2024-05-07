package com.kh.variable.ex;

import java.util.Scanner;

public class Scanner15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 1 : ");
		int num = sc.nextInt();
		
		System.out.print("문장 입력 : ");
		String gke = sc.next();
		System.out.println("정수 값 : " +num);
		System.out.println("문장 입력 : " + gke);
		sc.close();		
	}

}
