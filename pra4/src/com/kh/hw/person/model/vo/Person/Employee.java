package com.kh.hw.person.model.vo.Person;

public class Employee extends Person {
	private int salary;
	private String dept;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
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
	public Employee(String name, int age, double height, double weight,int salary, String dept) {
		super(name,age,height,weight);
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
			return "직원 [이름=" + getName() + ", 나이=" +  getAge() 
			+ ", 키=" + getHeight() + ", 몸무게=" + getWeight()
			+ ", 연봉" + salary +", 부서=" + dept + "]";
		
	}
	
	
}
