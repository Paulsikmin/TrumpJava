package com.trump.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterWriteChar {
	public static void main(String[] args) {
		try {
			Writer fw = new FileWriter("src/com/trump/day15/stream/writer/writing.txt");
			char [] cArrs = "프론트엔드/백엔드".toCharArray();
			fw.write(cArrs);
			fw.flush();
			fw.close();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
