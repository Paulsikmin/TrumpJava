package com.trump.day15.stream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_ReaderReadChar {
	public static void main(String[] args) {
		
		try {
			Reader reader = new FileReader("C:\\Windows\\system.ini");
			int readCount;
			char [] cBuf = new char[3];
			String result = "";
			while((readCount = reader.read(cBuf)) != -1) {
				//System.out.print((char)readCount);
				result += new String(cBuf, 0, readCount);
			}
			System.out.println(result);
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
