package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {
	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("**** My note ****");
		System.out.println("1. 노트 만들기");
		System.out.println("2. 노트 열기");
		System.out.println("3. 노트 수정하기");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 입력 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			fileSave();
			break;
		case 2:
			fileOpen();
			break;
		case 3:
			fileEdit();
			break;
		case 9:
			System.out.println("프로그램 종료.");
			
			//return 은 while문 나가기.
			//System.exit(0)은 프로그램 종료.
			System.exit(0);
		default :
			System.out.println("다시 입력하세요.");
		}
	}
}
	public void fileSave() {
		System.out.print("파일명 입력 : ");
		String fileName = sc.nextLine();
		
		//만약에 입력한 파일이 존재한다면??
		if(fc.checkName(fileName)) {
			System.out.println("파일이 이미 존재합니다.");
		//아니라면 파일 내용 저장하기
		} else {
			System.out.print("작성할 내용 입력 : ");
			String content = sc.nextLine();
			
			fc.fileSave(fileName, new StringBuilder(content));
		}
	}
	public void fileOpen() {
		System.out.print("열 파일명 : ");
		String fileName = sc.nextLine();
		if(fc.checkName(fileName)) {
			StringBuilder fileContent = fc.fileOpen(fileName);
			System.out.println("파일내용 : "+fileContent);
		} else {
			System.out.println("없는 파일입니다.");
		}
	}
	public void fileEdit() {
		System.out.print("수정할 파일명 : ");
		String fileName = sc.nextLine();
		StringBuilder fileContent = fc.fileOpen(fileName);
			
		//파일이 없다면 파일이 존재하지 않습니다.
		if(fc.checkName(fileName)) {
			System.out.println("현재 파일 내용 : "+fileContent);
			System.out.print("새로운 내용 입력 : ");
			String newContent = sc.nextLine();
			fc.fileEdit(fileName, new StringBuilder(newContent));
		} 
		
	}
	
}
