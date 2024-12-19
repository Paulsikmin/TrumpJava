package com.trump.day16.file;

import java.io.File;

public class Exam_File2 {
	public static void main(String[] args) {
		/*
		 * C:\Windows\Web\Wallpaper\Windows\img0.jpg 파일의
		 * 파일명, 파일용량, 상위폴더, 저장절대경로, 저장상대경로을 출력하시오.
		 */
		File image = new File("src/com/trump/day15/stream/inputstream/Exam_InputStreamReadByteOff.java");
		System.out.println("파일명 : " 		 + image.getName());
		System.out.println("파일용량 : " 	 + image.length());
		System.out.println("상위폴더 : " 	 + image.getParent());
		System.out.println("저장절대경로 : " + image.getAbsolutePath());
		System.out.println("저장상대경로 : " + image.getPath());
	}
}
