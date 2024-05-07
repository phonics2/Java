package com.kh.practice.Employee.view;

import com.kh.practice.Employee.controller.EmployeeController;
import com.kh.practice.Employee.model.vo.Employee;

public class EmployeeMenu {
	
	private EmployeeController ssm = new EmployeeController();
	
	public void EmployeeMenu() {
		
		System.out.println("===사원정보===");
		for(Employee a : ssm.printEmployee()) {
			System.out.println(a.inform());
		}
		System.out.println("총점 : " + ssm.avgScore()[0]);
		System.out.println("평균 : " + ssm.avgScore()[1]);
		if(ssm.avgScore()[1]>=ssm.CUT_LINE) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	
	}
}
