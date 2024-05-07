package com.kh.oop.method;
/*
Setter
	객체의 속성 값을 설정하는 메서드
	객체 외부에서 속성 값을 변경할 수 있음

Getter
	객체의 속성 값을 반환하는 메서드
	객체 외부에서 속성 값을 읽을 수 있음
	
	단축키 Alt  Shift  s 해준 후 Generate Getters and Setters 설정해주면 됨 
	변수명에 오른쪽 마우스를 누른 후 sourse Generate Getters and Setters 설정해주면 됨
*/
public class GetterSetter {
	//필드
	private String name;
	private int age;
	

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
