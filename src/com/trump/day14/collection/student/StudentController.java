package com.trump.day14.collection.student;

import java.util.List;

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		end: 
		while(true) {
			int choice = view.printMenu();
			switch(choice) {
			case 1 : 
				Student student = view.inputStudent();
				manage.registerStudent(student);
				break;
			case 2 :
				String name = view.inputName("검색");
				List<Student> searchList 
					= manage.searchListByName(name);
				view.displayStudents(searchList);
				break;
			case 3 : 
				List<Student> sList = manage.selectAllStudents();
				view.displayStudents(sList);
				break;
			case 5:
				name = view.inputName("삭제");
				int index = manage.searchIndexByName(name);
				manage.deleteStudent(index);
				break;
			case 0 : 
				view.displayMsg("프로그램이 종료되었습니다.");
				break end;
			}
		}
	}
}
