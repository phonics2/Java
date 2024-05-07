package com.kh.practice.list.library.view;

import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	
	
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	
	
	
	public void mainMenu() {
		while(true) {
		System.out.println("1. 새도서 추가");
		System.out.println("2. 도서 전체조회");
		System.out.println("3. 도서 검색조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서명 오름차순정렬");
		System.out.println("9. 시스템종료");
		System.out.print("메뉴 입력 : ");
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
		default:
			System.out.println("다시입력하세요.");
		}
		}
	}
	//책 추가하기는  사용자가 입력하고 추가하는 거라 for문 이런거 쓸 필요없음.
	//입력한대로 컨트롤러로 보내기만 하면 됨.
	public void insertBook() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("책장르 : ");
		String category = sc.nextLine();
		System.out.print("책 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		
		//매개변수 생성자(필수생성자로)객체로 입력한값 넣기
		Book book = new Book(title,author,category,price);
		
		//컨트롤러로 보내주기
		bc.insertBook(book);
		System.out.println("도서추가 완료.");
		

		
		
	}
	public void selectList() {
		//도서목록 전체조회기 때문에 그냥 바로 컨트롤러로 보내줌
		//검색하는것 없이 그냥 전체 출력만 하는 메뉴이기 때문.
		//컨트롤러에서 만들어 놓았음.
		bc.selectList();
	}
	public void searchBook() {
		//컨트롤러에서 만들어 놓았기 때문에
		//도서명입력 시키고 입력된 값을
		//컨트롤러에 보내줌.
		
		System.out.print("도서명 : ");
		String keyword = sc.nextLine();
		bc.searchBook(keyword);
	}
	public void deleteBook() {
		System.out.print("삭제할 책제목 : ");
		String title = sc.nextLine();
		System.out.print("작가이름 : ");
		String author = sc.nextLine();
		bc.deleteBook(title, author);
		
	}
	public void ascBook() {
		bc.ascBook();
	}
}
