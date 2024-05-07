package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	public CharacterController() {
		
	}

	public int countAlpha(String s) throws CharCheckException{
		//아무것도 안쳤을 때. 예외발생
		if(s == null || s.isEmpty()) {
			throw new CharCheckException("입력된 문자열이 비어있습니다.");
		}
		//입력할때 띄어쓰기를 했을 때 예외발생
		if(s.contains(" ")) {
			throw new CharCheckException("입력된 문자열에 공백이 포함되어있습니다.");
		}
		if(s.matches("^[가-힣]*$")) {
			throw new CharCheckException("입력된 문자열에 한글이 있습니다1.");
		}
		if(s.matches("^[ㄱ-ㅎ]*$")) {
			throw new CharCheckException("입력된 문자열에 자음이 있습니다2.");
		}
		
		
		//입력한 단어 갯수 새기
		int count = 0;
		
		
		for(int i = 0; i <s.length(); i++) {
			//for문 안에서 char 로 더해지면서 값 계속 가져오기 
			//입력한 단어 최대길이만큼 
			//i++이니까 char 로 하나씩 쪼개서 가져오는 것.
			char c = s.charAt(i);
			//쪼갠 c안에 글자가 a~z 까지   A~Z 까지이면
			if((c >='a' && c<= 'z') ||(c >='A' && c <= 'Z')){
				//count ++ 을해서 단어만 더해서 글자수를 재기위한 조건문.
				count++;
			}
		}
		//단어 갯수를 다더한후 count 를 리턴해줌
		//count 는 int 임.
		return count;
		
	
	}

}
