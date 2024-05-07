package com.kh.practice.chap02_abstractNInterface.model.vo;

public class V40 extends SmartPhone{
	public V40() {
		// TODO Auto-generated constructor stub
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
		return "1200만 ,1600만 듀얼 카메라";
	}
	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}
	@Override
	public String touch() {
		return "정전식";
	}
	@Override
	public boolean bluetoothPen() {
		return false;
	}
	@Override
	public String printInformation() {
		return "전화 : " + makeCall()+"\n 전화 받기 : " + takeCall()+"\n촬영 : "+picture()
				+"\n 충전 : " + charge()+"\n 터치 : " + touch()+"\n 블루투스 : " + bluetoothPen();
	}
	
}
