package com.kh.imageEx;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;


import javax.imageio.ImageIO;

public class ImageResizePre {
	
	public static void main(String[] args) {
		
		 
		
		
		
		//원본 이미지 pigs.jpg		pigs_cute.jpg	
		String 원본이미지 = "src/com/kh/imageEx/pigs.jpg";
		String 사이즈변경이미지 = "src/com/kh/imageEx/pigs_cute3.jpg";
		
		//가로 = 400		세로 = 200
		int 가로 = 400;
		int 세로 = 200;
		
		//원본 이미지데이터를 버퍼 이미지로 읽어들임
		try {
			
			BufferedImage 원본 = ImageIO.read(new File(원본이미지));
			
			//새로운 크기의 이미지생성
			BufferedImage 이미지버퍼 = new BufferedImage(가로,세로,BufferedImage.TYPE_INT_BGR);
		
			//이미지크기조정 후 이미지 그리기시작!
			Image 이미지그리기 = 원본.getScaledInstance(가로, 세로,Image.SCALE_SMOOTH);
										 //			  x y 효과추가여부
			이미지버퍼.createGraphics().drawImage(이미지그리기,0,0,null);
			
			//새로만든 이미지 파일로 저장하기
			ImageIO.write(이미지버퍼,"jpg",new File(사이즈변경이미지));
			
			System.out.println("이미지크기조정이 완료되었습니다.");
		} catch (Exception e) {
			System.out.println("크기조정중 문제가 발생했습니다.");
			e.printStackTrace();
		}
	}
}
