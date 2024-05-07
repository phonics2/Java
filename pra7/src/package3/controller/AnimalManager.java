package package3.controller;

import java.util.Random;

import practice3.model.vo.Animal.Animal;
import practice3.model.vo.Animal.Cat;
import practice3.model.vo.Animal.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		//Animal 객체 생성
		Animal[] ani = new Animal[5];
		//무작위로
		Random rd = new Random();
		
		for(int i = 0; i< ani.length; i++) {
			if(rd.nextBoolean()) {
				ani[i] = new Dog("멍멍이","골든리트리버",rd.nextInt(30)+1);
			}else {
				ani[i] = new Cat("고양이","블루래종","우리집","흰색");
			}
		}
		
	
		for(Animal a : ani) {
			a.speak();
		}
	}
}
