package com.kh.SocketEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//채팅 시작 주최자
//port 2자리 3자리 4자리 컴퓨터에서 약속으로 지정한 숫자
public class ServerPre {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12370);
			System.out.println("서버open");
			
			//방문자 승인
			Socket clientSocket = server.accept();
			System.out.println("b 가 방문함.");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
			
			
			String message;
			while((message = in.readLine()) != null) {
				//cmd 창에 나오는 문구
				System.out.println("send : " + message);
				out.println("cc hh ee cc kk");
			}
			clientSocket.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
