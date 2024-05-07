package com.kh.practice.charCheck.exception;
//Exception 에서는 Exception 을 상속받아서 만들어야 하기 때문에
//extends Exception 을 써야함.
public class CharCheckException extends Exception{
	public CharCheckException() {
		// TODO Auto-generated constructor stub
	}
	
	public CharCheckException(String msg) {
		super(msg);
	}
}
