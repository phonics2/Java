package kh.control.condition.practice;

import java.util.Scanner;

public class Operator1연습문제0409 {
	public static void practice1() { //양수 ,양수가 아니다 알아내기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요 : ");
		int num = sc.nextInt();
		String result;
		if(num > 0) {
			result = "양수다.";
			
		}else{
			result = "양수가 아니다.";
		}
		System.out.println(result);
		
	}
	

	public static void practice2() { //양수, 0, 음수 알아내기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		String result;
		if(num > 0) {
			result = "양수다.";
		} else if(num == 0) {
			result = "0이다";;
		} else {
			result = "음수다";
		}
		System.out.println(result);
		
	}
	

	public static void practice3() {//짝수 홀수 알아내기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		String result;
		int num = sc.nextInt();
		if((num % 2) ==0) { //입력한 숫자가 짝수이면 이라는 연산 
			result = "짝수다";
		}else {
			result = "홀수다";
		}
		System.out.println(result);
}	

	
	public static void practice4() { // 사탕 나누고 나머지구하기 (나머지 구하는건 % 사용)
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candies = sc.nextInt();
		int getCandies = candies/people;
		int remain = candies % people; // 나누고 나머지 값 구할때는 % 사용
		System.out.println("1인당 사탕 개수 : " + getCandies);
		System.out.println("남는 사탕 개수 : " + remain);
		
	}
	 
	
	public static void practice5() { // 이름 학년 반 번호 M/F받고 결과 구하기
		Scanner sc = new Scanner(System.in);
		String result;
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int class1 = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		System.out.print("성별(M/F) : " );
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double results = sc.nextDouble();
		if("M".equals(gender)) {
			result = "남학생";
			
		}else {
			result = "여학생";
		}System.out.println(grade+ "학년 " +class1+"반 "+ number + "번 " + name+" " + result+ "의 성적은 " +results +"이다.");
		
		
	}
	
	public static void practice6() { // 나이 입력받아 어린이, 청소년, 성인 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String result;
		if(age <=13) {
			result = "어린이";
			
		}else if ((age>13) && (age<=19))/*=> age가 13세를 초과 하면서 19세 이하 인지.*/ {
			result = "청소년";
			
		}else {
			result = "성인";
		}
		System.out.println(result);
	}
	
	public static void practice7() { // 국영수 입력받아 만약 40이상 평균60 합격 불합격 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		String result;
		
		int sum = kor + eng + math;
		double avr = sum/3.0;
		if((kor >= 40)&&(eng >= 40)&&(math>=40)&&(avr>=60)){
			result = "합격";
		}else {
			result ="불합격";
		}
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.2f" ,avr);
		System.out.println();
		System.out.println(result);
	}
	
	public static void practice8() { //  주민번호 성별 (막힘ㅋㅋㅋㅋㅋㅋ)
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		
	}
	
	public static void practice9() { //수 두개 입력받고 나머지하나(총세개) 더받아서 true false 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		boolean result = ((num3 <= num1)||(num3 > num2));
		System.out.println(result);
	}
	
	public static void practice10() { // 수 세개 true false 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("num1 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 : ");
		int num2 = sc.nextInt();
		System.out.print("num3 : ");
		int num3 = sc.nextInt();
		boolean result = ((num1==num2)&&(num2==num3));
		System.out.println(result);
			
		
	
	
	}	
	
	public static void practice11() {
		Scanner sc = new Scanner(System.in);
		String result ;
		System.out.print("A사원의 연봉 : ");
		int pay1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int pay2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int pay3 = sc.nextInt();
		double incmul1 = pay1*0.4;
		double incmul2 = pay2*1.0;
		double incmul3 = pay3*0.15;
		double incA = pay1+incmul1;
		double incB = pay1+incmul2;
		double incC = pay1+incmul3;
		if(incA >= 3000) {
			result = "3000 이상";
		}else if(incB >= 3000){
			result = "3000 이상";
		}else if(incC >= 3000) {
			result = "3000 이상";
		}else {
			result = "3000 미만";
			return;
	}
		System.out.println("A사원 연봉/연봉+a : " +pay1+"/"+incA);
		System.out.println(result);
		System.out.println("B사원 연봉/연봉+a : " +pay2+"/"+incB);
		System.out.println(result);
		System.out.println("C사원 연봉/연봉+a : " +pay3+"/"+incC);
		System.out.println(result);
	}
	public static void main(String[] args) {
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		//practice5();
		//practice6();
		//practice7();
		//practice8();
		//practice9();
		//practice10();
		//practice11();
	}

}
