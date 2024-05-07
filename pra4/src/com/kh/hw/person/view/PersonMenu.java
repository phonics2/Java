package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Person.Employee;
import com.kh.hw.person.model.vo.Person.Student;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		while(true) {
		System.out.println("메뉴입력");
		System.out.println("1. 학생메뉴");
		System.out.println("2. 사원메뉴");
		System.out.println("9. 종료하기");
		System.out.print("번호입력 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch(choice) {
		case 1:
			studentMenu();
			break;
		case 2:
			employeeMenu();
			break;
		case 9:
			System.out.println("프로그램종료.");
			return;
		default:
			System.out.println("번호를 다시입력하세요");
		}
		
		
		}
		
	}

	public void studentMenu() {
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 이전 메뉴");
			System.out.print("번호 입력: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				insertStudent();
				break;
			case 2: 
				printStudent();
				break;
			case 9:
				System.out.println("이전으로.");
				return;
			default :
				System.out.println("번호를 다시 입력하세요");
			}
		}
	}
	public void employeeMenu() {
		while(true) {
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("9. 이전 메뉴");
			System.out.print("번호 입력: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				insertEmployee();
				break;
			case 2: 
				printEmployee();
				break;
			case 9:
				System.out.println("이전으로.");
				return;
			default :
				System.out.println("번호를 다시 입력하세요");
			}
		}
	}
	public void insertStudent() {
		System.out.print("학생이름 : ");
		String name = sc.nextLine();
		System.out.print("학생나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("학생키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("학생 몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("전공 : ");
		String major = sc.nextLine();
		
		//입력한 값 컨트롤러로 넘기기
		pc.insertStudent(name,age,height,weight,grade,major);
		System.out.println("학생정보 추가 완료.");
		
	}

	public void insertEmployee() {
		System.out.print("사원이름 : ");
		String name = sc.nextLine();
		System.out.print("사원나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("사원 키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("사원 몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("월급 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		
		//입력한 값 컨트롤러로 넘기기
		pc.insertEmployee(name,age,height,weight,salary,dept);
		System.out.println("직원정보 추가 완료.");
	}
	
	public void printEmployee() {
		Employee[] 사원정보 = pc.printEmployee();
		System.out.println("==사원정보==");
		for(Employee a : 사원정보) {
			if(a != null) {
				System.out.println(a);
			}else {
				System.out.println("사원정보 없음.");
			}
		
		}
		
	}

	public void printStudent() {
		System.out.println("==학생정보==");
		Student[] 학생정보 = pc.printStudent();
		for(Student a : 학생정보) {
			if(a != null) {
				System.out.println(a);
			}else {
				System.out.println("학생정보 없음.");
			}
		}
	}
}
