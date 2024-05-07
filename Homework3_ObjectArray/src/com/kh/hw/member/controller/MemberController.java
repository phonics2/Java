package com.kh.hw.member.controller;



import com.kh.hw.member.model.vo.Member;

public class MemberController extends Member{
	//상수 지정할때 public static final
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	public int MemberCount = 0;
	
	
	public int existMemberNum() {
		return MemberCount;
	}
	
	public boolean checkId(String inputId) {
		for(int i = 0; i < m.length; i++) {
			if(m[i].getId().equals(inputId)) {
				return true;
			}
		}
			return false;
	}
	



}
