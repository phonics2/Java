package com.kh.example.practice6.model.vo;

public class Book {
	//필드
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	
	//생성자
	//1. 기본생성자
	public Book() {
		
	}
	
	//2. 필수생성자 필수로 매개변수를 넣어줘야 하는 생성자
	
	public Book(String 제목, String 출판사, String 작가) {
		this.title = 제목;
		this.publisher = 출판사;
		this.author = 작가;
	}
	
	// 3. 필수생성자
	public Book(String 제목, String 출판사, String 작가, int 가격, double 할인율) {
		this.title = 제목;
		this.publisher = 출판사;
		this.author = 작가;
		this.price = 가격;
		this.discountRate = 할인율;
	}


	// 4. void(출력) 메서드 inform()
	public void inform() {
		System.out.println("책제목 : " + title);
		System.out.println("출판사 : " + publisher);
		System.out.println("지은이 : " + author);
		System.out.println("책가격 : " + price+"원");
		System.out.println("할인율 : " + discountRate);
		System.out.println("---------------");
	}
		
	
	
	public static void main(String[] args) {
		System.out.println("kh서점에 오신 것을 환영합니다.");
		Book book1 = new Book();
		book1.title = "햄릿";
		book1.publisher = "kh";
		book1.author = "윌리엄 셰익스피어";
		book1.inform();
		
		//book2 책정보에서 필수생성자 String 제목, String 출판사, String 작가
		Book book2 = new Book("그것이 알고싶다","SBS","박진아");
		book2.inform();
		
		//book3 모두 입력되어있는 필수생성자 이용해서 출력
		Book book3 = new Book("Do it! 자바 프로그래밍 입문","이지스퍼블리싱", "박은종", 16500,0.34);
		book3.inform();
		
		
		
	}





}
