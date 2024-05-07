package com.kh.practice.chap02_abstractNInterface.model.vo;

public class GalaxyNote9 extends SmartPhone {
	
	public GalaxyNote9() {
		
	}
	@Override
	public String makeCall() {
		return"번호를 누르고 통화버튼을 누름";
	}
	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}
	@Override
	public String picture() {
		return "1200만 듀얼 카메라";
	}
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	@Override
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	@Override
	public boolean bluetoothPen() {
		return true;
	}
	@Override
	public String printInformation() {
		return "전화 : " + makeCall()+"\n 전화 받기 : " + takeCall()+"\n촬영 : "+picture()
				+"\n 충전 : " + charge()+"\n 터치 : " + touch()+"\n 블루투스 : " + bluetoothPen();
	}























}
