package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {

	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		CharacterController cc = new CharacterController();
		System.out.print("입력 : ");
		String input = sc.nextLine();
		try {
		//return 값을 받아오기 위해 int 로 변수지정
			//countAlpha 안에 예외처리 메서드도 있기때문에
			//return 값인 count++ 만 int 변수안에 넣어서 가져옴
			int count = cc.countAlpha(input);
			
			System.out.println(" ' " + input + " '  에 포함된 영문자 개수 : "+count);
		
		} catch (CharCheckException e) {
			//Exception 에 정보를 알려줌 빨간글씨로.
			e.printStackTrace();
			
		} finally {
			sc.close();
		}
		
	}
}
