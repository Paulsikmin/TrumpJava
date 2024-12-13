package com.trump.day13.oop;

public class StudentController {
	public static void main(String [] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		exit:
		while(true) {
			int choice = view.mainMenu();
			switch(choice) {
			case 1: 
				Student student = view.inputStudentData();
				manage.insertStudent(student);
				break;
			case 2: 
				Student [] students = manage.getStudents();
//				for(int i = 0; i < 3; i++) {
//					view.printStudentData(students[i]);					
//				}
				view.printStudentData(students[0]);
//				view.printStudentData(students[1]);
//				view.printStudentData(students[2]);
				break;
			case 3: 
				view.displayMessage("프로그램이 종료되었습니다.");
				break exit;
			default: view.displayMessage("1 ~ 3 사이의 수를 입력해주세요.");
			}
		}
	}
}
