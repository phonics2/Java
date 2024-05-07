package com.kh.oop.method.ex;

public class IceCreamRun {

	public static void main(String[] args) {

		//IceCreamRun -> 메인 메서드
		
		IceCream icecream = new IceCream();
		icecream.setName("월드콘");
		icecream.setSugar(50);
		icecream.setMilk(false);
		icecream.makeIceCream();
		System.out.println("-------");
			
		IceCream icecream2 = new IceCream("바닐라",1,true);
		icecream2.makeIceCream();
		
		
	}

}
