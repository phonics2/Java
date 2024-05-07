package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {

	List<Book> list = new ArrayList<>();
	
	//생성자 : 기본
	public BookController() {
		// TODO Auto-generated constructor stub
	}
	//Book리스트안에 책추가하기 메서드 저장.
	public void insertBook(Book bk) {
		list.add(bk);
	}
	public void selectList() {
		//만약 책이없으면 등록된 도서가 없습니다.
		if(list.isEmpty()){
			System.out.println("등록된 도서가 없습니다.");
		//책이 있으면 for -each문 사용해서 저장해넣은 list배열안에것 전부 출력
		} else {
			for(Book b : list) {
				System.out.println(b.toString());
			}
		}
	}
	public void searchBook(String keyword) {
		List<Book> 검색결과 = new ArrayList<>();
		for(Book a : list) {
			//만약 저장되있는 제목과 작가이름 입력한 키워드와 같다면
			if(a.getTitle().contains(keyword)||a.getAuthor().contains(keyword)) {
				검색결과.add(a);
			}
		}
		if(검색결과.isEmpty()) {
			System.out.println("검색결과가 없습니다.");
		}else {
			for(Book b : 검색결과) {
				System.out.println(b.toString());
			}
		}
	}
	public void deleteBook(String title, String author) {
		boolean removed = false;
		for(Book b : list) {
			//만약에 내가 삭제하려는 책제목과 저자가 존재한다면
			if(b.getTitle().equals(title)&&b.getAuthor().equals(author)){
				
				//list 안에 for문을 걸친 것을 삭제해야하니
				//list.remove(b)를 넣음.
				list.remove(b);
				removed = true;
				break;
			}
			}
			if(removed) {
				System.out.println("도서 삭제가 완료되었습니다.");
			}else {
				System.out.println("해당하는 도서를 찾을 수 없습니다.");
			}
	}
	//											Book파일에 :: getTitle 을 참조하겠다는 뜻.								
	//Collections.sort 를 사용해서 Book리스트, Comparator.comparing(Book:getTitle))
	public void ascBook() {
		Collections.sort(list,Comparator.comparing(Book::getTitle));
	}
}
