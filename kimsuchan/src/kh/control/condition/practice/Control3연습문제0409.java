package kh.control.condition.practice;

import java.util.Scanner;

public class Control3연습문제0409 {
	public static void practice1 () { // if switch 사용번호 입력받아 메뉴 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		String menu="";
		if (num == 7) {
			System.out.println("프로그램을 종료합니다.");
		} else {
		switch (num) {
		
		case 1:
			menu = "입력";
			break;
		case 2:
			menu = "수정";
			break;
		case 3:
			menu = "조회";
			break;
		case 4:
			menu = "삭제";
			break;
		case 7:
			System.out.println("프로그램을 종료합니다");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			return;
			
			 	
		}  System.out.println(menu+" 메뉴입니다.");
		
	}
		
}
	
	public static void practice2 () { //입력받은 정수가 홀수짝수 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if((num > 0) && (num%2==0)) {
			System.out.println("짝수다.");
		} else if (num % 2 == 1) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
	}
	
	public static void practice3 () { //점수받고 합격 불합격 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		String result;
		int totalScore = kor+math+eng;
		double avr = (double)totalScore/3.0;
		if((kor>=40)&&(math>=40)&&(eng>=40)&&(avr>=60)) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + totalScore);
			System.out.println("평균 : " + avr);
			result = "축하합니다, 합격입니다!!";
		} else {
			result = "불합격입니다.";
			//return;  return; : break; 처럼 중간을 끊는 역할을함. 다음 결과를 출력하지 않게 하는명령어. 
		}
		
		System.out.println(result);
	}	
	
	public static void practice4 () { //switch 사용해서 정수 입력후 달에 맞는계절 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		String season="";
		switch (num) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가을";
			break;
		default :
			System.out.println(num +"월은 잘못 입력된 달입니다.");
			return;
		}	System.out.println(num + "월은 "+ season +"입니다.");
	}
	
	public static void practice5 () { //.equals 문자열 이 서로 같은지 확인할때 쓰임.
	//반대로 문자열이 서로 다른지 확인할때는 비교하는 문자열 앞에 → [  !  ] 느낌표를 사용.
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		String result = "";
		if ((id.equals("ha4514"))&&(password.equals("asd254"))){
			result = "로그인 성공";
		}else if((id.equals("ha4514"))||(!password.equals("asd254"))) {
			result = "비밀번호가 틀렸습니다.";
		}else if((!id.equals("ha4514"))||(password.equals("asd254"))){
			result = "아이디가 틀렸습니다.";
		}else {
			result = "잘못 입력하셨습니다.";
		}System.out.println(result);
		
			
		
		
	}
	
	public static void practice6 () { // 관리자 회원 비회원 입력받아 권한 확인받기
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rating = sc.nextLine();
		String result = "";
		if("관리자".equals(rating)){
			result = "회원관리, 게시글관리 게시글 작성, 댓글 작성 게시글 조회 가능.";
			
		}else if("회원".equals(rating)) {
			result = "게시글 작성, 게시글조회, 댓글 작성 가능.";
		}else if("비회원".equals(rating)) {
			result = "게시글 조회만 가능.";
		}else {
			result = "잘못된 입력입니다.";
			
		}System.out.println(result);
	
	}
	
	public static void practice7 () { // bmi 계산 (안함)
		
	}
	
	public static void practice8 () { // 계산기 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 입력(+ , - , * , / , %)  : ");
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		double div = (double)num1 / (double)num2; 
		double persant = (double)num1%(double)num2;
		char sumkey = sc.next().charAt(0);
		switch (sumkey) {
		case '+':
			System.out.println(num1 + " + " + num2 + " = " +sum);
			break;
		case '-':
			System.out.println(num1 + " - " + num2 + " = " +sub);
			break;
		case '*':
			System.out.println(num1 + " * " + num2 + " = " +mul);
			break;
		case '/':
			System.out.printf(num1 + " / " + num2 + " = %.6f" ,div);
			break;
		case '%':
			System.out.println(num1 + " % " + num2 + " = " +persant);
			break;
		
		default:
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
	}
	
	public static void practice9 () { // 과제점수 입력후 Pass Fail 출력(안함)
		
	
		
	}
	
	public static void practice10() { //1~9 메뉴화면 구성하기
		Scanner sc = new Scanner(System.in);
		String result = "";
		System.out.println("실행할 기능을 선택하세요");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
		int select1 = sc.nextInt();
		switch(select1) {
		case 1:
			result = "(실습문제1 실행)";
			break;
		case 2:
			result = "(실습문제2 실행)";
			break;
		case 3:
			result = "(실습문제3 실행)";
			break;
		case 4:
			result = "(실습문제4 실행)";
			break;
		case 5:
			result = "(실습문제5 실행)";
			break;
		case 6:
			result = "(실습문제6 실행)";
			break;
		case 7:
			result = "(실습문제7 실행)";
			break;
		case 8:
			result = "(실습문제8 실행)";
			break;
		case 9:
			result = "(실습문제9 실행)";
			break;
		default :
			result = "잘못된 숫자입니다.";
			return;
		
		
		
		}System.out.println(result);
		
	}
		
		public static void main(String[] args) {

		//practice1();
		//practice2();
		//practice3();
		//practice4();
		practice5();
		//practice6();
		//practice7();
		//practice8();
		//practice9();
		//practice10();
		
		}	

}
