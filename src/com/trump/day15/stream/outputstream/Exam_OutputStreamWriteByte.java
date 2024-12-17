package com.trump.day15.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_OutputStreamWriteByte {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/trump/day15/stream/outputstream/writing2.txt");
			// "헬로우 입출력" -> 바이트배열, String을 바이트배열로 변환해주어야함.
			byte [] inputBytes = "헬로우 입출력22".getBytes();
//			for(int i=0; i < inputBytes.length; i++) {
//				os.write(inputBytes[i]);
//			}
			os.write(inputBytes);
			os.flush();		// 버퍼비우기
			os.close(); 	// 자원해제
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
