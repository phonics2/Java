package com.kh.hw.member.model.vo;

public class Member {
//필드
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
//메서드
	//Setter
	

	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//Getter
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public char getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	//생성자 : 기본
	public Member() {
		
	}
	//생성자 : 필수
	public Member(String id, String name, String password, String email, char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	//return 입력한 정보를 출력하게하는 메소드 
	public String inform() {
		return "아이디 : " + id + "이름 : " + name + "비밀번호 : " + password
				+"이메일 : " + email + "성별 : " + gender+ "나이 : " + age;
	}


}
