package com.trump.day2x.enumex;

interface University {
	int SEOUL = 1;
	int YONSEI = 2;
	int KOREA = 3;
}

enum Major {
	KOREAN, MATH, ENGLISH, SCIENCE
}

//interface Major {
//	int KOREAN = 1;
//	int MATH = 2;
//	int ENGLISH = 3;
//	int SCIENCE = 4;
//}

public class Exam_Enum2 {
	public static void main(String[] args) {
		Major major = Major.MATH;
		//major = University.YONSEI; // 원래는 Major의 값이 아니면 
								     // 들어가지 못하도록 체크해줘야함.
									 // enum타입으로 쓰면서 타입안정성 보장됨.
		switch(major) {
		case KOREAN: 
			System.out.println("국어전공");
			break;
		case MATH: 
			System.out.println("수학전공");
			break;
		case ENGLISH: 
			System.out.println("영어전공");
			break;
		case SCIENCE: 
			System.out.println("과학전공");
			break;
		}
	}
}















