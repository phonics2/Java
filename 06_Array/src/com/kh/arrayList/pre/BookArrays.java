package com.kh.arrayList.pre;

import java.util.Arrays;

public class BookArrays {

	public static void main(String[] args) {
		
		Book[] 책들 = new Book[3];
		책들[0] = new Book("아몬드", "손원평");
		책들[1] = new Book("불변의법칙", "모건 하우철");
		책들[2] = new Book("나는 읽고 쓰고 버린다", "손웅정");
		
		//책 정보 복사
		Book[] 무지개도서관 = Arrays.copyOf(책들, 책들.length);
		
		//무지개 도서관 정보 출력
		System.out.println("=== 무지개 도서관 책 정보 ===");
		for(Book 책  :무지개도서관) {
			System.out.println(책.getBookname() + ", " + 책.getAuthor());
		}
		
		//책들과 무지개 도서관 책이 같은지 비교
		boolean 비교 = Arrays.equals(책들, 무지개도서관);
		System.out.println(비교? "같음":"다름");
		
		System.out.println("================");
		//무지개도서관 주황 도서관 책을 복사해서 가지고 오는데
		Book[] 주황도서관 = (Arrays.copyOf(책들, 3));// 배열 0 1 2 복사
		
	
		//for - each문 출력
		for(Book 복사 :주황도서관) {
			System.out.println(복사.getBookname() + ", " + 복사.getAuthor());
		}
		
		
	
	}

}
