package com.trump.day14.collection.list;

import java.util.ArrayList;
import java.util.List;

public class Exam_ListCollection {
	
	public static void main(String [] args) {
		/*
		 * List 인터페이스가 있음.
		 * List 인터페이스를 구현하여 만든 클래스가 있음.
		 * 데이터의 순서를 유지하고 중복 저장 가능하도록 함.
		 * ArrayList 클래스를 사용하여 구현할 수 있음.
		 */
		List<String> nameList = new ArrayList<String>();
		nameList.add("챗지피티");
		nameList.add("클로드");
		nameList.add("코파일럿");
		
		for(int i = 0; i < nameList.size(); i++) {
			String result = nameList.get(i);
			System.out.println(result);
		}
		nameList.remove(0);
		System.out.println();
		for(int i = 0; i < nameList.size(); i++) {
			String result = nameList.get(i);
			System.out.println(result);
		}
		nameList.add(0, "챗지피티");
		nameList.add("퍼플렉시티");
		nameList.add("라마");
		System.out.println();
		for(int i = 0; i < nameList.size(); i++) {
			String result = nameList.get(i);
			System.out.println(result);
		}
		System.out.println("크기 : " + nameList.size());
		System.out.println("비움여부 : " + nameList.isEmpty());
		nameList.clear();
		System.out.println("크기 : " + nameList.size());
		System.out.println("비움여부 : " + nameList.isEmpty());
	}
	
	public void genericSample() {
		GenericList<String> strList = new GenericList<String>();
		strList.add("챗지피티");
		strList.add("클로드");
		strList.add("코파일럿");
		
		System.out.println("크기 : " + strList.size());
		String chatgpt = strList.get(0);
		System.out.println(chatgpt);
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		System.out.println();
		GenericList<Object> objList = new GenericList<Object>();
		objList.add("네이버");
		objList.add("라인");
		objList.add("토스");
		String naver = (String)objList.get(0);
		System.out.println(naver);
		System.out.println(objList.get(1));
		System.out.println(objList.get(2));
	}
	
	public void objListSample() {
		ObjectList objList = new ObjectList();
		objList.add(5.7);
		objList.add(1225);
		objList.add("크리스마스");
		
		double nums = (double)objList.get(0);
		int end 	= (int)objList.get(1);
		String msg  = (String)objList.get(2);
		
		System.out.println(objList.get(0));
		System.out.println(objList.get(1));
		System.out.println(objList.get(2));
	}
	
	public void intListSample() {
		IntList numList = new IntList();
//		numList[0] = 11;
		numList.add(11);
		numList.add(18);
		numList.add(52);
		System.out.println("크기 : " + numList.size());
		System.out.println(numList.get(0));
		System.out.println(numList.get(1));
		System.out.println(numList.get(2));
		numList.clear();
		System.out.println("크기 : " + numList.size());
	}
}
