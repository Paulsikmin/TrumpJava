package com.trump.day12.wrapperpkg;

public class Exam_Wrapper {
	public static void main(String [] args) {
		int num = 10;
		num = 1118;
		Integer su = null;
		//su = new Integer(10); // the constructor Integer(int) has been deprecated since version 9 and marked for removal
		su = Integer.valueOf(502); // 원칙 Integer <= Integer
		if(su != null) {
			su = 1225;	// 오토-박싱(auto-boxing)
		}
		num = su.intValue(); // 원칙 int <= Integer
		num = su;		// 오토-언박싱(auto-unboxing)
		Double du = Double.valueOf(11.18);
		du = 5.02;
		double dNum = du.doubleValue();
		dNum = du;
		// Wrapper 클래스를 쓰는 이유
		// 1. Null체크가 가능해짐, int -> 0, double -> 0.0, String -> null => 모두다 널로 체크 가능
		// 2. 형변환 가능, String -> int, String -> boolean
		String openDate = "20241118";
		System.out.println(openDate + 1);
		int openDateNum = Integer.parseInt(openDate);
		System.out.println(openDateNum + 1);
		
		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('b'));
		char c1 = '5', c2 = 'F';
		if(Character.isDigit(c1))
			System.out.println("숫자입니다.");
		if(Character.isAlphabetic(c2))
			System.out.println("영문자입니다.");
		// ================= 문자열로 바꾸기 =====================
		/*
		 * 1. String.valueOf(1);
		 * 2. +"" 붙이기
		 * 3. .toString()
		 */
		System.out.println(1);
		System.out.println(String.valueOf(1) 
								instanceof String);
		System.out.println(1+"" instanceof String);
		System.out.println(Integer.valueOf(1).toString()
				instanceof String);
	}
}













