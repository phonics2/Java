package com.kh.hw.person.model.vo;

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
		super(name,age,height,weight);
		this.grade = grade;
		this.major = major;
	}
	@Override
	public String toString() {
		return super.toString()+" 학년 : "+grade+"전공 : "+major;
	}
	
}
