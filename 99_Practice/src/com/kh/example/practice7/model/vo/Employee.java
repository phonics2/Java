package com.kh.example.practice7.model.vo;

public class Employee {

	//필드
	public int empNo;
	public String empName;
	public String dept;
	public String job;
	public int age;
	public char gender;
	public int salary;
	public double bonusPoint;
	public String phone;
	public String address;

	//생성자 ( )
	public Employee() {
		
	}
	
	//생성자(필수 생성자1)
	public Employee(int 사원번호, String 사원이름) {
		this.empNo = 사원번호;
		this.empName = 사원이름;
	}
	
	//생성자(필수 생성자2)
	public Employee(int 사원번호, String 사원이름, String 부서, 
			String 직급, int 나이, char 성별, int 월급, 
			double 상여금, String 폰번호, String 주소 ) {
		this.empNo = 사원번호;
		this.empName = 사원이름;
		this.dept = 부서;
		this.job = 직급;
		this.age = 나이;
		this.gender = 성별;
		this.salary = 월급;
		this.bonusPoint = 상여금;
		this.phone = 폰번호;
		this.address = 주소;
	}
	
	
	
	


}


