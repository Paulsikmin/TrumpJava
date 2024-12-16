package com.trump.day14.collection.student;

import java.util.List;
import java.util.Scanner;

public class StudentView implements ViewInterface{

	@Override
	public Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int firstScore = sc.nextInt();
		System.out.print("2차 점수 : ");
		int secondScore = sc.nextInt();
		Student student 
			= new Student(name, firstScore, secondScore);
		return student;
	}

	@Override
	public void displayStudents(List<Student> stdList) {
		// TODO Auto-generated method stub
		System.out.println("====== 학생 전체정보 출력 ======");
		for(int i = 0; i < stdList.size(); i++) {
			System.out.println(stdList.get(i).toString());
		}
	}

	@Override
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
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
	public void displayMsg(String msg) {
		System.out.println(msg);
	}

	@Override
	public String inputName(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	@Override
	public Student modifyStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}


}
