package com.kh.oop.constructor;
	//1. 회원가입

public class Join {
	//필드 회원번호  아이디  이름  연락처
	public int memberNo; // 회원가입한 순서
	public String memberId; // 회원이 작성한 아이디  ex ) nickname
	public String memberName;
	public String phonNumber;
	
	// 생성자 기본 생성자   필수 생성자
	public Join() {
		
	}
	
	public Join(int memberNo, String memberId, String memberName, String phonNumber) {
	//	 이것은 필드에 있는 memberNo 에 = 나중에 작성한 memberNo를 넣겠습니다.	
				   this.memberNo = memberNo;
				   this.memberId = memberId;
				   this.memberName = memberName;
				   this.phonNumber = phonNumber;
	}
	
	// 메서드 = 클래스 안에 존재하고, 특정 기능을 할 수 있도록 묶어놓은 코드 모음
		//void 메서드 : 결과를 전달하지 않음
	public void memberInfo() {
		System.out.println("멤버 번호 : " + memberNo);
		System.out.println("멤버 I D : " + memberId);
		System.out.println("멤버이름  : " + memberName);
		System.out.println("멤버 폰번 : " + phonNumber);
		System.out.println("----------------");
		
	} 

	
	public static void main(String[] args) {
		System.out.println("=== kh 쇼핑 회원 정보 확인 ===");
		
		// 회원1에 대한 정보 확인
		// 회원가입(=Join) 객체 생성
		Join member1 = new Join();
		
		// 필수가 없음
		member1.memberId = "직장인";
		member1.memberName = "동그라미";
		member1.phonNumber = "010-1111-2222";
		member1.memberInfo();
		
				
		
		// 필수가 없음2
		Join member2 = new Join();
		member2.memberId = "학생휴먼";
		member2.memberName = "홍길동";
		member2.memberInfo();
		
		
		//회원가입할 때 필수로 작성해야하는 필수 작성이 생김
		//회원번호 아이디 이름 핸드폰번호
		Join member3 = new Join(3,"파워보이","박영희","010-1111-2222");
		member3.memberInfo();
		
		
		
		//member4   member5 회원가입 시킴
		//member4 기본 생성자 가지고 회원가입 시키기
		// 멤버번호 멤버 이름  memberInfo() member4
		Join member4 = new Join();
		member4.memberNo = 123;
		member4.memberName = "김";
		member4.memberInfo();
		
		
		
		//member5 필수 생성자 가지고 회원가입 시키기
		//member5 info()
		//5 "슈퍼맨" "딘 케인" "010-1938-1932"
		Join member5 = new Join(5,"슈퍼맨","딘 케인","010-1938-1932");
		member5.memberInfo();
		
				
		

	}

}
