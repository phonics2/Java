package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	//- Student[] sArr = new Student[5]
	//+ CUT_LINE : int = 60
	private Student[] sArr = new Student[5];
	public static final int CUT_LINE = 60;
	
	
	//+ StudentController()
	public StudentController() {
				  // new Student 는 Student 에 있는 필수 생성자를 사용하는 것임.
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화바",85);
		sArr[3] = new Student("정길동","서바",60);
		sArr[4] = new Student("헝길동","자바",20);
	}
	
	//+ printStudent() : Student[]
	public Student[] printStudent() {
		return sArr;
	}

	// + sumScore() : int
	public int sumScore() {
		int result = 0;
		for(Student s : sArr) {
			result += s.getScore();
			
		}
		return result;
	}
	
	// + avgScore() : double[]
	public double[] avgScore() {
		//임의로 배열2개 만들기
		double[] avg = new double[2];
		//점수의 합을 넣은 avg[0]
		avg[0] = sumScore();
		
		avg[1] = avg[0] / sArr.length;
		return avg;
	}
	//합격 여부 확인하기
	public void 합격여부 () {
		// for - each
		// String 으로 했다면 String 으로 지정한 값만 가지고 오는것.
		// Student 이름과 과목과 점수를 모두~~~ 가지고 오겠다는 의미
		for(Student g : sArr) {
			g.setPass(g.getScore() >= CUT_LINE);
			System.out.println(g.getName()+ " 학생은 " + (g.isPass()? "통과" : "재시험 대상") +"입니다");
		}
	}
}	