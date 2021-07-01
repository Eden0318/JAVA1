package ams;

import java.util.Iterator;

public class AmsField {
	//항공사, 항공기번호, 최대승객수, 출발지, 도착지
	
	//5개(항공사, 항공기번호, 최대승객수, 출발지, 도착지)의 특징을 가진 비행기 여러대
	//한 행이 하나의 비행기에 대한 정보, 한 열이 그 주제.
	String [][]arrPlane = new String[100][5]; 
	int cnt;
	int rLength = cnt;
	int cLength = arrPlane[0].length;
	
	//추가하기
	void insert(String [] arPlane) {
		arrPlane[cnt] = arPlane; 
		cnt++;
		
	}
	
	  
	//검색
	void search(String keyword) {
		for (int i = 0; i < rLength; i++) {
			if(keyword.equals(arrPlane[i][0])) {
				
			}
		}
	}
	
	
	//수정하기
	void update() {
		
	}
	
	//삭제하기
	void delete() {
		
	}
	
	//"목록보기
	String show() {
		
		String result = "항공사, 항공기번호, 최대승객수, 출발지, 도착지";
		
		for (int i = 0; i < rLength; i++) {
			result += "♥";
			for (int j = 0; j < cLength; j++) {
				
				result += j==cLength-1? arrPlane[i][j] : arrPlane[i][j]+ ",  ";
			}
			result += "\n";
		}
		if(cnt == 0) result="목록 없음";
		return result;
	}
	
	//검색결과 보기
	void show(int[]arIndex) {
		
	}

}
