package com.kh.arrayList.pre;

public class Book {
//필드
	//책이름
	private String bookName;
	//저자
	private String author;
	
	

//메서드
	
	//Setter
	public void setBookname(String bookname) {
		this.bookName = bookname;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	//Getter
	
	public String getBookname() {
		return bookName;
	}
	public String getAuthor() {
		return author;
	}
	//생성자 : 기본
	public Book() {
		
	}
	//생정자 : 필수
	public Book(String bookname, String author) {
		this.bookName = bookname;
		this.author = author;
	}


	public void showBook() {
		System.out.println(bookName + ", " + author);
	}


}
