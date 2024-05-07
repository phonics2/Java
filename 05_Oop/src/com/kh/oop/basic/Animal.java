package com.kh.oop.basic;

public class Animal {//동물
	
	//1. 필드 이름 나이
	public String name;
	public int age;
	
	//2. 초기 생성자
	public Animal() {
		
	}
	//3. 필수 생성자 String name, int age
	public Animal(String 이름, int 나이) {
		this.name = 이름;
		this.age = 나이;
	}
	
	//4. 출력메서드 public void info() { System.out.println 이름과 나이 출력}
	public void info() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	//5. 메인메서드 public static void main(String[] args){
	public static void main(String[] args) {
		Animal dog = new Animal();
//		1) 초기생성자
			// Animal dog = new Animal();
			// 강아지의 이름 나이
			// 강아지 정보 출력
		dog.name = "멍멍이";
		dog.age = 2;
		dog.info();
	
	
	//  2) 필수생성자
		//Animal cat = new Animal("고양이",3)
		//고양이 정보 출력
		Animal cat = new Animal("고양이",3);
		cat.info(); 

	}




}


