package practice3.controller;

import java.util.Random;

import practice3.model.vo.Animal;
import practice3.model.vo.Horse;
import practice3.model.vo.Rabbit;

//true 면 토끼
//false 면 말
public class AnimalWorld {
	public static void main(String[] args) {
		//5개짜리 Animal 타입의 객체 배열 생성
		Animal[] animals = new Animal[5];
		//무작위
		Random ran = new Random();
		for(int i = 0;  i < animals.length; i++) {
			//
			if(ran.nextBoolean()) {
				animals[i] = new Rabbit("토깽이"+ i ,"토끼",ran.nextInt(20)+1,"흰색");
			}else {
				animals[i] = new Horse("발굽이"+ i ,"얼룩말",ran.nextInt(420)+1,"갈색");
			}
		}
	

		for(Animal a : animals) {
			a.speak();
		
		}
	}

}