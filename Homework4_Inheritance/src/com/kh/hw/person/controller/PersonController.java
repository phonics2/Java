package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	//학생자리 3자리
	private Student[] students = new Student[3];
	private Employee[] employee = new Employee[10];
	
	private int studentIndex = 0;
	private int employeeIndex = 0;
	
	//사람 수 세기
	public int[] personCount() {
		int[] counts = new int[2];
		//counts[0] = 학생수 자리
		//counts[1] = 직장인 수 자리
		counts[0] = studentIndex;
		counts[1] = employeeIndex;
		return counts;
		
	}
	
	//학생의 정보를 입력하면 정보 저장하기
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		//학생수 추가하기
		//배열로 쳤을 때 index 값이 length 보다 초과되면 넣지 못하게 합시다
		if(studentIndex < students.length) {
		students[studentIndex++] = new Student(name,age, height, weight, grade, major);
		} else {
			System.out.println("더이상 학생을 추가할 수 없습니다.");
		}
	}

	//학생 목록보기
	public Student[] printStudent() {
		return students;
	}

	//직원 정보 입력하면 정보 저장하기
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		//직원 수 추가하기
		//배열로 쳤을 때 index 값이 length 보다 초과되면 넣지 못하게 합시다
		//employee[]가 employee[]최대길이보다 작으면 
		if(employeeIndex < employee.length) {
			
			//employee[] ++ 증감연산자를 넣어서
			employee[employeeIndex++] = new Employee(name, age, height, weight, salary, dept);
		} else {
			System.out.println("더이상 직원정보를 추가할 수 없습니다.");
		}
	}

	public Employee[] printEmployee() {
		return employee;
	}


	
	
}
