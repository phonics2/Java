package com.kh.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayEx2 {
	public ArrayEx2() {
		
	}
	
	public void practice1() {//1 ~ 10 까지
			// for 문을 활용한 배열 출력하기
			int[] numbers = new int[10];
			
			//0 부터 9까지 배열에 숫자를 넣기
			//index 0부터 시작하기 때문
			//length 길이
			System.out.println("최대길이 : " + numbers.length);
				
			for(int i = 0; i < numbers.length; i++) {
				
				numbers[i] = i + 1;
				
				System.out.println("numbers["+ i +"] = " + numbers[i]);
			}
			
		}

	
	public void practice2() {// 10 ~ 1 까지
			int[] numbers = new int[10];
			
			
			System.out.println("최대개수 : " + numbers.length);
			
			for(int i = 0; i < numbers.length ; i++) {
				
				numbers[i] = numbers.length - i;
				
				System.out.println("numbers["+i+"] = " +numbers[i]);
			}
		
		}
	
		
	public void practice3() {// Scanner 
		//양의 정수를 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int size = sc.nextInt(); // 5
		
		//입력 받은 정수 크기의 배열 생성
		int[] numbers = new int[size]; //size = 5
	
		//number.length = size
		
		for(int i = 0; i < size; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i] + " ");
		}
	
		
	}
	
	public void practice4() { //과일 출력하기
		
						//   0    1    2     3     4
		String[] fruits = {"사과","귤","포도","복숭아","참외"};
		System.out.println(fruits[1]);
	}
	
	public void practice5() {//x
		
	}
	
	public void practice6() {//요일
		Scanner sc = new Scanner(System.in);
		//
		String [] days = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일",};
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num > 6) {
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println(days[num]);
	
	}	

	
	public void practice06() {//수업
		//요일생성
			    // length(최대길이)  7
			    // index   0   1   2   3   4   5   6
		String[] week = {"월","화","수","목","금","토","일",};
		Scanner sc = new Scanner(System.in);
		System.out.print("0부터 6까지의 숫자 입력받기 : ");
		int num = sc.nextInt();
		
		//입력한 숫자가 0 ~ 6 사이에 있는지 확인 후 사이에 있다면 요일 출력
		if((num >= 0) && (num <= 6)) {
			System.out.println(week[num]+ "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice7() {//X
	
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] numbers = new int[num];
		for(int i = 0; i < num; i++) {
			System.out.print("배열"+i+"번째 인덱스 값 : ");
			int num2 = sc.nextInt();
			
			
		}
		
		
	}
	
	
	
	public void practice9() {//랜덤출력 배열
		int[] numbers = new int[7];
		 //index = 0;  0이 배열 최대값보다 작을때; a+1
		System.out.print("각 배열에 랜덤으로 넣은 숫자 : ");
		for(int a = 0; a<numbers.length; a++) {
			numbers[a] = (int)(Math.random()*45+1);//for안에서 랜덤숫자 돌리기 
			
			System.out.print(numbers[a]+" ");
		}
			
		}
		
	
	public void practice09() {//수업
		
		//길이가 7인 배열을 생성
		int[] num = new int[7]; //index : 0 1 2 3 4 5 6  length : 7
						//   num의 최종 길이를 알기 위해서 num.length 를 사용
		 for(int i = 0; i < num.length; i++) {
			//랜덤으로 숫자 랜덤으로 숫자 출력하기
				// 랜덤으로 숫자를 출력하는 방법
				//1. Random 객체 사용 : 조금 더 넓은 범위로 랜덤으로 사용
				//2. Math 객체에서 random() 메서드 사용 : Random객체보다 작은 범위로 사용가능
			 num[i] = (int)(Math.random()* 45 + 1);//45 0 ~ 44   +1
			 System.out.println("num[" + i + "] = "  + num[i]);
		 }
		
	}
	
	public void method1() {
		// 정수 0 1 2  10 20 30 출력하기
		int[] num = new int[3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		for(int a = 0; a<num.length; a++) {
			System.out.print(num[a]+" ");
		}
		
		
		// 문자열 각 자리에 월 화 수 목 금 토 일 각 자리에 어떤 요일이 들어가 있는지 출력
		String str[] = {"월","화","수","목","금","토","일",};
		
		//for 문을 사용해서 출력
		for(int i = 0; i<str.length; i++) {
			System.out.print(str[i]+" ");
		}
		
		
		// 실수 index 2 까지 만들어주고 출력  실수 자유
		double[] dbl = new double[3];
		for(int i = 0; i < dbl.length; i++) {
			dbl[i] = i+0.2;
			System.out.print(dbl[i]+" ");
		}
		// 문자 'A' 'B' 'C' 넣어준 다음 각 자리 출력해보기
		char[] chr = {'A','B','C'};
		for(int i = 0; i < chr.length; i++) {
			System.out.print(chr[i]+" ");
		}
	}
	
	public void practice10() {//X
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		int jumin = sc.nextInt();
		
	}
	
	
	public void practice11() {//난수 출력
		int[] num = new int[10];
		for(int a = 0; a<num.length; a++) {
			
			num[a] = (int)(Math.random()*10+1);
			System.out.print(num[a]+" ");
		
		}
}
	
	
	public void practice12() {//최대값 최소값 구하기
		int[] num = new int[10];
		for(int i = 0; i<num.length; i++) {
			num[i] = (int)(Math.random()*10+1);
			System.out.print(num[i]+" ");
		}
		Arrays.sort(num);//배열을 작은수부터 큰수까지 정렬.
		System.out.println();
		
			//정렬을 시킨후 마지막 배열이 제일크니까 최대길이  -1  을 해줌
		System.out.println("최대값 : "+ num[num.length-1]);
			//정렬을 시킨후 처음 배열이 제일 작으니까 첫번째 배열을 출력해줌
		System.out.println("최소값 : " + num[0]);
	}
	
	public void practice17() {//치킨
		//입력한 값이 배열에 있는지 검색
		//있으면 치킨 배달가능 없으면 없는 치킨 입니다. 출력
		String[] chikenMenu = {"양념치킨","후라이드치킨","간장치킨"};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요 : ");
		String inputChic = sc.next();
		
		//배열에 사용자가 입력한 치킨이 있는지 검색
		boolean found = false;
		
		//for - each 문을 사용해서 치킨이 있는지 확인하는 작업
		for(String 치킨 : chikenMenu) {
			//System.out.println(치킨);
		
		// 만약에 치킨이 존재한다면 found = true ;   break;
		if(치킨.equals(inputChic)) {
			found = true;
			break;
		}
	}
		//만약에 치킨이 존재한다면 배달가능 출력
		if(found) {
			System.out.println(inputChic + "치킨은 배달가능! 합니다.");
		// 존재하지 않는다면 ㅇㅇ 치킨은 없는 메뉴입니다. 출력
		}else {
			System.out.println(inputChic + "치킨은(는) 없는 메뉴입니다.");
		}
		
		
	}
	
	public void practice017() {//치킨
		Scanner sc = new Scanner(System.in);
		String[] menu = {"양념","후라이드","간장"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String chic = sc.next();
		
		boolean 치킨찾음 = false;
		
		for(String 치킨 : menu) {//menu 배열을 치킨  으로 변수명 지정
			if(치킨.equals(chic)) {//만약 치킨(menu)에 입력한 치킨이 있으면,
				치킨찾음 = true;//치킨 찾음 true로 변경
				break; // for 문 나오기 break;
			}
		}if(치킨찾음) {//치킨찾음이 true 면,
			System.out.println(chic+"치킨 배달 가능!");
		}else {		//아니면
			System.out.println(chic+"치킨은 없는 메뉴입니다.");
		}
	}
	
	
	public static void main(String[] args) {
		ArrayEx2 ae2 = new ArrayEx2();
		//ae2.practice1();
		//ae2.practice2();
		//ae2.practice3();
		//ae2.practice4();
		//ae2.practice5();
		//ae2.practice6();
		//ae2.practice7();
		ae2.practice9();
		//ae2.practice10();
		//ae2.practice11();
		//ae2.practice12();
		//ae2.practice06();
		//ae2.practice09();
		//ae2.method1();
		//ae2.practice17();
		//ae2.practice017();
	
	
	}

}
