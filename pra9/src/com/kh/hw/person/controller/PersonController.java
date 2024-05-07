package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	private int 학생인덱스 = 0;
	private int 직원인덱스 = 0;

	
	public int[] personCount() {
		int[] count = new int[2];
		count[0] = 학생인덱스;
		count[1] = 직원인덱스;
		return count;
	}


	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		if(학생인덱스 <s.length) {
			s[학생인덱스++] = new Student(name, age,height,weight,grade,major);
		} else {
			System.out.println("학생 더이상 추기할 수 없습니다.");
		}
	}


	public Student[] printStudent() {
		return s;
	}

	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		if(직원인덱스 < e.length) {
			e[직원인덱스++] = new Employee(name,age,height,weight,salary,dept);
		}else {
			System.out.println("직원 더이상 추가할 수 없습니다.");
		}
	}

	public Employee[] printEmployee() {
		return e;
	}
	
}
