package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {//2
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	
	// Book을 실행하자 보이는 메인메뉴 만들기
	public void mainMenu() {
		while(true) {
			System.out.println("=== 도서관리 프로그램===");
			System.out.println("1. 도서추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default :
				System.out.println("잘못된 선택입니다. 다시 선택해주세요");
				
				
			}
		
		
		}
		
	}
	//도서 추가
	public void insertBook() {
		System.out.print("책제목 : ");
		String title = sc.nextLine();
		
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		
		System.out.print("카테고리 : ");
		String category = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		//책 정보 저장하는 Book 객체 소환  매개변수 생성자를 이용하여 Book객체 생성
		Book book = new Book(title, author, category, price);
		
		bc.insertBook(book);
		
		System.out.println("도서 추가가 완료 되었습니다.");
		
	}

	
	public void selectList() {
		bc.selectList();
	}
	
	//도서 검색
	public void searchBook() {
		System.out.print("검색할 책이름 : ");
		String 도서명 = sc.nextLine();
		bc.searchBook(도서명);
		}
		
	//도서 삭제
	public void deleteBook() {
		System.out.print("삭제할 책이름 : ");
		String title = sc.nextLine();
		System.out.print("삭제할 저자명 : ");
		String author = sc.nextLine();
		
		//BookController 도서 삭제하는 기능 추가
		bc.deleteBook(title, author);
	}
	
	//도서목록을 오름차순으로 정렬하기
	//ascending 오름차순
	public void ascBook() {
		
		// BookController  도서 오름차순으로 정렬하는 기능 추가
		bc.ascBook();
	}

}
	


