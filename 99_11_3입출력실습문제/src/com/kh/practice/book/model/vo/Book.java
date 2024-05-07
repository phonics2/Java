package com.kh.practice.book.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book {
//필드
	private String title;
	private String author;
	private int price;
	private double discount;
	private Calendar date = Calendar.getInstance();
	
	
	
//메서드
	//Setter
	public String getAuthor() {
		return author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	//Getter
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	public double getDiscount() {
		return discount;
	}
	public Calendar getDate() {
		return date;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//생성자 : 필수
	public Book(String title, String author, int price, double discount, Calendar date) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.discount = discount;
		this.date = date;
	}
	
	
	@Override
	public String toString() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy년- MM월 -dd일");
		return "제목 : " + title +" 작가 : " + author+"가격 : " + price
				+"할인율 : " + discount + "출판날짜 : " +date;
	}
	
}
