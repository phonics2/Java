package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	//Greeting : 안녕하세요 인사를 출력하는 메서드
	public void Greeting() {
		System.out.println("안녕하세요.");
	
	}
	//Greeting2 : 반갑습니다 인사를 출력하는 메서드
	public void Greeting2() {
		System.out.println("반갑습니다.");
	}
	
	
		
	
	public void practice10() {//1부터 출력하기(수업)
		//1미만의 숫자가 입력됐다면
		//1 이상의 숫자를 입력해주세요가 출력되면서
		//다시 사용자가 값을 입력하도록 하기
		Scanner sc = new Scanner(System.in);
		int num;
		while(true){
			System.out.print("1미만의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num < 1) {
			System.out.println("1 이상의 숫자를 입력하세요");
			} else {
				break;
			}
			
		}
			//1부터 ~ 까지의 숫자들이 나왔는지 출력을 보고 싶다면
			System.out.println("1부터" + "까지의 숫자들");
			int i = 1;
			while(i <= num) {	
				System.out.println(i+ " ");
				i++;
			}
			
			//while(i <= num) {
			//	System.out.println(i + " ");
			//	i++;
		//	}
	
	
	
	
	}			

	
	public void practice11() { //거꾸로 출력하기(수업)
		//사용자로부터 한 개의 값을 입력받아
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("**** practice 11 시작****");
		// 단 입력한 수는 1보다 크거나 같아야함
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			num = sc.nextInt();
			
			if(num<1) {
				System.out.println("1 이상의 숫자를 다시 입력해주세요");
			}else {
				break;
			}
		}
	
		System.out.println(num + " 부터 1까지의 숫자들을 거꾸로 출력합니다.");
		
		//1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하기
		while(num >= 1) {
			System.out.println(num+ " ");
			num--; // 키보드로 입력받은 숫자에서 -1을 하면서 1이 될 때 까지 출력
		}
		
	
	}
	
	public void practice12() { //계산기(수업)
		Scanner sc = new Scanner(System.in);
		//두 정수와 연산기호를 받아서 계산하는 메소드
		//연산의 경우에는 + / * - %
		String operator;
		
		while(true) {
			System.out.println("프로그램 종료를 원할 경우 exit 입력할것");
			System.out.print("연산입력(+ - / * %) : ");
			
			operator = sc.next();
			
			//만약에 exit를 입력해서 프로그램 종료를 원할 경우
			//문자열(String)으로 비교를 할 경우 .equals ==
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			//정수 1과 정수 2를 입력 받아서 계산하기
			System.out.print("정수1 : ");
			int 정수1 = sc.nextInt();
			System.out.print("정수2 : ");
			int 정수2 = sc.nextInt();
			
			//정수1과 정수2 계산에 대한 결과(=result)
			int 결과;
			
			//switch case "+"
			if (operator.equals("+")) {
				결과 = 정수1 + 정수2;
				
			}else if (operator.equals("-")) {
				결과 = 정수1 - 정수2;
			}else if (operator.equals("*")) {
				결과 = 정수1 * 정수2;
			}else if(operator.equals("/")) {
				//몫 같은 경우에는 0으로 나눌수 없기 때문에 정수2는 0이 될수없음
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				결과 = 정수1 / 정수2;
			}else if(operator.equals("%")) {
				//몫 같은 경우에는 0으로 나눌 수 없기 때문에 정수2는 0이 될수없음
				if(정수2 == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
				}
				결과 = 정수1 % 정수2;
				
			}else {
				System.out.println("없는 연산자입니다 다시 입력해주세요.");
				continue;
			}
			System.out.println(정수1 + "  " +operator+ "  " + 정수2 + " = " +결과);
		}
	}



	public void practice01() {//1부터 숫자 나열
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num<1) {
			System.out.println("1이상의 숫자만 입력바랍니다.");
		}else {
			for(int i = 1; i<=num; i++) { //for(시작값 지정 ; 조건지정; 연산자)
				System.out.println(i);	
			}
		}
	}


	public void practice02() {// 틀리면 다시입력하게 하기
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		while(true) {
			if(num < 1) {
				System.out.print("1이상의 숫자만 입력해주세요 : ");
				num = sc.nextInt();
				
			}else {
				for(int i = 1; i<=num; i++) {
					System.out.print(i);
					
				}return;
			}
		
		}
	}


	public void practice03() {// 거꾸로 출력하기
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		num = sc.nextInt();
			if(num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요");
				
			}else {
				for(int i = 0; num>i; num--) {
					System.out.print(num);
				
			  }
		   }
		
	}

	public void practice04() {// 틀리면 다시입력하게 하기(거꾸로)
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		while(true) {
			if(num<1) {
				System.out.print("숫자를 다시 입력하세요(1보다큰수) : ");
				num = sc.nextInt();
				
			}else {
				for(int a = 0; num>0; num--) {
					System.out.print(num);
				}return;
			}
		}
	}

	public void practice05() {// 숫자받고 받은수 1부터 더하기 (못품) +=  ??
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 하나 입력하세요 : ");
		int num = sc.nextInt();
		for(int i = 1; num>=i; i++) {
			System.out.println(i);
			
		}
	}

	public void practice06() { //숫자 2개 입력받아 그 사이의 숫자출력 (못품)
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if((num1 < 1)||(num2 < 1)){//둘중 하나라도 0이 나오면 이라는 상황이기 때문에 ||(or)사용
			System.out.println("1 이상의 숫자를 입력해주세요");
			
		}else {
			
		}
		
	}
		
			
		
			
	
	public void practice07() { //숫자2개 입력받아 출력 0입력하면 다시 출력하게 
		
	}
	
	public void practice08() { //4단 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 구구단 숫자 입력\n"
				+ "단 : ");
		int num = sc.nextInt();
		for(int i = 1; i<=9; i ++) {
			System.out.println(num + " x " + i + " = "+ (num*i));
		}
		
		}
	
	public void practice09() {//=====단====출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num >= 10) {
			System.out.println("9이하의 숫자만 입력해주세요.");
			return;
		
				
			}else {
				for(int dan = num; num<=9; num++) {
					System.out.println();
					System.out.println("======" +num+"단"+"======");
				}
			}
		}
	
	public void practice010() {//====단====출력하기 틀리면 다시입력시킴
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		while(true) {
			if(num>=10) {
				System.out.print("9 이하의 숫자만 입력해주세요 : ");
				num = sc.nextInt();
				
			}else {
				for(int dan = num; num<=9; num++) {
					System.out.println();
					System.out.println("=====" + num + "단"+"=====");
				}return;
			}
		}
		
			
		}
	
	
	public void practice011() { // 등차수열
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		for(int i = 0; i<10; i++,num1+=num2) {
			System.out.print(num1+" ");
			
		}
	}

	public void practice012() { //계산기 12번
		Scanner sc = new Scanner(System.in);
		//while if 문 사용
		String oper;
		while(true) {
			System.out.println("종료하려면 exit입력");
			System.out.print("+ -  * / % 입력하시오 : ");
			oper = sc.next();
			if(oper.equals("exit")) {
				System.out.println("종료합니다.");
				return;
			}
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			int result;
			
			if(oper.equals("+")) {
				result = num1 + num2;
			}else if(oper.equals("-")) {
				result = num1 - num2;
			}else if(oper.equals("*")) {
				result = num1 * num2;
			}else if(oper.equals("/")) {
				if(num1==0 || num2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
				}
				result = num1/num2;
			}else if(oper.equals("%")) {
				if(num1 == 0 || num2 == 0) {
				System.out.println("0으로 나눌수 없습니다.");
				}
				result = num1%num2;
			}else {
				System.out.println("잘못된 연산자입니다 다시입력바람");
				continue;
			}	
			System.out.println(num1+" "+oper+" "+num2+" = " +result);
		
		
		
		
		}
		
			
		}
	
	
	public void practice013() {// 별 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i<num; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public void practice014() { //별 거꾸로출력
		
	Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i<num; num--) { // 거꾸로 출력해야 하니 입력한 num을 점점줄임 num--
			for(int j = 1; j<=num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	
	}



	public void practice1() { // 1부터 출력(수업)
		//사용자로부터 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력
		//단, 입력한 수는 1보다 크거나 같아야하고 만일 1미만의 숫자를 입력했다면
		//1이상의 숫자를 입력해주세요 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.print("한 개의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		// 입력받은 숫자가 1 미만일 경우 출력해주기
		if(num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
			return;
		}
	
		//입력받은 숫자가 1 이상이면 1부터 입력받은 숫자까지 모두 출력하기
		for(int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
		//마무리로 줄바꿈을 해주길 원한다면
		System.out.println();
	}
	

	public void practice4() {// 거꾸로 출력(수업)
		//1 미만의 숫자가 입력되면 1 이상의 숫자를 입력해주세요 출력되면서
		//사용자가 값을 입력하도록 하기
		//숫자를 입력받은 숫자부터 1까지 출력하기
		Scanner sc = new Scanner(System.in);
		
		
		
		int num; // practice4 안에서 어디에서는 num을 알수 있도록 바깥으로 호출해줌
		//do - while : 조건이 참이 아니어도 무조건 최초 1회는 실행
		do {
			System.out.print("숫자를 입력해주세요 : ");
			num = sc.nextInt();
			//1 미만의 숫자가 들어오면 !
			if(num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			//조건에 관계없이 do로인해 무조건 1회 실행되는 것이기 때문에,
				//return 이나 break를 작성해주지 않아도 될 경우가 많음
			}
		}while(num > 1);
		
		//만약에 1보다 커서 밑으로 내려온다면
		//num 부터 1까지 거꾸로 출력해주는 for문을 작성해주기
		for(int i = num; i >= 1; i--) {
			System.out.print(i+" ");
		}
	}
	

	public void practice5() {//1+2+3...더하기(수업)
		//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하기
		//정수를 하나 입력하세요 : 8
		//1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		//입력 받은 수의 총 합이 들어갈 바구니
		int result = 0;
		
		//숫자가 들어왔을 때 1부터 입력받은 숫자까지 더해서 총합 구하기
		for(int i = 1; i <= num; i++) {
			result += i;
			
			
			//더해지는 숫자 출력하기
			if(i < num) {
				System.out.print(i+" + ");
			}else {// i > num
				System.out.print(i+" = ");
			}
		}
		System.out.print(result);
	}


	public void practice7() {//숫자 2개 받아 출력(수업)
		/*
		 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자 출력하기
		 만일 1 미만의 숫자가 입력 됐다면 1 이상의 숫자를 입력해주세요 출력하기
		 	다시사용자가 값을 입력해서 출력하기
		 * */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("첫번째 숫자 : ");
			int firstNum = sc.nextInt();
			
			System.out.print("두번째 숫자 : ");
			int secondNum = sc.nextInt();
			
			//만약에 첫번째 숫자와 두 번째 숫자 모두 1보다 크거나 같을경우
			if(firstNum >= 1 && secondNum >= 1) {
				//두 수를 비교해서
				//최소값 최대값 구하기
				int 최소값 = Math.min(firstNum, secondNum);
				//Math(수학 파일에서) 가작 작은 값을 찾는 min을 활용해서
				//알아서 비교하고 작은 값을 구하게 하기
				//(    ,   ) 괄호 안에 숫자를 넣을 때 숫자는 순서는 상관 없음
				//Math에 있는 random보다 random에 있는 랜덤 기능이
				//더 많지만 둘 다 사용하는데  기능적인 면에서 큰 차이는 없음
				int 최대값 = Math.max(firstNum,secondNum);
				
						
						
					for(int i = 최소값; i<= 최대값; i++) {
						System.out.print(i + " ");
					}
				break;
			}else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		
	}

	
	/*13과 14번 이중 for문 문제*/
	public void practice13() {// 별(수업)
		//키보드로 숫자를 입력받고 별찍기를 진행한다
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		for(int 세로줄 = 1; 세로줄 <= num; 세로줄 ++) {
			//한줄씩 별을 만들어주고 싶음
			// 한 줄 - 하나 	두 줄-둘	세 줄-삼 ... num줄 = num 
			
			for(int 별 = 1; 별<=세로줄; 별++) {
				System.out.print("*");
			}
			//줄바꿈을 해줄 enter가 없으면 가로로 모두 출력
			System.out.println();
		}
	}


	public void practice14() {// 별
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int line = num; line >= 1 ; line--) {
			for(int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}


	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		//키보드로 입력 받은 수를 size 안에 넣어줌
		int size = sc.nextInt();
		// line은 세로로 된 줄의 번호를 나타냄
		for(int line = 0; line < size; line++) {
			//blank 공백을 출력하기 위한 for문
			//line 번째 줄에서는 line개의 공백을 출력하겠다
			 for (int blank = 0; blank < line; blank++) {
				 System.out.print("  ");
			 }
			 //star 별을 출력하기 위한 for문
			 //line 번째 줄에서는 size - line 개의 별을 출력
			 // 첫 번째 줄 size
			 // 두 번째 줄 size - line
			 for(int star = size; star > line; star--) {
				 System.out.print("* ");
			 }
			 System.out.println();
			 
		}
	}


}








	


	
	
	
	



	






	




