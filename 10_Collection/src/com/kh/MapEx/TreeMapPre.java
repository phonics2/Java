package com.kh.MapEx;

import java.util.*;

public class TreeMapPre {
	
	public static void main(String[] args) {
		/*
		 String, String 으로
		 "apple","사과"
		 "banana", "바나나"
		"orange", "오렌지"
		"grape", "포도"
		 "watermelon", "수박"
		 
		 [] for 문을 활용해서 추가
		 
		 전체출력
		 	get 사용해서 banana에 해당하는 값 가져오기
		 	size 확인
		 	isEmpty 비어있는지 확인
		 	containsKey grape키가 존재하는지 확인
		 	containsValue 값 포도 가 존재하는지 확인
		 	keySet() 모든 키 출력
		 	values() 모든 값 출력
		 	first첫번째 키와 
		 	last 마지막키 출력
		 	clear
		 */
	
		TreeMap<String,String> tmp = new TreeMap<>();
		String[] keys = {"apple","banana","orange","grape","watermelon"};
		String[] values = {"사과","바나나","오렌지","포도","수박"};
		
		for(int i = 0; i < keys.length; i++) {
			tmp.put(keys[i], values[i]);
			
		}
		System.out.println(tmp);
	
		System.out.println("banana : "+tmp.get("banana"));
		
		System.out.println("크기 : "+tmp.size());
		
		System.out.println("isEmpty? : "+tmp.isEmpty());
		
		System.out.println("Key grape? : "+tmp.containsKey("grape"));
		
		System.out.println("Value 포도? : "+tmp.containsValue("포도"));
		
		System.out.println("모든 key : "+tmp.keySet());
		
		System.out.println("모든 value : " + tmp.values());
		
		System.out.println("firstKey : " + tmp.firstKey());
		
		System.out.println("lastKey : " + tmp.lastKey());
		tmp.clear();
		System.out.println("clear : "+tmp);
	} 
}
