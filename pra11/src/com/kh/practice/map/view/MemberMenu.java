package com.kh.practice.map.view;

import java.util.Scanner;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 비밀번호변경");
			System.out.println("4. 이름변경");
			System.out.println("5. 같은 이름 조회");
			System.out.println("9. 종료");
			System.out.print("번호입력 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				joinMembership();
				break;
			case 2:
				login();
				break;
			case 3:
				changePassword();
				break;
			case 4:
				changeName();
				break;
			case 5:
				sameName();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default :
				System.out.println("잘못된번호. 다시입력하세요.");
			}
		}
	}


	public void joinMembership() {
		System.out.println("==회원가입==");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		Member m = new Member(password,name);
		boolean result = mc.joinMembership(id,m);
		if(result) {
			System.out.println("회원가입완료.");
		}else {
			System.out.println("회원가입 실패.ㄴ");
		}
		
	}
	 	public void login() {
	 		System.out.print("아이디 : ");
	 		String id = sc.nextLine();
	 		System.out.print("비밀번호 : ");
	 		String password = sc.nextLine();
	 		String result = mc.login(id,password);
	 		if(result != null) {
	 			System.out.println("로그인성공! 환영합니다!");
	 		} else {
	 			System.out.println("아이디 비밀번호가 틀렸습니다.");
	 		}
	 	}

	 	public void changePassword() {
	 		System.out.print("==비밀번호 변경.==");
	 		System.out.print("아이디 : ");
	 		String id = sc.nextLine();
	 		System.out.print("이전 비밀번호 : ");
	 		String oldpw = sc.nextLine();
	 		System.out.print("변경할 비밀번호 : ");
	 		String newpw = sc.nextLine();
	 		
	 		boolean result = mc.changePassword(id,oldpw,newpw);
	 		if(result) {
	 			System.out.println("비밀번호 변경성공");
	 		} else {
	 			System.out.println("비밀번호 변경실패");
	 		}
	 			
	 	}


	 	public void changeName() {
	 		System.out.print("아이디 : ");
	 		String id = sc.nextLine();
	 		System.out.print("새로운 이름 : ");
	 		String password = sc.nextLine();
	 		mc.changeName(id,password);
	 		System.out.println("이름변경 성공.");
	 		
	 	}

	 	public void sameName() {
	 		System.out.print("이름 : ");
	 		String name = sc.nextLine();
	 		mc.sameName(name).forEach((k,v) -> System.out.println(k + " : " + v));
	 		
	 	}
























}
