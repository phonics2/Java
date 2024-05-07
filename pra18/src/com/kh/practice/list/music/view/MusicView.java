package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("== 메인메뉴 ==");
		System.out.println("1. 곡 추가");
		System.out.println("2. 첫위치 에 곡 추가");
		System.out.println("3  전체 출력");
		System.out.println("4. 검색하기");
		System.out.println("5. 삭제하기");
		System.out.println("6. 특정곡 정보수정");
		System.out.println("7. 오름차순");
		System.out.println("8. 내림차순");
		System.out.println("9. 시스템종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			addList();
			break;
		case 2:
			addAtZero();
			break;
		case 3:
			printAll();
			break;
		case 4:
			searchMusic();
			break;
		case 5:
			removeMusic();
			break;
		case 6:
			setMusic();
			break;
		case 7:
			ascTitle();
			break;
		case 8:
			descSinger();
			break;
		case 9:
			System.out.println("시스템을 종료합니다.");
			return;
		default :
			System.out.println("잘못입력. 다시입력하세요.");
		}
		}
	}
	public void addList() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		if(mc.addList(title, singer) == 1) {
			System.out.println("추가성공");
			
		} else {
			System.out.println("추가실패");
			return;
		}
	}
	public void addAtZero() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		System.out.print("가수명 : ");
		String singer = sc.nextLine();
		if(mc.addAtZero(title,singer) == 1) {
			System.out.println("추가성공");
		} else {
			System.out.println("추가실패");
		}
		
	}
	public void printAll() {
		System.out.println(mc.printAll());
	}
	public void searchMusic() {
		System.out.print("곡명 : ");
		String title = sc.nextLine();
		Music music = mc.searchMusic(title);
		if(music != null) {
			System.out.println("결과 : "+music);
		} else {
			System.out.println("검색결과가 없습니다.");
		}
		
		
		
	}
	public void removeMusic() {
		System.out.print("삭제할 곡 : ");
		String title = sc.nextLine();
	
		Music music = mc.removeMusic(title);
		if(music != null) {
			System.out.println("삭제성공!!!");
		} else {
			System.out.println("삭제할 곡이 없습니다.");
		}
		
	}
	public void setMusic() {
		System.out.print("수정할 곡 : ");
		String title = sc.nextLine();
		System.out.print("새로운 가수명 : ");
		String singer = sc.nextLine();
		Music music = mc.setMusic(title, singer);
		if(music != null) {
			System.out.println("수정완료.");
		} else {
			System.out.println("수정할 곡이 없습니다.");
		}
		
	}
	public void ascTitle() {
		if(mc.ascTitle() == 1) {
			System.out.println("정렬성공");
		} else {
			System.out.println("정렬실패");
		}
	}
	public void descSinger() {
		if(mc.descSinger() == 1) {
			System.out.println("정렬성공");
		}else {
			System.out.println("정렬실패");
		}
	}

	
}
