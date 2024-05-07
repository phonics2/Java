package com.kh.practice.chap02_abstractNInterface.model.vo;

public abstract class SmartPhone implements Phone, Camera, CellPhone, TouchDisplay, NotePen{
	private String maker;

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public SmartPhone() {
		
	}

	public abstract String printInformation();
		
	
}
