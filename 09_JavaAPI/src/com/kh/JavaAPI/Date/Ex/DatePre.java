package com.kh.JavaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜만들기
		
		//1. yyyy-MM-dd
		SimpleDateFormat 날짜1 = new SimpleDateFormat("yyyy-MM-dd");
				    Date date = new Date();
				    String 글자로데이터변경1 = 날짜1.format(date);
		System.out.println("현재 날짜는 : " + 글자로데이터변경1);
		
		//2.HH:mm:ss
		SimpleDateFormat 날짜2 = new SimpleDateFormat("HH:mm:ss");
		String 글자로데이터변경2 = 날짜2.format(date);
		System.out.println("현재 시간 : " + 글자로데이터변경2);
		
		
		//3. yyyy-MM-dd HH:mm:ss
		SimpleDateFormat 날짜3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 글자로데이터변경3 = 날짜3.format(date);
		System.out.println("현재 날짜와 시간 : " + 글자로데이터변경3);
	
	
		//4. SimpleDateFormat 날짜4 = E 를 사용해서 요일 출력하기
		SimpleDateFormat 날짜4 = new SimpleDateFormat("E");
		String 글자로데이터변경4 = 날짜4.format(date);
		System.out.println("현재요일 : " +글자로데이터변경4);
	
	}
}
