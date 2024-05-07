package com.kh.practice.numRange.exception;

//Exception 을 상속(extends)받아서 예외상황을 일부러 만듦.
public class NumRangeException extends Exception {
	public NumRangeException() {
		// TODO Auto-generated constructor stub
	}

	//매개변수로 받은 값을 부모 생성자로 넘김
	//super -> super 로 msg(매개변수) 를 넘김.
	public NumRangeException(String msg) {
		super(msg);
	}
}
