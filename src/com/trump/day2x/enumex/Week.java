package com.trump.day2x.enumex;

public enum Week {
	MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	// 주중, 주말 체크하는 메소드
	public boolean isWeekEnd() {
		return this == SATURDAY || this == SUNDAY;
	}
}
