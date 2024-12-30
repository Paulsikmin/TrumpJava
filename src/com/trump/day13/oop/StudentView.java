package com.trump.day13.oop;

import java.util.Scanner;

// 메뉴, 메시지, 데이터 입력, 출력 하는 기능 클래스
/*
 * 메인메뉴를 출력하는 것부터 시작함.
 * 메뉴, 메시지, 데이터 입출력을 담당하는 클래스로 View클래스 생성
 * 
 */
public class StudentView {
	private Scanner sc;
	
	public StudentView() {
		this.sc = new Scanner(System.in);
	}
	
	/*
	 * 메인메뉴를 출력하는 메소드로
	 * Controller에서 호출함.
	 * 리턴형이 왜 int인가? 메뉴를 출력해서 숫자를
	 * 입력받으면 그 받은 숫자가 Controller에서 사용되어야함.
	 * (return choice;를 사용해야하고 return choice를 사용하면
	 * void -> int로 작성해야 함.)
	 */
	public int mainMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	/*
	 * 리턴형은 왜 Student인가?
	 * 매개변수는 왜 없는가?
	 * inputStudentData() 메소드는 데이터를 입력받는 역할
	 * 전달받아서 뭐하는게 없으니 매개변수도 없음
	 * 리턴형 Student는 왜 있는가?
	 * 데이터를 입력받았으면 사용하는 곳에서 사용할 수 있도록
	 * 해줌.
	 * Controller에서 호출을 함. 호출할 때 입력받은 데이터가
	 * 넘어올거야 라고 기대함.
	 * 입력받은 데이터를 넘겨주어야 하고 
	 * 넘겨주려면 return student를 써야함. student 변수의 타입을
	 * void -> Student로 변경해주어야 하기 때문에 리턴형이 Student임.
	 */
	public Student inputStudentData() {
		System.out.println("====== 성적 입력 ======");
		Student student = new Student();
		System.out.print("이름 : ");
		String name = sc.next();
		student.setName(name);
		System.out.print("국어 : ");
		student.setKor(sc.nextInt());
		System.out.print("영어 : ");
		student.setEng(sc.nextInt());
		System.out.print("수학 : ");
		student.setMath(sc.nextInt());
		return student;
	}
	/*
	 * Controller에서 호출함. 
	 * 왜 매개변수를 Student로 가지고 있나요?
	 * printStudentData() 메소드는 출력을 담당함.
	 * 출력할 때 전달받은 데이터를 출력함. 
	 * 데이터를 전달 받으려면 Student 매개변수가 있어야함.
	 */
	public void printStudentData(Student student) {
		System.out.println("====== 성적 출력 ======");
		System.out.println("이름 : " + student.getName());
		System.out.println("국어 : " + student.getKor());
		System.out.println("영어 : " + student.getEng());
		System.out.println("수학 : " + student.getMath());
		System.out.println("총점 : " + student.total());
		System.out.println("평균 : " + student.avg());
	}

	/*
	 * Controller에서 호출함.
	 * 출력하고 싶은 메시지를 전달받아서 출력함.
	 * 전달받으니까 매개변수 있어야 하고
	 * 전달받는게 String이기 때문에 String message가 매개변수임.
	 */
	public void displayMessage(String message) {
		System.out.println(message);
	}
}




