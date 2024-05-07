package com.kh.imageEx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ImagePre2 {
	
	public static void main(String[] args) {
		//바탕화면에 이미지폴더 / 동물이름.txt 파일 만들어준 후
		String 폴더경로 = System.getProperty("user.home") + "/Desktop";
		
								//폴더명을 작성할 때마다 / 가 존재하는지 확인
		File 이미지폴더 = new File(폴더경로+"/이미지폴더");
		if(이미지폴더.exists()) {
			System.out.println("이미폴더가 존재합니다.");
		}else {
			이미지폴더.mkdir();//이미지폴더 1개 생성
			System.out.println("폴더 생성완료.");
		}
		
		
		
		//동물이름.txt 파일 생성 후 동물이름 작성
		
													//, true 이어서 작성하기
		try {
			FileWriter 글쓰기 = new FileWriter(이미지폴더+"/동물이름.txt");
		
			글쓰기.write("소\n고양이\n돼지\n토끼\n호랑이");
			System.out.println("동물이름 파일에 이름이 작성되었습니다.");
			
			글쓰기.close(); //작업하고 난 후에 항상 작업하던 파일을 닫아줄 것
		
			//좋아하는 동물이름으로 폴더 이름 변경한 다음
			//동물이름.txt -> 좋아하는동물이름.txt 파일명 변경하기
			//FileWriter는 글쓰는건 편리하지만 파일의 이름을 비교하거나 다른작업은 하기 어려움
			File 원본파일  = new File(이미지폴더+"/동물이름.txt");
			File 새로운이름  = new File(이미지폴더+"/좋아하는동물이름.txt");
			
			if(원본파일.renameTo(새로운이름)) {
				System.out.println("파일 이름이 성공적으로 변경되었습니다.");
			
			}else {
				System.out.println("파일이름 변경실패.");
			}
			
			//삭제하기
			//폴더 삭제 파일 삭제
			//폴더 삭제를 할 때 폴더 안에 파일이 존재한다면 폴더 삭제가 되지 않음
			
			//폴더 안에 파일이 존재하는지 확인하고 폴더안에 파일이 하나도 존재하지 않는다면 삭제
			//배열을 이용해서 파일목록을 받고 파일목록이 없다면 삭제
			
			File[] 파일목록 = 이미지폴더.listFiles();
			System.out.println("폴더안에 파일 목록 보기 : " + 파일목록);
			
			//for-each
			for(File f : 파일목록  ) {
				System.out.println(f.getName());
				
			}
			
			원본파일.delete();
			새로운이름.delete();
			if(이미지폴더.delete()) {
				System.out.println("폴더가 성공적으로 삭제되었습니다.");
			} else {
				//만약에 폴더가 열려있거나 사용중이면 삭제가 안됨
				//폴더 안에 파일이 숨겨져 있을 경우
				//삭제 권한 문제
				System.out.println("폴더 삭제에 실패했습니다.");
			}
		
		} catch (IOException e) {
			System.out.println("동물 이름 작성하는데 문제가 발생했습니다.");
			e.printStackTrace();
		
		}

		
		
		


	}
}
