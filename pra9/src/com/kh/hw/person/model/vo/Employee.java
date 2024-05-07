package com.kh.hw.person.model.vo;

public class Employee extends Person{
	private int salary;
	private String dept;
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int age, double height, double weight,int salary, String dept) {
		super(name,age,height,weight);
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return super.toString()+" 월급 : "+salary+" 부서 : "+dept;
	}
	
}
