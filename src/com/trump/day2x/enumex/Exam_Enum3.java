package com.trump.day2x.enumex;

public class Exam_Enum3 {
	public static void main(String[] args) {
		Season spring = Season.SPRING;
		
		// 열거형 상수의 이름과 한글 이름 출력
		System.out.println(spring);
		System.out.println(spring.getSeason());
		System.out.println();
		// 모든 열거형 상수의 이름과 한글 이름 출력
		for(Season season: Season.values()) {
			System.out.println("현재 계절: " + season
					+ ", 한글 이름 : " + season.getSeason());
		}
	}
}
