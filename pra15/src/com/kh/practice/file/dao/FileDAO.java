package com.kh.practice.file.dao;

import java.util.*;

public class FileDAO {
	private Map<String,String> files = new HashMap<>();
	
	//파일 이름이 존재하는지 containsKey 로 확인
	public boolean checkName(String file) {
		return files.containsKey(file);  
	}
	
	//파일 저장 유무 확인 put
	public void fileSave(String file, String s) {
		//put 으로 키에는 file,  밸류에는 s 를 넣음.
		files.put(file, s);
		System.out.println("파일 저장 완료 : "+file);
	}
	public StringBuilder fileOpen(String file) {
		//만약에 파일이 존재한다면 열기!
		if(files.containsKey(file)) {
			System.out.println("파일 열기 완료 : "+file);
			//파일을 열기위해 StringBuilder 를 리턴함.
			return new StringBuilder(files.get(file));
			
			
		} else {
			System.out.println("파일이 존재하지 않습니다.");
			//전달할 내용이 없으니 그대로 StringBuilder 를 리턴함.
			return new StringBuilder(); 
		}
			
		
	}
	public void fileEdit(String file, String s) {
		if(files.containsKey(file)) {
			//Map의 키는 중복값 이 덮어씌워지기 때문에 
			//put 으로 값을 넣어도 상관없다.
			files.put(file, s);
			System.out.println("파일 편집 완료." + file);
		} 
	}
	
}
