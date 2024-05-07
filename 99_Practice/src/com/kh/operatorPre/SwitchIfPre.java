package com.kh.operatorPre;

import java.util.Scanner;

public class SwitchIfPre {

	/*표기법 : 코드를 작성할 때,
	}	개발자 사이에 코드를 보기 편하게 하기 위해서 작성하는 표기법
		
		케밥표기법(case)
		중간에 대시(-)로 구분해서 변수명을 작성해주는 표기방법
		ex)  kebab-case  one-two-three  ...
		
		
		카멜 케이스
		중간글자만 대문자로 시작해서 표현하는 방식
		ex) camelCase  genderCode  ...  
		
		스네이크 케이스
		변수명에 언더바가( _ ) 들어있는 표현방식 
		ex) snake_case  ...
		
		파스칼 케이스
		첫글자와 중간 글자를 대문자로 사용하는 표현방식
		ex)  PascalCase  OntTwoThree  GenderCode ...
		*/
	public static void practice8() { // 주민번호 남자여자 출력
		// 주민번호 이용해서 남자인지 여자인지 구분해서 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함) : ");
		String idNumber = sc.next(); // next();
		// charAt 7번째 자리에 있는 값을 가지고 와서 여자인지 남자인지 구분해서 출력
		// 990101-1234567  000101-3456789
		// 990101-2345678  000101-4567890
		// 
		// 주민번호 뒷자리의 첫 번째 숫자를 가지고 옵니다.
		// 주민번호 - 제외하고 주민번호 숫자만 입력한다면 6번째 자리에 있는 값을 가지고 와야함.
		
		char genderCode = idNumber.charAt(7); // - 포함해서 7자리 charAt 은 0부터시작.
		
		// 주민번호 뒷자리 첫 번째 숫자로 성별을 판별
		String gender; //나중에 여자인지 남자인지 확인해주는 결과 보여주기
		//만약에 1이나 3이 들어온다면 남자
		// "" String   '' char 를 사용해서 숫자값을 가져오기 때문에 '' 사용 
		//만약에 2나 4가 들어온다면 여자
		if ((genderCode == '1'|| (genderCode == '3'))) {
			gender = "남자";
			
		}else if((genderCode == '2'|| (genderCode == '4'))){
			gender = "여자";
		}else {
			System.out.println("올바른 주민번호가 아닙니다.");
			//1. gender = "올바른 주민번호가 아닙니다.
			//2. else에서 돌려보내는 return
			return;
		}
		//여자인지 남자인지의 대한 결과
		System.out.println("입력한 주민번호는 " + gender + "입니다.");
	}

	
	public static void castingPratice1() { // 유니코드 출력
		//키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);
		
		// 유니코드 출력
		// 전 세계의 모든 글자나 문자를 컴퓨터에서 일관되게 표현하기 위한 방식
		// 글자에 숫자를 붙여서 컴퓨터가 읽을 수 있도록 해주는 방식
		int unicode = inputChar;//char 2byte  int 8byte
		System.out.println("입력한 문자" +inputChar+ " 의 유니코드는 "+ unicode+ " 입니다.");					
	}	
	
	public static void castingPratice3() { //주석옆에값 출력해보기
		//주어진 코드에서 빈칸을 채우고 출력 결과가 나오도록 만든 것
		int inum1 = 10;
		int inum2 = 4;
		float fnum = 3.0f; //기본값이 double 이기때문에 float로 변경해주는 f 붙여줌
		double dnum = 2.5;
		char ch = 'A';
		System.out.println(inum1 /inum2); // 2 몫 2로 떨어진다면
		System.out.println((int) dnum); // 2 //double 실수로 되어있는 것을 정수로 변경 
		
		//double 실수로 되어있는 것을 정수로 변경
		//double 8byte  int 4byte  강제 형변환을 시켜줄 것 (int) 변경하겠다는 표시를 작성 후 시켜줌.
		System.out.println((double)inum2 * dnum); //10.0
		
		//작은 값과 큰 값이 만나면 자동으로 큰 값으로 변경되기 때문에 (double) 필수가 아님
		System.out.println((double)inum1); //10.0
		
		System.out.println((double)inum1 / inum2); //2.5 //정수 -> 실수형
		System.out.println(dnum); //2.5
		
		System.out.println((int)fnum); // 3 실수 -> 정수형
		System.out.println((int)(inum1 % fnum)); //3
		// int와 float 은 같은 크기의 byte 정수인지 실수인지 표기
		
		System.out.println((double)inum1 / fnum); // 3.3333333
		//float 소수점 이하 6자리까지만 기본으로 보여줌
		
		System.out.println((double)inum1 / fnum); // 3.333333333333335
		System.out.println(ch); //'A'
		System.out.println((int)ch);// 65
		System.out.println((int)(ch + inum1)); // 75
		// 'A' 값이 (int)ch를 통해 65
		// 큰 byte와 작은 byte가 만나면 자동으로 큰 byte 담겨진
		// 65+ (int inum1 = 10) = 75
		System.out.println((char)ch+inum1); // 75 = 'K'
	}	
	
	
	public static void controlPractice1() { //1. 입력 2. 조회 등등 메뉴 선택
		//키보드로 입력받고 입력 수정 조회 삭제 종료 버튼눌러서 실행하기
		Scanner sc = new Scanner(System.in);

		//메뉴 출력하기
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		//메뉴 번호 입력 받기
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNumber = sc.nextInt();
	
		//선택된 메뉴에 따라 동작 수행
		switch(menuNumber) {
		case 1:
			System.out.println("입력 메뉴 입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴 입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴 입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴 입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
			
		default:
			System.out.println("잘못된 메뉴 번호입니다.");
			
		
		
		}
	
	}		
		
	public static void controlPractice10() { // 실습메뉴 선택하기
		Scanner sc = new Scanner(System.in);
		/*System.ou.print에서 출력할 내용이 길어져서
		  줄 바꿈으로 글을 작성하고 싶다면 \n이용해서 줄바꿈해서 줄력하겠다는
		  \n = 세로로 줄바꿈해서 출력
		  \r = 키보드 입력 하는 위치를 현재 줄의 맨 처음으로 이동
		  팁 = \n을 많이 사용함.	
		  System.out.print();
		  +는 ); 붙이지 않는 한, 줄을 바꿔서 계속 이어서 작성할 수 있음
		*/
		System.out.println("1. 메뉴 출력\n"
				+ "2. 짝수/홀수\n"
				+ "3. 합격/불합격\n"
				+ "4. 계절\n"
				+ "5. 로그인\n"
				+ "6. 권한 확인\n"
				+ "7. BMI\n"
				+ "8. 계산기\n"
				+ "9. P/F");
		System.out.print("실행할 기능을 선택하세요 : ");
		int select = sc.nextInt();
		String result;
		switch(select) {
		case 1:
			result = "메뉴출력 실습 실행.";
			break;
		case 2:
			result = "짝수/홀수 실습 실행.";
			break;
		case 3:
			result = "합격/불합격 실습 실행.";
			break;
		case 4:
			result = "계절 출력 실습 실행.";
			break;
		case 5:
			result = "로그인 출력 실습 실행.";
			break;
		case 6:
			result = "권한 확인 실습 실행.";
			break;
		case 7:
			result = "BMI 출력 실습 실행.";
			break;
		case 8:
			result = "계산기 출력 실습 실행.";
			break;
		case 9:
			result = "P/F 출력 실습 실행.";
			break;
		
		default:
			System.out.println("올바른 번호가 아닙니다.");
			return;
		
		
		}
		System.out.println();
		System.out.println(result);
	
	}
	
	public static void controlPractice5() { //아이디 비밀번호 입력
		/*아이디 비밀번호 지정 후 아이디 비밀번호가 일치하는지 확인*/
		// 사용자가 지정한 아이디 비밀번호
		String userID = "myId";
		String userPW = "myPassword12";
		
		// 사용자한테 입력받을 아이디 비밀번호
		Scanner sc = new Scanner(System.in);
		System.out.print(" 아이디 : ");
		String inputID = sc.next();
		System.out.print(" 비밀번호 : ");
		String inputPW = sc.next();
		
		
		
		// 입력받은 값이 저장된 아이디 비밀번호와 일치하는지 확인
		if((inputID.equals(userID)) && (inputPW.equals(userPW))) {
			System.out.println("로그인 되었습니다.");
			//아이디가 틀렸는지 // 비밀번호가 틀렸는지
		
		/*
		 	// ! 특정 조건을 부정하는데 사용
		 	inputID.equals(userID) : intputID와 userID가 일치하는지 확인 일치하면 참(==)
		 														
		 	  !inputID.equals(userID) : inputID와 userID가 둘이 일치하지 않음
		 	  							 ! 가 붙으면 아이디가 틀렸을 때 참이 된다 = (!=)
		 */
		
		
		}else if(inputID.equals(userID)) {
			System.out.println("아이디가 틀렸습니다.");
			
			
		}else if(inputPW.equals(userPW)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else {
			System.out.println("잘못 입력된 비밀번호 입니다.");
		}
	
	
	}
	
	public static void controlPractice6() {
		// 사용자로부터 회원 등급 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		//권한이나 규칙을 설정할 때 자주 사용하는 변수명은 [  Role  ]
		String userRole = sc.next();
		
		//권한 출력
		System.out.println("해당 회원 등급의 권한");
		
		switch(userRole) {
		case "관리자":
			System.out.println("-회원관리\n"
					+ "-게시글관리\n"
					+ "-게시글작성\n"
					+ "-게시글조회\n"
					+ "-댓글작성\n");
			break;
		case "회원":
			System.out.println("-게시글작성\n"
					+ "-게시글 조회\n"
					+ "-댓글 작성");
			break;
		case "비회원":
			System.out.println("-게시글 조회");
			break;
		default:
			System.out.println("잘못된 회원 등급입니다.");
		}
		
	}
	
	
	public static void controlPractice8() {
		/*
		 키보드로 두 개의 정수와 연산 기호를 입력받아 연산 기호에 맞춰
		 연산 결과 출력
		 두 개의 정수 모두 양수일때만 작동하며 없는 연산 기호를 입력했을 경우
		 "잘못 입력했습니다." 출력
		
		 */ 
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("연산기호(+, -, *, /, %) : ");
		String oper = sc.next();
		double result;
		switch(oper) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
			 // % 0으로 나눌 수 없기 때문에 if문으로 값이 0이될 경우 처리를 해줘야함.
		case "/":
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 프로그램을 종료합니다.");
			}
			result = (double)num1 / num2;
			break;
		case "%":
			if(num2 == 0) {
				System.out.println("0으로 나눌수 없습니다. 프로그램을 종료합니다.");
			}
			result = num1 + num2;
			break;
		default:
			System.out.println("올바른 연산기호가 아닙니다.");
			return;
		}
		System.out.print(num1 + " " +oper+ " " + num2 + " = " +result);
		     
		
	
	}
		public static void main(String[] args) {
		//practice8();
		//castingPratice1();
		//controlPractice1();
		//controlPractice10();
		//controlPractice6();
		//controlPractice8();
	}
	
}
