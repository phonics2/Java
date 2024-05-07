package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	
	private EmployeeController ssm = new EmployeeController();
	
	
	public EmployeeMenu() {
		
	}
	
	public void printEmployeeMenu() {
		System.out.println("========직원 정보 출력========");
		for(Employee 직원정보 : ssm.printEmployee()) {
			System.out.println(직원정보.inform());
		}
			System.out.println("==========================");
			System.out.println("직원 점수 합계 : " + ssm.sumScore());
			System.out.println("직원 점수 평균 : " + ssm.avgScore()[1]);
			
			
			
			
		}
	}


