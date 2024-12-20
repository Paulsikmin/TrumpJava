package com.trump.day18.thread;

class CountUpRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(
					Thread.currentThread().getName() + " : " + i);
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

class CountDownRunnable implements Runnable {
	@Override
	public void run() {
		for(int i = 69; i >= 65; i--) {
			System.out.println(
					Thread.currentThread().getName() 
						+ " : " + (char)i );
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Exam_ThreadRunnable {
	public static void main(String[] args) {
		Thread thread1 
			= new Thread(new CountUpRunnable(), "카운트업 쓰레드");
		Thread thread2 
			= new Thread(new CountDownRunnable(), "카운트다운 쓰레드");
		thread1.start();
		thread2.start();

	}
}










