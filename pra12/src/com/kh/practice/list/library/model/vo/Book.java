package com.kh.practice.list.library.model.vo;

public class Book {
//필드
	private String title;
	private String author;
	private String category;
	private int price;

	//생성자 : 기본
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자 : 필수
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}


	//Getter
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}


	//Setter
	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	
	//@Override toString 
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", price=" + price;
				
	}


}
