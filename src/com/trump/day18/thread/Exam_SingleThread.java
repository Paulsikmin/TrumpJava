package com.trump.day18.thread;

public class Exam_SingleThread {
	public static void main(String[] args) { // main메소드도 쓰레드
		// 싱글쓰레드의 경우 순차적으로 실행됨
		// - 한 작업이 완전히 끝나야 다음 작업 시작
		printNumbers();	 // 숫자 출력
		downloadFiles(); // 파일 다운로드
	}
	
	static void printNumbers() {
		for(int i = 1; i <= 5; i++) {
			System.out.println("숫자 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	static void downloadFiles() {
		String [] files 
			= {"document.pdf", "image.jpg", "video.mp4"};
		for(String file: files) {
			System.out.println(file + " 다운로드 중...");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
























