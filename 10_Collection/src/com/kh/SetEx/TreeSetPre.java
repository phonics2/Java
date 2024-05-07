package com.kh.SetEx;

import java.util.Set;
import java.util.TreeSet;


public class TreeSetPre {
	
	public static void main(String[] args) {
								//Set.of("","","","")
		TreeSet<String> 과일들 = new TreeSet<>(Set.of("키위","복숭아", "참외", "수박","딸기"));
		//과일들 String "키위 복숭아 참외 수박 딸기"
	/*	과일들.add("키위");
		과일들.add("복숭아");
		과일들.add("참외");
		과일들.add("수박");
		과일들.add("딸기");*/
		//복숭아 제거
		과일들.remove("복숭아");
			
		// 수박이 포함되어있는지 확인
		System.out.println("수박? : " + 과일들.contains("수박"));
		
		// 과일들이 비어있는지 확인
		System.out.println("과일Empty? : " + 과일들.isEmpty());
		
		//과일들 개수
		System.out.println("과일개수 : " + 과일들.size());
		//가장 작은 값
		System.out.println("first : " + 과일들.first());
		//가장 큰 값
		System.out.println("last : " + 과일들.last());
		//모든 값 제거
		과일들.clear();
		//모든값 제거 되었는지 확인
		System.out.println("과일Empty? : " + 과일들.isEmpty());
	}

		


}