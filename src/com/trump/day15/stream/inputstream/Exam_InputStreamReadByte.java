package com.trump.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_InputStreamReadByte {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini");
			int readByte;
			byte [] readBytes = new byte[3];
			String result = "";
			while((readByte = is.read(readBytes)) != -1) {
				// readByte는 읽은값이 출력되는 것이 아니라
				// 읽은 갯수를 출력함.
				//System.out.println((char)readByte);
				// readBytes는 읽은 값을 가지고 있음 
				// 나는 문자열로 출력을 해야함.
				// 바이트 배열 -> 스트링으로 변환되어야함. 
				// "1" -> 1, Integer.parseInt("1");
				result += new String(readBytes, 0, readByte);
			}
			System.out.println(result);
			is.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
