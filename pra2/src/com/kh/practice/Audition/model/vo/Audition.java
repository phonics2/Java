package com.kh.practice.Audition.model.vo;

public class Audition {
	private String name;
	private String value;
	private int score;
	private boolean paased;

	public Audition() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public boolean isPaased() {
		return paased;
	}

	public void setPaased(boolean paased) {
		this.paased = paased;
	}

	
	
	public Audition(String name, String value, int score) {
		this.name = name;
		this.value = value;
		this.score = score;
		
	}

	public String inform() {
		return "이름 : " + name +" "+ "분야 : " + value +"   "+ "점수 : " + score;
	}
}
