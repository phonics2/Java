package com.kh.hw.person.model.vo;

public class Person {
//필드
	private String name;
	private int age;
	private double height;
	private double weight;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "이름 : "+name+" 나이 : "+age+"키 : "+height+"몸무게 : "+weight;
	}
}
