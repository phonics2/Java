package com.kh.practice.list.music.model.vo;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return "곡 명 : " + title + "가수 : " + singer+"  ";
	}
	
	
	@Override
	public int compareTo(Music o) {
		
		return this.title.compareTo(o.title);
	}
	
}
