package com.kh.SetEx;

import java.util.HashSet;

public class SetPre {
	
	public static void main(String[] args) {
		//중복값은 덮어쓰기됨
		HashSet<String> set = new HashSet<>();
		set.add("새우깡");
		set.add("고래밥");
		set.add("꽃게랑");
		set.add("꽃게랑");
		set.add("꽃게랑");
		set.add("꽃게랑");
		set.add("맛동산");
		set.add("오징어땅콩");
		set.add("알새우칩");
		
		System.out.println(set);
		
		//크기 확인
		System.out.println("사이즈 : " + set.size());
		
		//검색하기
		System.out.println("맛동산이 있나요? : "+set.contains("맛동산"));
		
		set.remove("고래밥");
		
		System.out.println(set);
		
		System.out.println("비었나요? : " + set.isEmpty());
		
	}

	
}
