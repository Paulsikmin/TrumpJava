package com.trump.day12.javaapi;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Exam_Date {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
		// ============ 권장사항 =============
		Calendar calendar = new GregorianCalendar();
		System.out.println(calendar.getTime());
		String changed = sdf.format(calendar.getTime());
		System.out.println("그레고리안 달력 날짜 변환 : " + changed);
		
		Date date = new Date();
		System.out.println(date);
		String transDate1 = sdf.format(date);
		System.out.println(transDate1);
		String transDate2 = sdf2.format(date);
		System.out.println(transDate2);
	}
}
