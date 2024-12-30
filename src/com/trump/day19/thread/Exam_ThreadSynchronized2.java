package com.trump.day19.thread;

public class Exam_ThreadSynchronized2 {
	public static void main(String[] args) {
		SharedBoard1 board = new SharedBoard1();
		Thread th1 = new StudentThread1("Starbucks", board);
		Thread th2 = new StudentThread1("MGC", board);
		th1.start();
		th2.start();
	}
}

class StudentThread1 extends Thread{
	// 필드, 멤버변수
	private SharedBoard1 board;
	// 생성자, 기본생성자
	public StudentThread1() {
		
	}
	// 매개변수가 있는 생성자
	public StudentThread1(String name, SharedBoard1 board) {
		super(name);
		this.board = board;		
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			board.add();
		}
	}
}

class SharedBoard1 {
	private int sum = 0; // 집계판의 합
	public void add() {
		int n = sum;
		Thread.yield(); // 현재 실행중인 스레드 양보
		n += 10; 		// 10증가
		sum = n;		// 증가한 값을 집계함에 기록
		System.out.println(
				Thread.currentThread().getName() 
									+ " : " + sum);
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	public int getSum() {
		return sum;
	}
}






