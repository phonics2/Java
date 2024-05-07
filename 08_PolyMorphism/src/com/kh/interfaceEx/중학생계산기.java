package com.kh.interfaceEx;

//기계와 계산기를 가지고와서 재사용 겸 메서드 완성
public class 중학생계산기 implements 계산기, 기계 {
	
//기계 interface 값 가져와서 완성하기
	@Override
	public void 전원켜기() {
		System.out.println("중학생용 계산기를 킵니다");
	}
	@Override
	public void 전원끄기() {
		System.out.println("중학생용 계산기를 끕니다.");
	}

	//계산기 interface 값 가져와서 완성하기
	@Override
	public int 합(int a, int b) {
		return a + b;
	}
	
	@Override
	public int 차(int a, int b) {
		return a - b;
	}
	
	@Override
	public int 곱(int a, int b) {
		return a * b;
	}
	
	@Override
	public double 몫(int a, int b) {
		return a / b;
	}
	
	@Override
	public int 나머지(int a, int b) {
		return a % b;
	}
}
