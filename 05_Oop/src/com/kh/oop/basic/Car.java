package com.kh.oop.basic;

public class Car {
	//필드
	public String color; //차의 색상
	public int speed; //차의 속도
	public String door; // 차의 문
	public String window;// 차의창문
	public String sunRoof;// 차의썬루프
	public String insurance;// 보험
	// 생성자 = 필수 옵션
	// 생성자는 클래스이름과 똑같아야 함.
	// 생성자이름 = 클래스이름 = 파일명
	
	
	//생성자 = 메서드를 담거나 초기화를 위한 생성자
	public Car() {
		
	}
	
	
	
  //public Car(글자로 받을 차 색상, 글자로 받을 차 속도) {
	public Car(String inputColor, int inputSpeed) {
		this.color = inputColor;
		this.speed = inputSpeed;
	}
	//메서드
	public void displayInfo() {
		System.out.println("    차 정보");
		System.out.println("Color : " + color);
		System.out.println("Speed : " + speed);
	}

	//메인 메서드
	public static void main(String[] args) {
		// Car가 공간을 마련해줘
		
		Car myCar = new Car();
		myCar.color = "빨간색";
		System.out.println("나의 차 색상 : " + myCar.color);
		
		//공장에서 차를 만들어야하고 색상이랑 스피드가 지정이 된 상황
		//ㅎㅎ기업에서 색상이랑 스피드는 ㅎㅎ기업에서 원하는 형태로 차 출고
		// order = (음식을) 주문
		Car orderCar = new Car("black", 60);
		
		orderCar.displayInfo();
		
		// storeCar 주문 색상 white 스피드 최대 100
		// 색상과 스피드를 출력
		Car storeCar = new Car("white",100);
		storeCar.displayInfo();
		
		
		
		
	}


}
