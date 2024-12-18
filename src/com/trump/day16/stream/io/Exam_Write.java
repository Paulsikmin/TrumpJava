package com.trump.day16.stream.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public class Exam_Write {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("src/com/trump/day16/stream11/io/writing.txt");
			Writer fw = new FileWriter("src/com/trump/day16/stream/io/writing2.txt");
			
			byte [] byteArrs = "헬로우 입출력".getBytes();
			os.write(byteArrs);
			os.flush(); // 버퍼비우기
			os.close(); // 자원 해제
			System.out.println("파일 쓰기 완료");
			
			fw.write("문자열 그대로 입력, 배열 변환 필요없음.");
			fw.flush();
			fw.close();
			System.out.println("패키지 클릭 후 F5를 눌러 확인해보세요.");
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
