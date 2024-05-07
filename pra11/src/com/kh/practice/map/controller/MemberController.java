package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	
	private HashMap<String,Member> map = new HashMap<>();
	
	
	
	public boolean joinMembership(String id, Member m) {
		if(!map.containsKey(id)) {
			map.put(id, m);
			return true;
		} else {
			return false;
		}
	}
	public String login(String id, String password) {
		if(map.containsKey(id)) {
			Member m = map.get(id);
			if(m.getPassword().equals(password)) {
				return m.getName();
			}
		}
		return null;
	}

	public boolean changePassword(String id, String oldpw, String newpw) {
		if(map.containsKey(id)) {
			Member m = map.get(id);
			if(m.getPassword().equals(oldpw)) {
				m.setPassword(newpw);
				return true;
			}
		}
		return false;
	}
	public void changeName(String id, String newName) {
		if(map.containsKey(id)) {
			Member m = map.get(id);
			m.setName(newName);
		}
	}
	public TreeMap<String,String> sameName(String name){
		TreeMap<String,String> sameNameMap = new TreeMap<>();
		map.forEach((k, v) ->{
			if(v.getName().endsWith(name)) {
				sameNameMap.put(k, v.getPassword());
			}
		});
		return sameNameMap;
	}




















}
