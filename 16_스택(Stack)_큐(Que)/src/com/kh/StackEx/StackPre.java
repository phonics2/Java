package com.kh.StackEx;

import java.util.Stack;

public class StackPre {
	//main 메서드에서 작성
	public static void main(String[] args) {
		Stack<Integer> a = new Stack<>();
		//Stack 을 활용해서 10 30 50 40 20 넣고 push 사용
		a.push(10);
		a.push(30);
		a.push(50);
		a.push(40);
		a.push(20);
		// 맨위 값을 지우고 반환해서 확인
		int 맨위1 = a.pop();
		System.out.println("맨위 : " + 맨위1);
		// 현재 맨 위 값 확인
		int 맨위2 = a.peek();
		System.out.println("맨위2 : " + 맨위2);
		// 비어있는지 확인
		boolean Empty = a.isEmpty();
		System.out.println("비어있나요? : " + Empty);
		// 크기는 몇인지 확인
		int 사이즈 = a.size();
		System.out.println("사이즈 : " + 사이즈);
	}

}
