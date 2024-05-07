package kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPra {
	/*System.out.printf() 사용방법
	%d : 정  수
	%f : 소수점 수
	%s : 문자열 출력
	%c : 문자 하나 출력
	%b : true 인지 false 출력
	%x : 16진수 정수
	%o : 8진수 정수
	 
	 d
	 * */
	
	
	
	
	
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		String result;
		if ((num > 0) && (num % 2 == 0))  {
			result = "짝수입니다";
			} else if (num % 2 == 1){
				result = "홀수입니다";
			} else {
				result = "양수만 입력해주세요";
				
			} System.out.println(result);
			
	}
	
	public static void practice2() {
	Scanner sc = new Scanner(System.in);
	String result;
	System.out.print("국어 점수 : ");
	int kor = sc.nextInt();
	System.out.print("영어 점수 : ");
	int eng = sc.nextInt();
	System.out.print("수학 점수 : ");
	int math = sc.nextInt();
	
	int sum = kor+eng+math;
	double aver = (double)sum / 3.0;
	if (((kor>=40) && (eng>=40) && (math>=40)) && aver >=60) {
		result = "축하합니다, 합격입니다";
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + aver);
	} else {
		result = "불합격입니다.ㅠ";
	}

	System.out.println(result);
	
	
	
	}	
	
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		String result;
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		if ((num == 1) || (num == 3) || (num == 5) || (num == 7) || (num == 8) || (num == 10) || (num == 12))  {
			result = num + "월은 31일 까지 있습니다.";
		} else if ((num == 4) || (num == 6) || (num == 9) || (num == 11) || (num == 2) ){
			result = num + "월은 30일 까지 있습니다.";
		} else {
			result = num + "월은 잘못 입력된 달입니다.";
		}
		System.out.println(result);
	}
	//System.out.printf() 는!!!!!!!  연결할때 +가 아니라 ,(콤마) 사용
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		String result;
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight/(height*height);
		if (bmi < 18.5)  {
			result = "저체중";
		} else if ((bmi >= 18.5) && (bmi < 23)) {
			result = "정상체중";
		} else if ((bmi >= 23) && (bmi < 25)) {
			result = "과체중";
		} else if ((bmi >= 25) && (bmi < 30)) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println("bmi 지수 : " +bmi);
		System.out.println(result);
	}
	
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		String result;
		System.out.print("중간 고사 점수 : ");
		double midScore = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		double finalScore = sc.nextInt();
		System.out.print("과제 점수 : ");
		double proScore = sc.nextInt();
		System.out.print("출석 횟수 : ");
		int appear = sc.nextInt();
		double midSco = (midScore*0.2);
		double finalSco = (finalScore*0.3);
		double pro = (proScore*0.3);
		double sum = (pro + finalSco + midSco + appear);
		//if () {
			
		//}
		
			
		
		
		
		
	}
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
	    //practice4();
		//practice5();
	}

}
