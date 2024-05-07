package com.kh.practice.file.controller;

import com.kh.practice.file.dao.FileDAO;

public class FileController {
	private FileDAO fd = new FileDAO();
	
	//이름이 존재하는지 확인하는 코드 작성
	public boolean checkName(String file) {
		//FileDAO checkName() 로 매개변수 넘겨주고
		//그 값을 return 으로 받아 다시 반환함.
		return fd.checkName(file);
	}
	public void fileSave(String file, StringBuilder sb) {
		//매개변수 String  file 과 StringBuilder sb를 DAO로 넘기는데
		// 스트링빌더 sb는 String으로 넘긴다고했으니 .toString으로 넘겨줌.
		//void 이기 때문에 return 으로 반환을 할 필요 없음.
		fd.fileSave(file, sb.toString());
	}
	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}
	public void fileEdit(String file, StringBuilder sb) {
		//매개변수 String  file 과 StringBuilder sb를 DAO로 넘기는데
		// 스트링빌더 sb는 String으로 넘긴다고했으니 .toString으로 넘겨줌.
		//void 이기 때문에 return 으로 반환을 할 필요 없음.
		fd.fileEdit(file, sb.toString());
	}
}
