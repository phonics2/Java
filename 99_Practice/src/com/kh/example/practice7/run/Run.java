package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run { // 출력메서드 없이 출력하기

	public static void main(String[] args) {

		//아무것도 안들어있는 생성자로 출력
		Employee 정보1 = new Employee();
		정보1.empNo = 1;
		정보1.empName = "감재식";
		정보1.gender = '남';
		System.out.println("=== 직원1 ===");
		System.out.println("사원번호 : " + 정보1.empNo);
		System.out.println("사원이름 : " + 정보1.empName);
		System.out.println("사원성별 : " + 정보1.gender);
		
		
		
		System.out.println(); //줄바꿈
		
		// 직원 2 필수로 번호 이름 필수 넣자
		// 객체 생성한 후 필수생성자로 작성하기
		
		//사원번호와 이름 ,2개만 넣은 생성자로 출력
		Employee 정보2 = new Employee(2,"동그라미");//2개는 넣어놨기때문에 괄호안에 넣어서 출력
		System.out.println("=== 직원2 ===");
		System.out.println("사원번호 :" + 정보2.empNo);
		System.out.println("사원이름 : " + 정보2.empName);
		    
		
		System.out.println();
		
		
		//생성자 안에 필드가 다 들어있는 생성자로 출력
		Employee 정보3 = new Employee(100,"홍길동","영업부", // 생성자안에 필드가 다 들어 있으니,
				"과장",25,'남',2500000,0.05,				 // 괄호안에 값을 넣어 출력
				"010-1234-5678","서울시 강남구");
		System.out.println("=== 직원3 ===");
		System.out.println("사원번호 : " + 정보3.empNo);
		System.out.println("사원이름 : " + 정보3.empName);
		System.out.println("사원부서 : " + 정보3.dept);
		System.out.println("직급 : " + 정보3.job);
		System.out.println("성별 : " + 정보3.gender);
		System.out.println("연봉 : " + 정보3.salary);
		System.out.println("상여금 : " + 정보3.bonusPoint);
		System.out.println("P.H : " + 정보3.phone);
		System.out.println("주소 : " + 정보3.address);
	
		
		
		
		
		
	}

}
