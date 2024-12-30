package com.trump.day2x.music.model.vo;

import java.util.Comparator;

public class DescTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		return o1.getTitle().compareTo(o2.getTitle()) * -1; // 1, 0, -1
	}

}
