package com.kh.oop.basic;

public class Student {
	//필드
	//학생인데 학생의 이름과 나이와 학년
	public String name;
	public int age;
	public int grade;
	
	
	//생성자 메서드 (필수가 아닌 생성자 (빈공간)
	public Student() {
		
	}
	
	//필수로 넣어야하는것 이름 나이 학년 (필수로 작성해야하는 생성자 메서드 만들기)
	public Student(String name, int age, int grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	//출력 메서드 정보 출력 메서드
	public void info() {
		System.out.println("이름 : "+name+"\n나이 : "+age+"\n학년 : "+grade);
	}
	
	//최종 메인 메서드
	public static void main (String[] args) {
		//학생 객체 생성하기 =  김철수 18살 3 박영희 20 2 
		 Student student1 = new Student("김철수", 18, 3);
		 Student student2 = new Student("박영희", 20, 2);
		
		 
		 
		//학생1 정보2 출력하기
		 student1.info();
		 student2.info();
		 
	}
	
	
	
}
