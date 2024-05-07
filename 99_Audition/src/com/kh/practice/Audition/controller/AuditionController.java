package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {
	
	private Audition[] sArr = new Audition[5];
	public static final int CUT_LINE = 60;// final 상수 int 
	
	public AuditionController() {
		sArr[0] = new Audition("김영희","발라드",100);
		sArr[1] = new Audition("박영희","힙합",50);
		sArr[2] = new Audition("이연이","뮤지컬",85);
		sArr[3] = new Audition("정영히","댄스",60);
		sArr[4] = new Audition("홍영희","팝",20);
		
	}
	public Audition[] printAudition() {
		return sArr; // 위에서 작성한 데이터 출력을 위해 리턴. return;
	}
	
	public int sumScore() {
		int sum = 0;// 전체 총합 구하기전 sum 초기화시키기
		for(Audition 점수 : sArr) {
			sum += 점수.getScore();
			
		}
		return sum;
	}


	public double[] avgScore() {
		double[] avgArr = new double[2];// double 배열 2개 생성
		avgArr[0] = sumScore(); // 인덱스[0] 배열에 총합 구한 메서드 저장
		avgArr[1] = avgArr[0] / sArr.length; //인덱스[1] 에 평균을 구한 값 저장
		
		return avgArr; // 총합과 평균이 들어있는 배열 2개를 return; 함.
	}


	public void printPass() {
		for(Audition pass : sArr) {//생성자에 넣은 배열들 가져오기
			
			//setPassed 초기값은 false
						  //점수만을 가져옴
						  //pase.getScore 가 CUT_LINE값인 60 이상이면
			//true로 변경
			pass.setPassed(pass.getScore() >= CUT_LINE);
			System.out.println(pass.getName()+" 학생은" + (pass.isPassed()? "합격" : "불합격")+ "입니다");
		}
	}


}
