package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	
	public LeapView() {
		LeapController lc = new LeapController();
		
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		boolean isLeap = lc.isLeapYear(currentYear);
		System.out.println(currentYear+"년은 "+(isLeap ? "윤년" : "평년") + "입니다.");
		
		
		long totalDays = lc.leapDate(Calendar.getInstance());
		System.out.println("1년 1월 1일부터 오늘까지" + totalDays + "일이 지났습니다.");
	}
}
