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

	public int sumScore() {//점수 총합 구하기
		int sum = 0; // 점수 총합  sum  0으로 초기화
		for(Employee sumr : sArr) {
			sum += sumr.getScore();
		}
		return sum;
	}



	public double[] avgScore() { //점수 평균 구하기
		double[] avgArr = new double[2];// 배열2개 임의로 만들기
		avgArr[0] = sumScore(); //[0]번째 배열에 점수총합 넣기
		avgArr[1] = avgArr[0] / sArr.length; // avgArr[0]안에 점수총합이 있으니 Employee 최대길이는 5이니 / length로 나눔
		return avgArr;
	}
}

