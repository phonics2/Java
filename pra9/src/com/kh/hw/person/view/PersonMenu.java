package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("==메인메뉴");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("번호 입력 : ");
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
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시입력.");
			}
		}
		
	}

	public void studentMenu() {
		while(true) {
		System.out.println("1. 학생추가");
		System.out.println("2. 학생보기");
		System.out.println("9. 이전메뉴");
		System.out.print("번호입력 : ");
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
		default:
			System.out.println("다시입력하세요.");
		}
		
		}	
	}
	
	public void employeeMenu() {
		while(true) {
			System.out.println("1. 사원추가");
			System.out.println("2. 사원보기");
			System.out.println("9. 이전으로");
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
			default:
				System.out.println("다시입력하세요.");
			}
		}
	}

	public void insertStudent() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		sc.nextLine();
		System.out.print("전공 : ");
		String major = sc.nextLine();
		
		pc.insertStudent(name,age,height,weight,grade,major);
		
		System.out.println("학생 추가완료.");
	}
	public void printStudent() {
		Student[] students = pc.printStudent();
		for(Student st : students) {
			if(st != null) {
				System.out.println(st);
			} else {
				System.out.println("정보가 없습니다.");
			}
		}
	}
	public void insertEmployee() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("월급 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		
		pc.insertEmployee(name,age,height,weight,salary,dept);
		
		System.out.println("정보입력 완료.");
		
		
	}
	public void printEmployee() {
		Employee[] employees = pc.printEmployee();
		for(Employee em : employees) {
			if(em != null) {
				System.out.println(em);
			} else {
				System.out.println("정보가 없습니다.");
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
