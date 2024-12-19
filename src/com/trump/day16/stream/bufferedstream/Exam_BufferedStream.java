package com.trump.day16.stream.bufferedstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_BufferedStream {
	public static void main(String[] args) {
		Reader reader = null;
		BufferedReader bReader = null;
		
		try {
			reader = new FileReader("src/com/trump/day16/stream/exercise/Exercise_TextFileCopy.java");
			bReader = new BufferedReader(reader); 	// 보조스트림 객체 생성시 주스트림(reader)을 전달해주어야 함.
//			int readCount;
//			readCount = reader.read(null);
			String line;	// 읽은 데이터를 저장하는 변수
			while((line = bReader.readLine()) != null) // 읽은 값이 없으면 더이상 동작하지 않도록 함.
				System.out.println(line);	// readLine()이라는 보조스트림이 제공하는 메소드 사용해보기
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				bReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
