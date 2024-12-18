package com.trump.day16.stream.exception;

import com.trump.day16.stream.exception.exercise.ZeroNotDivideException;

public class Exam_Exception {
	/*
	 * 1. 예외처리란 무엇인가?
	 * 2. 예외의 종류는 무엇이 있는가?
	 * 3. Checked/Unchecked Exception의 차이는 무엇인가?
	 * 4. 예외의 최고 조상 클래스는 무엇인가?
	 * 5. 예외처리 방법
	 *  - try ~ catch문 사용하여 발생한 곳에서 직접 처리
	 *  - throws를 사용하여 예외 회피
	 */
	public static void main(String[] args) {
		try {
			int result = divNum(10, 0);
		//} catch (ArithmeticException e) {
		} catch (ZeroNotDivideException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	//public static int divNum(int data1, int data2) throws ArithmeticException {
	public static int divNum(int data1, int data2) throws ZeroNotDivideException {
		/*
		 * 나누기를 할 때에는 0으로 나눌때의 경우를 대비를 해야함.
		 * 자바에서는 try ~ catch 예외처리임.(아래 주석으로 된 코드 참고)
		 * 그런데 0으로 나눌때의 경우를 대비하는 것을 회피할 수 있는 방법이 있음.
		 * 밑에 코드처럼 try ~ catch로 감싸지 않고 throws로 발생할 수 있는 예외를
		 * 회피함. 그래서 try ~ catch를 안써도 됨.
		 * 그러면 try ~ catch 어디서 해주어야 하는가는 main 메소드를 보면 
		 * 알 수 있음. main메소드는 divNum() 메소드를 호출하고 있음.
		 * 호출하면 회피된 예외를 처리를 해줘야 함.
		 * 그래서 try ~ catch가 main() 메소드에 있는 것이다.
		 * 
		 */
		if(data2 == 0) {
			throw new ZeroNotDivideException("ZeroNotDivide");
		}
		int result = data1/data2;
		return result;
//		int result = 0;
//		try {
//			result = data1/data2;
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
	}
}

















