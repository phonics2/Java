package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public void StudentMenu() {
		//배열에 있는 학생정보를 나열할 것이니 for-each 문사용
		System.out.println("==결과==");
		
		for(Student s : ssm.printStudent()) {
			System.out.println(s.inform());
		}
	
		System.out.println("총점 : " + ssm.avgScore()[0]);
		System.out.println("평균 : " + ssm.avgScore()[1]);
		ssm.합격여부();
	}

	
}
