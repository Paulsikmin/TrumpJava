package com.trump.day15.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_InputStreamRead {
	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:\\Windows\\system.ini");
			int readByte;
			// #1
			while((readByte = is.read()) != -1) {
				System.out.print((char)readByte);
			}
			// #2
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);
			// #3
			while(true) { // 언제까지?? 다 읽을때까지 -> 다 읽은건 어떻게 알지? -> is.read() == -1
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
			// #4
			for(;;) { // 언제까지?? 다 읽을때까지 -> 다 읽은건 어떻게 알지? -> is.read() == -1
				readByte = is.read();
				if(readByte == -1) break;
				System.out.print((char)readByte);
			}
			is.close();
			//is.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
