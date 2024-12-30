package com.trump.day2x.enumex;

public class Exam_ColorEnum {
	public enum Color {
		/*
		 * RED,GREEN,BLUE
		 */
		RED("빨강"), GREEN("초록"), BLUE("파랑"); // 세미콜론
		
		private String korName;
		
		private Color(String korName) {
			this.korName = korName;
		}
		
		public String getKorName() {
			return korName;
		}
	}
	
	public static void main(String[] args) {
		Color myColor = Color.RED;
		// myColor = Color.YELLOW; -> 타입안정성 보장
		// String color = "YELLOW";
		printColor(myColor);
	}
	
	static void printColor(Color color) {
		switch(color) {
			case RED: 
				System.out.println("빨강");
				break;
			case GREEN: 
				System.out.println("초록");
				break;
			case BLUE: 
				System.out.println("파랑");
				break;
		}
	}
}
