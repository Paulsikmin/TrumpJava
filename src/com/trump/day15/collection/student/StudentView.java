package com.trump.day15.collection.student;

import java.util.List;
import java.util.Scanner;

public class StudentView implements ViewInterface{
	
	private Scanner sc;
	
	public StudentView() {
		sc = new Scanner(System.in);
	}

	@Override
	public Student inputStudent() {
		Student student = new Student();
		System.out.println("====== 학생 정보 입력 ======");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("2차 점수 : ");
		int secondScore = sc.nextInt();
		student.setName(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);
		return student;
	}

	@Override
	public String inputName(String category) {
		System.out.print(category + "할 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	@Override
	public Student modifyStudent(Student student) {
		System.out.print("수정할 1차 점수 입력 : ");
		int firstScore = sc.nextInt();
		student.setFirstScore(firstScore);
		System.out.print("수정할 2차 점수 입력 : ");
		int secondScore = sc.nextInt();
		student.setSecondScore(secondScore);
		return student;
	}

	@Override
	public int printMenu() {
		System.out.println("====== 학생 성적관리 프로그램 ======");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 이름 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("6. 재평가 대상 여부 확인");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}

	@Override
	public void displayStudents(List<Student> stdList) {
		System.out.println("====== 학생 전체 정보 출력 ======");
		for(Student std: stdList) {
			System.out.printf("%s 학생의 1차 점수는 %d점, 2차 점수는 %d점 입니다.\n"
					, std.getName(), std.getFirstScore(), std.getSecondScore());
		}
	}

	@Override
	public void displayMsg(String msg) {
		System.out.println(msg);
	}

}


















