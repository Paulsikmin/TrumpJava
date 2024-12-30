package com.trump.day13.oop;

/*
 *  성적관리프로그램이라고 하는 것은 데이터를 입력을 받음
 *  이름이나 점수를 입력을 받음. 입력받을 때 변수로 저장을 하는데
 *  변수로 저장을 하면 클래스 간에 데이터 이동이 어려워짐
 *  그래서 하나의 변수로 모든 데이터를 사용하기 위해서 Student와 같은 클래스 사용.
 *  각각의 변수를 선언해서 그냥 두었다면 클래스는 그 변수들을 모은 것 + 메소드도 함께 존재하는 그런 형태임.
 */

public class Student {
	// 필드
	private String  name;
	private int 	kor;
	private int 	eng;
	private int 	math;
	
	// 메소드 - 생성자
	public Student() {}
	public Student(String name
				, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 메소드
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int total() {
		return kor+eng+math;
	}
	
	public double avg() {
		return this.total()/3.0;
	}
}









