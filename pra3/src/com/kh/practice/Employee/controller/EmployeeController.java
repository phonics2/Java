package com.kh.practice.Employee.controller;

import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeController {
	
	private Employee[] sArr = new Employee[5];
	public static final int CUT_LINE = 60;
	public EmployeeController() {
		sArr[0] = new Employee("김길동","자바",100);
		sArr[1] = new Employee("박길동","디비",50);
		sArr[2] = new Employee("이길동","화면",85);
		sArr[3] = new Employee("정길동","서버",60);
		sArr[4] = new Employee("홍길동","자바",20);
	}

	public Employee[] printEmployee() {
		return sArr;
	}
	
	
	public int sumScore() {
		int result = 0;
		for(Employee a : sArr) {
			result += a.getScore();
		}
		return result;
	}
	public double[] avgScore() {
		double[] avg = new double[2];
		avg[0] = sumScore();
		avg[1] = sumScore() / sArr.length;
		return avg;
	}


}
