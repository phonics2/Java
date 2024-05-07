package com.kh.oop.method.oop;

public class DrinkRun {

	public static void main(String[] args) {
		//음료 제조 객체 생성
		DrinkMaker dm = new DrinkMaker("허브티",1,5);
		DrinkStore ds = new DrinkStore(dm,"경기","멕아커피",false);
		ds.orderDrink();
		System.out.println("-------------------");
		
		DrinkMaker dm2 = new DrinkMaker("아메리카노",3,1 );
		DrinkStore ds2 = new DrinkStore(dm2,"서울 서초구","빠나쁘레쏘", true);
		ds2.orderDrink();
		
		
		
		
	}

}
