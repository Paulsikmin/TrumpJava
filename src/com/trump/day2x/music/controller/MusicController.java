package com.trump.day2x.music.controller;

import java.util.List;

import com.trump.day2x.music.model.MusicManage;
import com.trump.day2x.music.model.vo.Music;
import com.trump.day2x.music.view.MusicView;

public class MusicController {
	// TODO Manage와 View 연결해주는 곳
	public static void main(String[] args) {
		MusicManage manage = new MusicManage();
		MusicView view = new MusicView();
		finish:
		while(true) {
			int menu = view.mainMenu();
			switch(menu) {
			case 1: 
				// 1. 마지막 위치에 곡 추가
				Music music = view.inputMusic();
				manage.registerMusic(music);
				break;
			case 2: 
				// 2. 첫 위치에 곡 추가
				music = view.inputMusic();
				manage.registerMusicAtFirst(music);
				// registerMusicAtFirst
				break;
			case 3: 
				// 3. 전체 곡 목록 출력
				List<Music> mList = manage.getAllMusic();
				if(mList.size() > 0) {
					view.printMusicInfo(mList);
				}else {
					view.printMsg("정보가 존재하지 않습니다.");
				}
				break;
			case 4: 
				// 4. 특정 곡 검색
				// 곡명을 입력 받고
				String title = view.inputTitle("검색");
				// mList에서 찾아서
				music = manage.searchMusicByTitle(title);
				// View를 이용하여 출력
				if(music != null) {
					view.printMusicInfo(music);
				}else {
					view.printMsg("검색 결과가 없습니다.");
				}
				break;
			case 5: 
				// 5. 특정 곡 정보수정
				// 곡명 입력 받기
				title = view.inputTitle("수정");
				// 수정할 위치 찾기
				int index = manage.searchIndexByTitle(title);
				if(index > -1) {
					// 수정할 정보 입력받고
					music = manage.searchMusicByTitle(title);
					music = view.modifyMusic(music);
					// 수정하기
					manage.modifyMusic(index, music);
				}else {
					view.printMsg("정보가 존재하지 않습니다.");
				}
				break;
			case 6: 
				// 6. 특정 곡 삭제
				title = view.inputTitle("삭제");
				music = manage.searchMusicByTitle(title);
				if(music != null) {
					manage.deleteMusic(music);
				}else {
					view.printMsg("정보가 존재하지 않습니다.");
				}
				break;
			case 7: 
				// 7. 곡명 오름차순 정렬
				manage.sortByTitleASC();
				view.printMsg("곡명 오름차순 정렬완료");
				break;
			case 8: 
				// 8. 곡명 내림차순 정렬
				manage.sortByTitleDESC();
				view.printMsg("곡명 내림차순 정렬완료");
				break;
			case 9: 
				manage.sortBySingerASC();
				view.printMsg("가수명 오름차순 정렬완료");
				break;
			case 10: 
				manage.sortBySingerDESC();
				view.printMsg("가수명 내림차순 정렬완료");
				break;
			case 0: break finish;
			}
		}
	}
}
