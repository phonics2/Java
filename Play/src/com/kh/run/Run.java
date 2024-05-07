package com.kh.run;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {

//		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//
//		ex.
//		4 1 3 6 9 5 8 10 7 2 

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			for (int j = 0; j <= i; j++) {
				if (arr[i] == arr[i - j]) {
					i--;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
}
