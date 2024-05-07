package com.kh.hw.person.model.vo.Person;

public class Student extends Person{
	private int grade;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Student(String name, int age, double height, double weight,int grade, String major) {
		//부모클래스 받을때는 extends 꼭 쓰기
		super(name,age,height,weight);
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	//부모 클래스에서 받아올때 나머지값은
	//Get 으로 +해줌
	public String toString() {
		return "[이름="+getName()+", 나이="+getAge()+", 키="+getHeight()
		+", 몸무게=" +getWeight()+", 학년="+grade+ ", 전공="+major;
		
		
		
	}
}
