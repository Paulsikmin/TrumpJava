package com.trump.day15.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriterWriteStr {
	public static void main(String[] args) {
		try {
			Writer fw = new FileWriter("src/com/trump/day15/stream/writer/writing2.txt");
			fw.write("자바/오라클/스프링");
			fw.flush();
			fw.close();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
