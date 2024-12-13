package com.trump.day13.oop;

// 저장하고 로드하는 기능 클래스
public class StudentManage {
	private Student []  students;
	private int 		index;
	
	public StudentManage() {
		students = new Student[3];
		index = 0;
	}
	
	public void insertStudent(Student student) {
		students[index] = student;
		index++;
	}
	public Student [] getStudents() {
		return students;
	}
}


















