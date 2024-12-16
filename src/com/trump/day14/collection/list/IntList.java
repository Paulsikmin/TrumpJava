package com.trump.day14.collection.list;

public class IntList {
	int [] nums;
	int size;
	
	public IntList() {
		nums = new int[3];
		size = 0;
	}
	
	public void add(int num) {
		nums[size] = num;
		size++;
	}
	
	public int get(int index) {
		return nums[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		nums = new int[3];
		size = 0;
//		for(int i = 0; i < nums.length; i++)
//			nums[i] = 0;
//		nums[0] = 0;
//		nums[1] = 0;
//		nums[2] = 0;
	}
}
