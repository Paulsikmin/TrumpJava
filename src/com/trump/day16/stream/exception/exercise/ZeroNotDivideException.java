package com.trump.day16.stream.exception.exercise;

public class ZeroNotDivideException extends RuntimeException {
	/*
	 * 사용자 정의 예외
	 * 표준 예외 클래스로도 많은 예외상황을 표현할 수 있으나 
	 * 특정 오류나 메시지를 강조하고 싶을 때 직접 예외 클래스를 만들어서 사용가능
	 * 단, 만들기 전에 내가 만드는 예외 클래스가 Checked인지 Unchecked인지 결정해야 함. 
	 * Checked Exception으로 만드려면 Exception 클래스를 상속받게 하고
	 * Unchecked Exception으로 만드려면 RuntimeException 클래스를 상속받으면 됨.
	 * 
	 */
	
	public ZeroNotDivideException() {
		super();
	}
	public ZeroNotDivideException(String message) {
		super(message);
	}
}
