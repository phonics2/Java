package com.kh.abstractEx;

public class 사각형 extends 도형{

//필드
	
	private double 밑변;
	private double 높이;
	
//생성자
	//필수 : 
	public 사각형(String 색깔, double 밑변, double 높이) {
		super(색깔);
		this.밑변 = 밑변;
		this.높이 = 높이;
	}
	
	
	@Override
	public double 도형넓이() {
		return 0.5*밑변*높이;
	}


	@Override
	public double 도형둘레() {
		double 빗변 = Math.sqrt(Math.pow(밑변, 2) + Math.pow(높이, 2));
		
		return 밑변 + 높이 +빗변;
	}

}
