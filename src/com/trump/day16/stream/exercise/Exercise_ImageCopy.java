package com.trump.day16.stream.exercise;

import java.io.*;

public class Exercise_ImageCopy {
	/*
	 * C:\Windows\Web\Wallpaper\Windows\img0.jpg를 복사해서
	 * C:\Temp\copyimg.jpg로 만들어주세요.
	 * 단, 바이트 기반 스트림을 사용하세요.
	 */
	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			// 입력스트림을 사용해서 읽어와야해. 코드를 적어
			is = new FileInputStream("C:\\Windows\\Web\\Wallpaper\\Windows\\img0.jpg");
			os = new FileOutputStream("C:\\Temp\\copyimg.jpg");
			int readCount;
			byte [] readBytes = new byte[1024];
			while(true) {
				readCount = is.read(readBytes);
				if(readCount == -1) break; // 다 읽었으면 멈춰
				// 읽은 내용은 목적지 파일에 저장해야해. 코드를 적어
				os.write(readBytes, 0, readCount);
				// flush() 해주어야해. 코드를 적어
				os.flush();
			}
			System.out.println("파일 복사 완료");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close() 해주어야해. 코드를 적어
			try {
				os.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}






















