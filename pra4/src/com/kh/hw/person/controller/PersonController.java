package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Person.Employee;
import com.kh.hw.person.model.vo.Person.Student;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	//인원수입력을 배열에 넣었고,
	//인덱스를 지정해야 하기 때문에 초기값설정을 0으로 해줘야함 
	private int Studentindex = 0;
	private int Employeeindex = 0;
	
	
	public int[] personCount() {
		int[] count = new int[2];
		count[0] = Studentindex;
		count[1] = Employeeindex;
		return count;
	}
	
	
	
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		if(Studentindex < s.length) {
		
			
		//학생정보배열 s[] 배열안에 넣어야 하기때문에
			//s[Studentindex++] = s[0++] 값을 써준다.
		s[Studentindex++] =	new Student(name, age, height,weight,grade,major);
		}else {
			System.out.println("더이상 학생을 추가할 수없음.");
		}
	}
	public Student[] printStudent() {
		//Student[] 객체배열 안에있는 정보를 불러오는 것이기때문에
		// 그냥 지정한 변수명만 쓰면 됨.
		// return s;
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		if(Employeeindex < e.length) {
			e[Employeeindex++] = new Employee(name,age,height,weight,salary,dept);
		}else {
			System.out.println("더이상 직원추가 안됨.");
		}
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
