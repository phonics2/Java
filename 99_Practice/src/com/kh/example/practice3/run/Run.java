package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("원의 넓이와 둘레");
		circle.getAreaOfCircle();
		circle.getSizeOfCircle();
		
		
		System.out.println("반지름 1 증가후 넓이와 둘레");
		circle.incrementRadius();
		circle.getAreaOfCircle();
		circle.getSizeOfCircle();
		
		
		
		
	}

}
