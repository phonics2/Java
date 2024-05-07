package com.kh.practice.student.model.vo;

public class Student {
//필드
	private String name;
	private String subject;
	private int score;
	private boolean pass;
	
	public boolean isPass() {
		return pass;
	}

	public void setPass(boolean pass) {
		this.pass = pass;
	}

	//메서드
	//Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}
	//Getter
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}

	public Student() {
		
	}
	//생성자 : 필수
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	public String inform() {
		return "이름 : " + name + "과목 : " + subject + "점수 : " + score;
	}
}
