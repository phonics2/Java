package com.kh.practice.Audition.controller;

import com.kh.practice.Audition.model.vo.Audition;

public class AuditionController {
	private Audition[] sArr = new Audition[5];
	public static final int CUT_LINE = 60;
	
	public AuditionController() {
		sArr[0] = new Audition("김영희","발라드",100);
		sArr[1] = new Audition("박영희","힙합",50);
		sArr[2] = new Audition("이영희","뮤지컬",85);
		sArr[3] = new Audition("정영희","댄스",60);
		sArr[4] = new Audition("홍영희","팝",20);
		
	}

	public Audition[] printAudition() {
		return sArr;
	}
	
	public int sumScore() {
		int result = 0;
		for(Audition a : sArr) {
			result += a.getScore();
			
		}
		return result;
	}
	public double[] avgScore() {
		double[] avg = new double[2];
		avg[0] = sumScore();
		avg[1] = sumScore() / sArr.length;
		
		return avg;
	}
	
	public void printpass() {
		for(Audition a : sArr) {
			a.setPaased(a.getScore()>=CUT_LINE);
			System.out.println(a.getName()+"님은 " +(a.isPaased()? "합격" : "재시험대상자") +"입니다.");
		}
	}
	
}	
