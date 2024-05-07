package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	// 사용자한테 숫자를 입력받고
	Scanner sc = new Scanner(System.in);
	//사람컨트롤러 가져오기
	PersonController pc = new PersonController();

	public void mainMenu() { // 11
		while (true) {
			System.out.println("=== 메인메뉴 ===");
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴선택 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 남아있는 enter 버퍼 없애기

			// 번호를 선택할 수 있는 switch 소환
			switch (choice) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;

			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}
	}

	// 학생을 추가하거나 조회할 것
	public void studentMenu() { // 22
		while (true) {
			System.out.println("=== 학생 메뉴 ===");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 출력");
			System.out.println("0. 이전 메뉴로");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine(); // 버퍼 날리기

			switch (choice) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
				
			case 0:
				System.out.println("이전 메뉴로 이동합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}
	}

	
	public void employeeMenu() {
		while(true) {
			System.out.println("=== 사원메뉴 ===");
			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 보기");
			System.out.println("0. 이전 메뉴");
			System.out.print("메뉴 선택 : ");
			int choice = sc.nextInt();
			sc.nextLine();
		
		
			switch(choice) {
			case 1:
				//아래에 만들어놓은 메서드만 적어도됨
				insertEmployee();
				break;
			case 2:
				//아래에 만들어놓은 메서드만 적어도됨
				printEmployee();
				break;
			case 0:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			default :
				System.out.println("번호를 다시 입력하세요");
		}
	
	}
}
	
	
	
	public void insertStudent() { // 33 학생 정보 입력시키기 스캐너 
		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("신장 : ");
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

		//2번째로 학생추가 넣기
		pc.insertStudent(name, age, height, weight, grade, major);
		
		System.out.println("학생이 추가되었습니다.");

	
	}
	
	//학생이 얼마나 존재하는지 출력하기
	public void printStudent() { // 44 학생 정보 출력하기
		//학생정보가 들어있는 Student[] 모양의 배열 가져오기
		Student[] students = pc.printStudent();
		System.out.println("=== 학생목록 ===");
		
		
		//for - each
		for(Student st : students) {
			//만약에 안에가 비어있지 않다면 학생들을 보여줄 것
			if(st != null) {
				System.out.println(st);
			} else {
				System.out.println("보여줄 학생 정보가 없습니다.");
			}
		}
	}

	//직원 정보 입력시키고 저장하기
	public void insertEmployee() {// 직원 정보 입력시키기 스캐너
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		System.out.print("사원 나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("사원 키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		System.out.print("사원 몸무게 : ");
		double weight = sc.nextDouble();
		sc.nextLine();
		System.out.print("사원 급여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.print("사원 부서 : ");
		String dept = sc.nextLine();
		
		//입력한 사원값을 한곳에 모아서 저장하기
		pc.insertEmployee(name, age, height, weight, salary, dept);
		
		System.out.println("직원 정보가 추가되었습니다.");
	}
	
	//직원 정보 출력하기
	public void printEmployee() { // 직원 정보 출력하기
		// 직원 정보를 배열에 넣었으니 배열객체를 불러야함
		Employee[] employees = pc.printEmployee(); 
		System.out.println("=== 직원목록 ===");
		
		//객체를 쭉 나열시켜야 하기때문에
		//for - each문 사용
		for(Employee em : employees) {
			
			//정보를 저장한 배열에 값이 null 이 아니면,
			if(em != null) {
				System.out.println(em);
			} else {
				System.out.println("사원 정보가 없습니다.");
			}
		}
		
	}
}
