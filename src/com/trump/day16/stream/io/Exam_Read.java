package com.trump.day16.stream.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class Exam_Read {
	public static void main(String[] args) { // 메인을 기준으로 입출력 판단필요
		// 파일 읽어라~
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini"); // InputStream은 최상위 클래스, 업캐스팅 적용
			Reader fr = new FileReader("src/com/trump/day16/stream/exercise/Exercise_MemoPad.java");
			
			int readCount;
			byte [] readBytes = new byte[1024];
			readCount = is.read(readBytes);
			String result = new String(readBytes, 0, readCount); // 배열이 크면 한번에 읽어올 수 있어서 반복하지 않아도 되나
																 // 파일이 크기가 크면 반복하여 읽어와야 한다.
			System.out.println(result);	// 결과 출력, system.ini파일 내용 출력
			is.close();					// 자원 해제
			
			int readChar;
			char [] readChars = new char[1024];
			while((readChar = fr.read(readChars)) != -1) {
				result += new String(readChars, 0, readChar);
			}
			System.out.println(result);
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
