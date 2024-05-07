package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	public TokenController() {
		// TODO Auto-generated constructor stub
	}
	
	
	//공백 구분해서 출력시키기
	public String afterToken(String str) {
		String[] tokens = str.split(" ");
		StringBuilder result = new StringBuilder();
		for(String 토큰 : tokens) {
			result.append(토큰).append("-");
		}
		
		return result.toString().trim();
	}
	
	//첫글자 대문자로 변경시켜서 출력시키기
	public String firstCap(String input) {
		// 				앞에글자     . 대문자로 변경.  + 글자 모두 보기  1~~~끝까지
		return input.substring(0,1).toUpperCase() + input.substring(1);
	}
	
	//문자열 안에 몇개가 들어가있는지 출력시키기
	public int findChar(String input, char one) {
		//시작 카운트는 0으로 지정해줌
		int count = 0;
		for(char c : input.toCharArray()) {
			if(c == one) {
				count++;
			}
		}
		return count;
	}
	public String Cap(String input) {
		return input.substring(0).toUpperCase();
	}
	
	public StringTokenizer trim(String input) {
		StringTokenizer 토큰 = new StringTokenizer(input);
		
		while(토큰.hasMoreTokens()) {
			System.out.print(토큰.nextToken());
			
		}
		return 토큰;
	}

}
