package com.kh.practice.score.view;

import java.io.DataInputStream;
import java.util.Scanner;

import com.kh.practice.score.controller.ScoreController;

public class ScoreMenu {
	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() throws Exception {
		while(true) {
		System.out.println("1. 성적 저장");
		System.out.println("2. 성적 출력");
		System.out.println("9. 프로그램종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			saveScore();
			break;
		case 2:
			readScore();
			break;
		case 9:
			System.out.println("프로그램 종료.");
			System.exit(0);
		default :
			System.out.println("다시 입력하세요.");
			
		}
		
		}
	}
	public void saveScore() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		sc.nextLine();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		sc.nextLine();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		sc.nextLine();
		
		//점수 총점
		int sum = kor+eng+math;
		
		//점수 평균
		double avg = (int)sum / 3.0;
		
		//컨트롤러에 매개변수로 넘겨줌
		scr.saveScore(name, kor, eng, math, sum, avg);
	}
	public void readScore() throws Exception {
		DataInputStream dis = scr.readScore();
		while(dis.available() > 0) {
			String name = dis.readUTF();
			int kor = dis.readInt();
			int eng = dis.readInt();
			int math = dis.readInt();
			int sum = dis.readInt();
			double avg = dis.readDouble();
			System.out.printf("이름 : %s, 국어 : %d, 영어 : %d, "
					+ "수학 : %d, 합계 : %d, 평균 : %.2f\n",
					name,kor,eng,math,sum,avg);
		}
	}
	
}
