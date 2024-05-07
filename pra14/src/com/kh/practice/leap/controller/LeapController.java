package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	
	public boolean isLeapYear(int year) {
		return (year % 4 ==0 && year %100 != 0 )|| (year % 400 ==0)? true : false;
	}


	public long leapDate(Calendar c) {
		int year = c.get(Calendar.YEAR);
		//0월 부터 가져오기 때문에 +1 해줘야함
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		long totalDays = 0;
		
		for(int i = 1; i < year; i++) {
			//위에 메서드 조건에 대입시키기
			if(isLeapYear(i)) {
				totalDays += 366;
			} else {
				totalDays += 365;
			}
		}
	
		for(int i = 1; i < month; i++) {
			if(i == 2) {
				totalDays += isLeapYear(year) ? 29 : 28;
			} else if(i == 4 || i == 6 || i == 9 || i == 11) {
				totalDays += 30;
			} else {
				totalDays += 31;
			}
		}
		totalDays += day;
		return totalDays;
	}


}
