package com.kh.QuequeEx;

import java.util.LinkedList;
import java.util.Queue;

public class QuequePre {
	//main 
	public static void main(String[] args) {

		
		Queue<Integer> a = new LinkedList<>();
		//80 60 30 20
		a.offer(80);
		a.offer(60);
		a.offer(30);
		a.offer(20);
		
		//poll 데이터 확인 및 제거
		int 제거 = a.poll();
		System.out.println(제거);
		
		//peek 맨 앞 데이터 확인
		int 맨앞 = a.peek();
		System.out.println(맨앞);
		
		//isEmpty 비어있는지 확인
		boolean isEmpty = a.isEmpty();
		System.out.println("비어있나요? : " +(isEmpty? "비어있음.":"비어있지않음."));
		
	}
	

}
