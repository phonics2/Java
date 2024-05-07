package kh.control.condition.practice;

import java.util.Scanner;

public class Casting2연습문제0409 {

	public static void practice1() {// 키보드로 문자 입력받아 유니코드 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char a = sc.next().charAt(0);
		System.out.println(a+" unicode : "+(int)+a);
	}
	
	public static void practice2 () { //국영수 double > int 총점 평균 출력 각각 (int) 넣어주기
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		double kor = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		int totalScore = (int)kor+(int)+eng+(int)+math;
		int avr = totalScore/3;
		System.out.println("국어 : " +kor);
		System.out.println("영어 : " +eng);
		System.out.println("수학 : " +math);
		System.out.println();
		System.out.println("총점 : "+ totalScore);
		System.out.println("평균 : "+ avr);
	}
	
	public static void practice3 () {
		int inum1 = 10;
		int inum2 = 4;
		
		float fnum = 3.0f;
		
		double dnum = 2.5;
		
		char ch = 'A';
		// +  -  *  /
		System.out.println(inum1-(inum2)*2); //2
		System.out.println((int)dnum); //2 
		
		System.out.println(dnum * inum2); //10.0
		System.out.println((double)inum1); //10.0
		
		System.out.println(dnum); //2.5
		System.out.println((double)inum1 /(double)inum2); // 2.5
		
		System.out.println((int)fnum); // 3
		System.out.println(inum1 /(int)fnum); // 3
		
		System.out.println(inum1 / fnum); // 3.3333333
		System.out.println((double)inum1 / fnum); // 3.3333333333333335
		
		System.out.println( ch ); // 'A'
		System.out.println( (int)ch ); // 65
		System.out.println( (int)ch + inum1); // 75
		//System.out.println( (ch iNum1) ); // 'K'
	}
	
	
	public static void main(String[] args) {
		//practice1();
		//practice2();
		practice3();
	
	
	
	}	

}
