package com.kh.interfaceEx;


public class 기계실행 {
	public static void main(String[] args) {
		컴퓨터 윈도우 = new 컴퓨터();
		윈도우.전원켜기();
		윈도우.전원끄기();
	
	
		세탁기 돌돌이 = new 세탁기();
		돌돌이.전원켜기();
		돌돌이.전원끄기();
		
		//어린이용 계산기 실행
		어린이용계산기 c1 = new 어린이용계산기();
		c1.전원켜기();
		c1.전원끄기();
		
		//어린이용 계산기 기능
		int a = 10;
		int b = 5;
		System.out.println(a + " + " + b + " = " + c1.합(a, b));
		System.out.println(a + " - " + b + " = " + c1.차(a, b));
		System.out.println(a + " * " + b + " = " + c1.곱(a, b));
		System.out.println(a + " / " + b + " = " + c1.몫(a, b));
		System.out.println(a + " % " + b + " = " + c1.나머지(a, b));
	
	
		중학생계산기 m1 = new 중학생계산기();
		m1.전원켜기();
		
		a = 5; //int 붙일 필요없음 위에서 자료형 선언을 했음
		b = 3;
		
		System.out.println(a + " + " + b + " = " + m1.합(a, b));
		System.out.println(a + " - " + b + " = " + m1.차(a, b));
		System.out.println(a + " * " + b + " = " + m1.곱(a, b));
		System.out.println(a + " / " + b + " = " + m1.몫(a, b));
		System.out.println(a + " % " + b + " = " + m1.나머지(a, b));
		m1.전원끄기();
		
		
	
	}
}
