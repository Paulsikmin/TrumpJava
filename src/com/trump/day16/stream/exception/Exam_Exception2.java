package com.trump.day16.stream.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Exam_Exception2 {
	public static void main(String[] args) {
//		try {
//			Reader reader = new FileReader("C:\\Windows\\system.ini");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			readFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void readFile() throws FileNotFoundException {
		/*
		 * FileReader를 쓸 때에는 파일이 없는 경우를 대비해야 함.
		 * 자바에서는 try ~ catch를 통해서 예외처리 해줌(아래 주석으로 된 코드 참고)
		 * 그런데 파일이 없는 경우를 대비하는 것을 회피할 수 있는 방법이 있음.
		 * 밑에 코드 처럼 try ~ catch로 감싸지 않고 throws로 발생할 수 있는 예외를 회피함.
		 * 그래서 try ~ catch를 안써도 됨.
		 * 그러면 try ~ catch는 어디에선가는 해주어야 함. 그럼 어디서 해주어야 하는가?
		 * main() 메소드를 보면 알 수 있음. main() 메소드는 FileReader를 가지고 객체를 생성하는
		 * readFile() 메소드를 호출하고 있음.
		 * 호출하면 회피된 예외를 처리해줘야 함.
		 * 그래서 try ~ catch가 main() 메소드에 있는 것입니다.
		 * 
		 */
		Reader reader = new FileReader("C:\\Windows\\system.ini");
//		try {
//			Reader reader = new FileReader("C:\\Windows\\system.ini");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
