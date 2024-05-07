package com.kh.practice.array.ArrayPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Practice {
	
	
	
	public void practice1() {//1부터 10까지 출력
		int[] num = new int[10];
		for(int i = 0; i<num.length; i++) {
			num[i] = i+1; //num[0] = 0+1 을 넣음
			System.out.print(num[i]+" ");
		}
	}

	public void practice2() {//10부터 1까지 출력
		int[] num = new int[10];
		
		
		//num[i] = num[0] 
		//i++ 이 들어가니 
		//배열에 최대길이에 더해지는i만큼 빼줌
		for(int i = 0; i<num.length; i++) {
			num[i] = num.length-i;
			System.out.print(num[i]+" ");
		}
	}

	public void practice3() {//스캐너로 출력 12345
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		int[] num = new int[input];
		for(int i = 0; i < input; i++) {
			num[i] = i+1;
			System.out.print(num[i]+" ");
		}
		
	}
	
	
	public void practice4() {//String 배열 과일
		String[] 과일 = {"사과","귤","포도","복숭아","참외"};
	
		System.out.println(과일[1]);
	}
	
	
	public void practice5() {
		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		String[] week = {"월","화","수","목","금","토","일"};
		System.out.print("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num>=0 && num<=6) {//0이상이면서 6이하 인 숫자 &&사용
			System.out.println(week[num]+"요일");
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice7() {//배열에 넣고 배열끼리 더하기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();//배열수 정하고 입력
		int[] numbers = new int[num];//입력한 정수 = 배열수
		for(int i = 0; i<numbers.length; i++) {
			System.out.print("배열"+i+"번째 인덱 값 : ");//배열에 넣을값 
			numbers[i] = sc.nextInt();//바로 0번째 배열에 숫자 입력시켜서 넣음
		}
		int sum = 0;// 총합 변수 sum 0으로 초기화
		//for each문 써서 배열 나열하기
		for(int num2 :numbers) { // for (자료형  변수명  : 배열명
			sum += num2; //나열한 배열을 하나씩 sum안에 더하게 만들기
			
		}
		System.out.println("총합 : " + sum);
		
		
		
	}
	
	
	public void practice8() { //1 2 3 2  1 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		while(true) {//조건에 맞지않으면 다시 입력하게 하기
			if(num % 2 == 0  || num < 3) {
				System.out.println("다시 입력하세요");
				System.out.print("정수 : ");
				int num2 = sc.nextInt();
				break;
			}
		}
		int[] arr = new int[num];//위에서 입력한 정수로 배열수 정하기
		//홀수니까 2로 나누면 중간값을 알수 있음
		int mid = num/2;
		for(int i = 0; i <= mid; i++) { //중간값까지 1을 더하도록 해줌
			arr[i] = i+1; //-> arr[0] = 0+1 
			
		}
	
	}
	
	public void practice9() {//랜덤 숫자 출력
		int[] nums = new int[7];
		for(int i = 0; i<nums.length; i++) {
		nums[i] = (int)(Math.random()*45+1); // 괄호를 실수하지말기
		System.out.print(nums[i]+" ");
		}
	}
	
	public void practice10() {//주민번호 *** .toCharArray()
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호-포함 : ");
		String jumin = sc.next();
		
		//jumin에 넣은 String문자열 char배열에 하나씩 쪼개서 넣기
							  //.toCharArray();
		char[] 주민번호배열 = jumin.toCharArray();//
		char[] 복사본 = jumin.toCharArray();//
		
		//복사본[8]배열 그뒤로 넣을것이니 i = 8부터 시작
		for(int i = 8; i < 복사본.length; i++) {
			char a = '*';
			복사본[i] = a;
			
		}
		System.out.println(복사본);
	}
	
	public void practice11() {//난수 발생 및 배열 초기화 
		//초기화 : 변수에 값 넣기
		int[] nums = new int[10];
		for(int i = 0; i <nums.length; i++) {
			nums[i] = (int)(Math.random()*10+1);
			System.out.print(nums[i]+" ");
		}
	}
	
	public void practice12() {//최대값 최소값
		int[] nums = new int[10];
		for(int i = 0; i<nums.length; i++) {
			nums[i] = (int)(Math.random()*10+1);
			System.out.print(nums[i]+" ");
			
			
		}
		Arrays.sort(nums);
		System.out.println("\n최대값 : " + nums[nums.length-1]);
		System.out.println("최소값 : " + nums[0]);
	}
	
	public void practice13() {
		
	}
	
	public void practice14() {
		HashSet<Integer> lo = new HashSet<>();
		
		
	}
	
	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열크기 : ");
		int size = sc.nextInt();
		sc.nextLine();
		
	}
	
	public static void main(String[] args) {
	
		Practice pre = new Practice();
		//pre.practice1();
		//pre.practice2();
		//pre.practice3();
		//pre.practice4();
		//pre.practice6();
		//pre.practice7();
		//pre.practice8();
		//pre.practice9();
		//pre.practice10();
		//pre.practice11();
		pre.practice12();
	}
	
	
	
	
	
	
	
	
}
