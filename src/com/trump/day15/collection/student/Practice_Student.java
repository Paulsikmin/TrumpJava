package com.trump.day15.collection.student;

import java.util.Scanner;

public class Practice_Student {
	/*
	 *  # 재평가 기준 안내
			## 기본 원칙
			
			1. 재평가 여부는 1차, 2차 시험에서 각각 독립적으로 결정됩니다.
			2. 각 시험에서 40점 미만인 경우 과락으로 재평가 대상이 됩니다.
			3. 1차와 2차 점수의 평균이 60점을 넘어야 최종 통과입니다.
			4. 평균이 60점 미만일 경우, 60점 미만인 과목만 재평가를 봅니다.
			
			## 예시 케이스
			
			### 케이스 1: 평균 60점, 재평가 없음
			
			- 1차 점수: 60점
			- 2차 점수: 60점
			- 결과: 평균 60점으로 통과, 재평가 대상 아님
			
			### 케이스 2: 평균 60점, 2차 재평가
			
			- 1차 점수: 100점
			- 2차 점수: 20점
			- 결과: 2차 시험만 재평가 대상 (과락)
			
			### 케이스 3: 평균 59.5점, 1차 재평가
			
			- 1차 점수: 59점
			- 2차 점수: 60점
			- 결과: 1차 시험만 재평가 대상 (60점 미만)
			
			## 결론
			
			1. 1차와 2차 평균이 60점 이상이어야 합니다.
			2. 평균이 60점 이상이더라도 과락이 있으면 해당 시험은 재평가를 봅니다.
			3. 평균이 60점 미만이면 60점 미만인 과목만 재평가를 봅니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1차 점수 입력 : ");
		int firstScore = sc.nextInt();
		System.out.print("2차 점수 입력 : ");
		int secondScore = sc.nextInt();
		double avg = (firstScore + secondScore)/2.0;
		if(avg >= 60) {
			if(firstScore < 40) {
				System.out.println("1차 시험 재평가");
			}else if(secondScore < 40) {
				System.out.println("2차 시험 재평가");
			}else {
				System.out.println("모두 통과하셨습니다.");
			}
		}else {
			if(firstScore < 60) {
				System.out.println("1차 시험 재평가");
			}
			if(secondScore < 60) {
				System.out.println("2차 시험 재평가");
			}
		}
	}
}
