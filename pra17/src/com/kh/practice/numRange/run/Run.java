package com.kh.practice.numRange.run;

import com.kh.practice.numRange.exception.NumRangeException;
import com.kh.practice.numRange.view.NumberMenu;

public class Run {
	public static void main(String[] args) throws NumRangeException {
		NumberMenu nm = new NumberMenu();
		nm.menu();
	}
}
