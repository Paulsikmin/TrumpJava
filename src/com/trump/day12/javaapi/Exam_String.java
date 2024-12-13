package com.trump.day12.javaapi;

public class Exam_String {
	public static void main(String[] args) {
		String msg = "Hello";
		if("Hello" == msg) // 상수풀에 있는 값을 재사용
			System.out.println("같은 값임");
		String data = new String("Hello");
		if(msg == data) // 새로운 객체 생성되어 비교 오류 -> eqauls를 사용해야함.
			System.out.println("같은 값임");
		else
			System.out.println("다른 값임");
		
		System.out.println();
		// String 객체가 가지고 있는 유용한 메소드
		// 문자열 길이
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		System.out.println(data1 + "의 길이는 " + data1.length()+"입니다.");
		System.out.println(data2 + "의 길이는 " + data2.length()+"입니다.");
		System.out.println();
		// 문자열이 포함되어 있는지 체크
		System.out.println(data1 + "에 #이 있는가? : " + data1.contains("#"));
		System.out.println();
		// 문자열 연결
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : " + data1);
		System.out.println();
		// 문자열 공백 제거
		System.out.println("문자열 공백 제거 전 : " + data1.length());
		data1 = data1.trim();
		System.out.println("문자열 공백 제거 후 : " + data1.length());
		System.out.println();
		// 문자열 교체 C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 확인 : " + data1);
		System.out.println();
		// 문자열 자르기1 - 기준 문자열 전후로 잘라서 배열에 넣어줌
		String [] words = data1.split(",");
		for(int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		for(String word : words) 
			System.out.println(word);
		System.out.println();
		// 문자열 자르기 2 - 인덱스값을 기준으로 자르기
		System.out.println("문자열 자르기 전 : " + data1);
		//data1 = data1.substring(0, 4);
		data1 = data1.substring(4);
		System.out.println("문자열 자르기 후 : " + data1);
		
		// 문자열 -> 문자로 만들기
		char word = data1.charAt(0);
		System.out.println("문자열 -> 문자 : " + word);
		
	}
}











