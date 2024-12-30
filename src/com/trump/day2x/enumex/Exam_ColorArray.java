package com.trump.day2x.enumex;

public class Exam_ColorArray {
	public static void main(String[] args) {
		// 문자열 배열 사용하여 빨초파 저장
		String [] colors = {"RED", "GREEN", "BLUE"};
		String color = "YELLOW";
		printColor(color);
	}
	
	static void printColor(String color) {
		if("RED".equals(color)) {
			System.out.print("빨강");
		}else if("GREEN".equals(color)) {
			System.out.println("초록");
		}else if("BLUE".equals(color)) {
			System.out.println("파랑");
		}else {
			System.out.println("잘못된 색상");
		}
	}
}
