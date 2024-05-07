package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	List<Music> list = new ArrayList<>();

	public int addList(String title, String singer) {

		// 필수 생성자에 값을 넣었으면? 1 아니면 0
		return list.add(new Music(title, singer)) ? 1 : 0;
	}

	public int addAtZero(String title, String singer) {
		// add( 인덱스자리 필수생성자(title,singer)안에 추가하기
		list.add(0, new Music(title, singer));
		// 숫자 1 리턴하기
		return 1;
	}

	// 전체 출력시키기 list 리턴하고 메뉴에서 for-each문 활용해서 출력시키기.
	public List<Music> printAll() {
		return list;
	}

	public Music searchMusic(String title) {
		for (Music music : list) {
			// contains가 아니라 equals를 사용해서 완전히 똑같은지 확인
			// 제목과 비교를 하기위해서 getTitle.equals(title)이렇게 조건을 걸어줌
			if (music.getTitle().equals(title)) {
				return music;
			}
		}
		// 없으면 null 리턴
		return null;
	}

	public Music removeMusic(String title) {
		for (int i = 0; i < list.size(); i++) {
			// 해당 인덱스에 저장된 제목과 , 입력한 제목이 같다면 삭제.
			if (list.get(i).getTitle().equals(title)) {
				// 삭제하고 해당 리스트 리턴.
				return list.remove(i);
			}
		}
		// 없으면 null 리턴
		return null;
	}

	public Music setMusic(String title, String singer) {
		for (Music music : list) {
			// music 안에 제목과 내가 입력한 제목과 같다면?
			if (music.getTitle().equals(title)) {
				// music 수정할 가수이름을 setSinger안에 넣어주고
				music.setSinger(singer);
				// music 리턴
				return music;
			}
		}
		// 없으면 null 리턴
		return null;
	}

	// 제목 오름차순 정렬
	public int ascTitle() {
		Collections.sort(list);
		return 1;
	}

	//가수이름 내림차순 정렬(람다식)
	public int descSinger() {
		list.sort((o1, o2) -> o2.getSinger().compareTo(o1.getSinger()));
		return 1;
	}

}
