package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> list = new ArrayList<>();
	
	//생성자
	public BookController() {

	}
	
	//책 추가하기
	
	public void insertBook(Book bk) {
		list.add(bk);
	}
	
	//책 전체보기
	public void selectList() {
		//만약에 책이 없다면 등록된 도서가 없습니다.
		//책이 있다면 책 목록을 보여줌
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
		} else {
			for(Book b : list) {
				System.out.println(b);
			}
		}
	}


	//책 검색하기
	public void searchBook(String search) {
		
		//결과값을 임의의 ArrayList에 대입
		List<Book> 검색결과 = new ArrayList<>();
		
		for(Book b : list) {
			if(b.getTitle().contains(search)) {
				검색결과.add(b);
			}
		}
		if(검색결과.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Book bb : 검색결과) {
				System.out.println(bb);
			}
		}
	
	}

	//책 삭제하기
	public void deleteBook(String title, String author) {
		//true false 를 통해 삭제가 됐는지 안 됐는지 확인할 수 있도록 함
		boolean removed = false; //boolean 은 false값이 기본값
		
		//for - each문 써서 전체목록 배열 출력
		for(Book bbb : list) {
			
			// 책 제목 가져오기. 비교하기(내가 삭제하려고하는 책제목) 책 저자 가져오기.(내가 삭제하려고하는 책저자)
			if((bbb.getTitle().equals(title)) && (bbb.getAuthor().equals(author))) {
				list.remove(bbb);
				//삭제가 됐으면 true
				removed = true;
				break;
			}
		}
			//배열출력하는 for - each문 나와서 if문 써서 결과 출력 시키기
			if(removed) {
				System.out.println("도서 삭제가 완료되었습니다.");
			} else {
				System.out.println("해당하는 도서를 찾을 수 없습니다.");
		}
	}
	
	
	
	public void ascBook() {
		//for while short 오름차순 정렬을 해주면 됨
			//sort 목록을 오름차순으로 정렬하기
								//정렬하는 기준		책에서 책제목
									// :: = Book 파일의 getTitle 참조해서 사용하겠다.
										 //comparing 비교하다
		Collections.sort(list, Comparator.comparing(Book::getTitle));
	}

	
}
