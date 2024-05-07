package com.kh.practice.Audition.view;

import com.kh.practice.Audition.controller.AuditionController;
import com.kh.practice.Audition.model.vo.Audition;

public class AuditionMenu {
	private AuditionController ac = new AuditionController();
	
	public void AuditionMenu() {
		System.out.println("=== 정보 ===");
		for(Audition a : ac.printAudition()) {
			System.out.println(a.inform());
		}
		System.out.println("총점 : " + ac.avgScore()[0]);
		System.out.println("평균 : " + ac.avgScore()[1]);
		
		ac.printpass();
		
	
	}
}
