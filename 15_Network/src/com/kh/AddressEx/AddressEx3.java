package com.kh.AddressEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class AddressEx3 {
	public static void main(String[] args) {
		try {
			InetAddress 주소이름 = InetAddress.getByName("www.google.com");
			System.out.println("getByName 으로 구글을 가져온 이름 : "+ 주소이름);
			
			//getLocalHost 를 이용해서 내 집주소를 가져오고 집주소에 대한 상세 정보확인
			// 내 집주소에 대한 영어주소이름 내 컴퓨터 숫자 주소
			InetAddress 내집주소 = InetAddress.getLocalHost();
			System.out.println("내 IP 주소 : " + 내집주소);
			
			// 멀티캐스트 주소 여부 확인
			
			// 한 컴퓨터에서 2개 이상의 컴퓨터에 동시로 파일 전송하는 방법
			
			
			
			// byte[] 주소를 활용한 객체 가져오기
			// 루프백 주소 현재 컴퓨터 자체를 가리키고 외부 연결을 하지 않고 내 컴퓨터 사용
			byte[] ipAddress = {127,0,0,1};
			InetAddress byAddress = InetAddress.getByAddress(ipAddress);
			System.out.println(byAddress);
			System.out.println(내집주소);
			
			//getByName 영어주소와 숫자주소를 한 번에 가져옴
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}
}
