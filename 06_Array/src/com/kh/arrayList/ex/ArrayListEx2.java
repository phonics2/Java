package com.kh.arrayList.ex;

import java.util.ArrayList;

public class ArrayListEx2 {

	//기본 생성자
	public ArrayListEx2() {
		
	}
	
	public void method1() {
		// 딸기 바나나 사과
		ArrayList<String> list = new ArrayList<>();
		
		//add 를 사용해서 딸기 바나나 사과 추가
		list.add("딸기");
		list.add("바나나");
		list.add("사과");
		
		//get 0 1 2 사용해서 각 index 자리에 값 출력하기
		System.out.println("list.get(0) : " + list.get(0));
		System.out.println("list.get(1) : " + list.get(1));
		System.out.println("list.get(2) : " + list.get(2));
		
		// 바나나 -> 키위 수정
		list.set(1, "키위");
		
		//size 를 이용해서 크기 확인
		//size() 숫자를 넣지 않음.
		System.out.println("바구니 크기 : " + list.size());
		
		//remove 키위 삭제
		list.remove(1);
		
		//isEmpty() 비어있는지 확인
		System.out.println("장바구니 비어있나요? : " + list.isEmpty());
	
		//장바구니 뭐뭐 들어가있는지 확인!
		
		
		
		//앞으로 사용할 for 문
		for(String 과일 : list ) {
			System.out.println(과일);
		}
	}
	
	public void method2() {
		ArrayList<String> animal = new ArrayList<>();
		
		//add 사자 호랑이 고양이 강아지
		animal.add("사자");
		animal.add("호랑이");
		animal.add("고양이");
		animal.add("강아지");
		
		//size() 동물이 몇마리 있는지 확인
		System.out.println(animal.size()+"마리 있음.");
	
		//get 으로 동물 확인
		System.out.println("동물 0 : " + animal.get(0));
		System.out.println("동물 1 : " + animal.get(1));
		System.out.println("동물 2 : " + animal.get(2));
		System.out.println("동물 3 : " + animal.get(3));
		System.out.println("--------------");
	
		//set 고양이 -> 토끼로 변경
		animal.set(2, "토끼");
	
		//remove 강아지 삭제
		animal.remove("강아지");
	
		//for문을 확용해서 get 출력
		for(String 동물 : animal) {
			System.out.println("동물 :" + 동물);
		}
		System.out.println("--------------");
	
		//clear 사용해서 모두삭제
		animal.clear();
	
		//isEmpty() 모두 삭제가 됐는지 확인
		System.out.println("비어있나요? : " + animal.isEmpty());
		
}

	
	public void method3() {
		//피자 가게
		ArrayList<String> pizza = new ArrayList<>();
		//pizza 고구마피자 포테이토피자 페페로니
		System.out.println("=== 피자메뉴 ===");
		// add 고구마 포테이토 페페로니
		pizza.add("고구마");
		pizza.add("포테이토");
		pizza.add("페페로니");
		
		// 모두 보기
		System.out.println("모든 메뉴 보기 : " + pizza);
		
		//get 을 활용해서 출력
		System.out.println(pizza.get(0)+"피자");
		System.out.println(pizza.get(1)+"피자");
		System.out.println(pizza.get(2)+"피자");
		
		
		System.out.println("-------------");
		
		
		//set 활용해서 페페로니 -> 파인애플
		pizza.set(2, "파인애플");
		
		//remove 파인애플 삭제
		pizza.remove("파인애플");
		
		
		//for 문 활용해서 출력
		for(String 메뉴 : pizza) {
			System.out.println(메뉴+"피자");
		}
		
		System.out.println("-------------");
		
		System.out.println("피자가게가 사라질 예정입니다.");
		//메뉴 모두 삭제 clear()
		pizza.clear();
		
		System.out.println("-------------");
		
		// 메뉴 모두 삭제됐는지 확인 isEmpty()
		System.out.println("가게가 사라졌나요? : " + pizza.isEmpty());
	}
	//main 최종으로 실행하고 출력하는 메서드
	public static void main(String[] args) {
		ArrayListEx2 ae = new ArrayListEx2();
		//ae.method1();
		//ae.method2();
		ae.method3();
		
		
	}

}
