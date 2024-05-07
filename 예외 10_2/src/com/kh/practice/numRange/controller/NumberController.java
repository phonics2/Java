package com.kh.practice.numRange.controller;

import com.kh.practice.numRange.exception.NumRangeException;

public class NumberController {
	public NumberController() {
		// TODO Auto-generated constructor stub
	}
	
	//받은 숫자 예외상황 만들
	public boolean checkDouble(int num1 , int num2) throws NumRangeException{
		boolean result = false;
		
		if(num1 >= 100 || num2 >= 100) {
			throw new NumRangeException("1부터 100사이의 값이 아닙니다.");
		}
		if(num1 % num2 == 0) {
			result = true;
			return result;
		} else{
			result = false;
			return result;
		} 
		
	}
}
