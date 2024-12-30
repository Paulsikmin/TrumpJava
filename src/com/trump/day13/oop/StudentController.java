package com.trump.day13.oop;

/*
 * View와 Manage 서로 메시지 전달을 통해서 상호작용을 해야하는데
 * 중간에 있어서 그 View와 Manage 연결하는 역할을 하는 클래스임.
 * View -> Controller -> Manage : 데이터 입력 후 저장
 * Manage -> Controller -> View : 데이터 로드 후 출력
 */
public class StudentController {
	public static void main(String [] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		exit:
		while(true) {
			// 메뉴를 출력하기 위해서 mainMenu()를 호출하고
			// 입력받은 숫자가 리턴될 것이기 때문에 int 변수로 받음.
			int choice = view.mainMenu();
			// 해당 선택에 따라 다르게 동작하도록 하기위해서
			// switch ~ case문 사용
			switch(choice) {
			case 1: 
				// 1번을 누르면 성적 입력이 동작
				// 데이터를 입력받기 위해서 view에 있는
				// inputStudentData() 메소드를 호출하였고
				// 입력받은 데이터가 리턴될 것이기 때문에 Student 변수로 받음.
				Student student = view.inputStudentData();
				// 넘겨받은 student객체를 저장하기 위해서
				// manage에 있는 insertStudent()를 호출하고 전달해줌.
				// student를 전달해줌.
				manage.insertStudent(student);
				break;
			case 2: 
				// 2번을 누르면 성적 출력이 동작
				// 성적 출력을 하려면 그동안 저장했었던 데이터를
				// 로드해야함.
				// manage에 있는 getStudents()메소드를 호출하면
				// 모든 데이터가 리턴될 것이고 그 데이터의 타입은 Student []
				// 이기 때문에 Student [] 변수로 받음
				Student [] students = manage.getStudents();
//				for(int i = 0; i < 3; i++) {
//					view.printStudentData(students[i]);					
//				}
				// 넘어온 데이터를 모두 출력하기 위해서
				// 데이터를 전달해줌. view에 있는 printStudentData()
				// 메소드에 전달해줌.
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
