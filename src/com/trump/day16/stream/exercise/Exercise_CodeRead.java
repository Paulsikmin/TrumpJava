package com.trump.day16.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exercise_CodeRead {
	/*
	 * Exam_InputStreamReadByteOff.java 파일을 
	 * 읽어서 콘솔에 출력해보세요.
	 * 단, 문자기반 스트림을 이용하세요!
	 */
	public static void main(String[] args) {
		try {
			Reader fr = new FileReader("src/com/trump/day15/stream/inputstream/Exam_InputStreamReadByteOff.java");
			int readCount;
			char [] cBuf = new char[1024];
			String result = "";
			while(true) {
				readCount = fr.read(cBuf);
				if(readCount == -1) break;
				result += new String(cBuf, 0, readCount);
			}
			System.out.println(result);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
