package com.trump.day18.thread;

public class Exam_Thread1 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				// 전달값으로 밀리초를 받음, 1ms = 1/1000초, 1000ms는 몇초? 500ms는 0.5초
				// Thread.sleep()는 Checked Exception이라 반드시 예외처리 해주어야함.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}
}
