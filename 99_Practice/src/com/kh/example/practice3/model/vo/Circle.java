package com.kh.example.practice3.model.vo;

public class Circle {

	private double PI = 3.14;
	private int radius = 1;
	
	public Circle() {
		
	}

	public void setPI(double pI) {
		PI = pI;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double getPI() {
		return PI;
	}

	public int getRadius() {
		return radius;
	}
	
	public void incrementRadius() {//반지름 1증가
		radius++;
	}
	
	public void getAreaOfCircle() { // 원의 넓이
		double area = PI*(radius*radius);
		System.out.println("원의 넓이 : " +area);
	}

	public void getSizeOfCircle() { //원의 둘레
		double size = 2*PI*radius;
		System.out.println("원의 둘레 : " + size);
	}

}
